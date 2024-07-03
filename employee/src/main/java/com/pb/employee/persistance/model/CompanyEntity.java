package com.pb.employee.persistance.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompanyEntity implements Entity{
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String companyName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String emailId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String companyAddress;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String companyRegNo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String mobileNo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String landNo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String gstNo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String panNo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String personalMailId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String personalMobileNo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String address;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String imageFile;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String companyType;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String companyBranch;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cinNo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pfPercentage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String travelAllowance;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String specialAllowance;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String hraPercentage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shortName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;

}