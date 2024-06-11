package com.pathbreaker.payslip.serviceImpl;

import com.pathbreaker.payslip.entity.Dashboard;
import com.pathbreaker.payslip.repository.DashboardRepository;
import com.pathbreaker.payslip.repository.EmployeeRepository;
import com.pathbreaker.payslip.repository.RelievingRepository;
import com.pathbreaker.payslip.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@Slf4j
public class DashboardServiceImpl implements DashboardService {


    private DashboardServiceImpl(EmployeeRepository employeeRepository,
                                 RelievingRepository relievingRepository,
                                 DashboardRepository dashboardRepository) {
        this.employeeRepository = employeeRepository;
        this.relievingRepository = relievingRepository;
        this.dashboardRepository = dashboardRepository;
    }

    private final EmployeeRepository employeeRepository;

    private final DashboardRepository dashboardRepository;

    private final RelievingRepository relievingRepository;

    @Override
    public List<Dashboard> getEmployees() {
        long totalEmployees = employeeRepository.count();
        System.out.println("Total Employees: " + totalEmployees);
        long relievingEmployees = relievingRepository.count();
        System.out.println("Relieving Employees: " + relievingEmployees);
        long currentEmployees = totalEmployees - relievingEmployees;
        System.out.println("Current Employees: " + currentEmployees);
        List<Dashboard> dashboards = dashboardRepository.findAll();

        for (Dashboard dashboard : dashboards) {
            if (dashboard.getEmployeesCount() != totalEmployees) {
                // If employees are added, print employeesUpdatedDate and update the count
                System.out.println("Employees Added - Updated Date: " + LocalDate.now());
                dashboard.setEmployeesUpdatedDate(LocalDate.now());
                dashboard.setEmployeesCount(totalEmployees);
                dashboard.setCurrentCount(currentEmployees);
            }

            if (dashboard.getRelievingCount() != relievingEmployees) {
                // If relieved employees are added, print updatedDate and update the count
                System.out.println("Relieved Employees Added - Updated Date: " + LocalDate.now());
                dashboard.setUpdatedDate(LocalDate.now());
                dashboard.setRelievingCount(relievingEmployees);
            }

            dashboardRepository.save(dashboard);
        }

        return dashboards;
    }

}
