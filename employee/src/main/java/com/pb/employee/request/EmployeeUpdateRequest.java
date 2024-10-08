package com.pb.employee.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeUpdateRequest {


    @Schema(example = "companyShortName")
    @Pattern(regexp = "^[a-z]+$", message = "{companyName.format}")
    @NotBlank(message = "{companyname.message}")
    @Size(min = 2, max = 30, message = "{size.message}")
    private String companyName;

    @Schema(example = "employeeType")
    @Pattern(regexp = "^[a-zA-Z]+( [a-zA-Z]+)*$", message = "{employee.type}")
    @Size(min = 3, max = 20, message = "{employeeType.size.message}")
    private String employeeType;


    @Schema(example = "designationId")
    @Size(min = 2, max = 100, message = "{designation.size.message}")
    private String designation;

    @Schema(example = "departmentId")
    @Size(min = 2, max = 100, message = "{department.size.message}")
    private String department;

    @Schema(example = "location")
    @Pattern(regexp = "^(?!.*\\s{2,})(?!^([a-zA-Z]{1}\\s?){2,}$)(?!^[A-Z](?:\\s[A-Z])*$)(?!^[\\s]*$)[A-Za-z0-9]+(?:[\\s.,'#&*()^/][A-Za-z0-9]+)*(?:[\\s.,'#&*()/-]*[A-Za-z0-9]+)*(?:[\\s]*[.,#&*()/-]*\\s*)*$", message = "{location.format}")
    @Size(min = 2, max = 200, message = "{location.notnull.message}")
    private String location;

    @Schema(example = "manager")
    @Pattern(regexp = "^(?!.*[\\s]{2})(?!.*\\s$)(?!^\\s)(?!.*\\d.*)[A-Z][a-z]+(?:\\s[A-Z][a-z]+)*$", message = "{manager.format}")
    @Size(min = 3, max = 30, message = "{manager.notnull.message}")
    private String manager;

    @Schema(example = "mobileNo")
    @NotNull(message = "{mobileNo.notnull.message}")
    @Pattern(regexp = "^\\d{10}$", message = "{invalid.mobileNo}")
    private String mobileNo;

   /* @NotNull(message = "{roles.format}")
    @Size(min = 1, message = "{roles.size}")
    private List<@NotBlank(message = "{role.notnull.message}")
    @Pattern(regexp = "^[A-Z][a-z]+$", message = "{roles.format}") String> roles;*/

    @Schema(example = "Active")
    @Pattern(regexp = "^(Active|InActive)$", message = "{status.format}")
    @NotBlank(message = "{status.notnull.message}")
    private String status;

    @Schema(example = "accountNo")
    @Pattern(regexp = "^\\d{9,18}$", message = "{accountno.format}")
    @NotBlank(message = "{accountNo.notnull.message}")
    private String accountNo;

    @Schema(example = "ifscCode")
    @Pattern(regexp = "^[A-Z]{4}0[A-Z0-9]{6}$", message = "{ifscCode.format}")
    @NotBlank(message = "{ifscCode.notnull.message}")
    private String ifscCode;

    @Schema(example = "bankName")
    @Pattern(regexp = "^(?!\\b([A-Z])\\s([A-Z])\\b)(?!\\b([A-Z])\\s([A-Z])\\s([A-Z])\\b)(?:(?:[A-Z][a-zA-Z]*(?:[-\\s][A-Za-z]+)*)(?:[,.]? [A-Za-z]+)*(?:\\.)?)?$", message = "{bankName.format}")
    @Size(min = 3, max = 100, message = "{bankName.size.message}")
    private String bankName;
}