package com.gonie.titket_system.dto;

public class TestResponse {

    private String message;
    private int age;

    public TestResponse() {

    }

    public TestResponse(String message, int age)
    {
        this.message = message;
        this.age = age;
    }

    public String getMessage()
    {
        return message;
    }

    public int getAge()
    {
        return age;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    
}
