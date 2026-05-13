package com.gonie.titket_system.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;


public class TestRequest {

    @NotBlank
    private String name;

    @Min(1)
    private int age;

    public TestRequest() 
    {
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
