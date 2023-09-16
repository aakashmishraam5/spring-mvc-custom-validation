package com.akash.springdemo.mvc;

import com.akash.springdemo.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String FirstName;
    @NotNull(message = "required")
    @Size(min =1 , message = "required")
    private String LastName= "";


    public Integer getFreePass() {
        return FreePass;
    }

    public void setFreePass(Integer FreePass) {
        this.FreePass = FreePass;
    }
@Min(value = 1 ,message = "must be greater than this")
@Max(value = 10,message = "must be less than this")
@NotNull(message = "required")
    private Integer FreePass;


    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    @Pattern(regexp ="^[a-zA-Z0-9]{5}" ,message = "only 5 char/digits")
    private String PostalCode;

    @CourseCode(value = "LUV" , message = "must start with LUV")
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    private String courseCode;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
}
