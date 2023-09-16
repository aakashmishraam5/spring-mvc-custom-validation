package com.akash.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //defind default course code
    public String value() default "LUV";


    //defind error course code
    public String message() default "must start with LUV";

    //define default groups

    public Class<?>[] groups() default {};

    //defind default payload

    public Class<? extends Payload>[] payload() default {};





}












