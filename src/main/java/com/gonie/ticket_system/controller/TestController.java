package com.gonie.ticket_system.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gonie.ticket_system.dto.TestRequest;
import com.gonie.ticket_system.dto.TestResponse;

import jakarta.validation.Valid;

@RestController
public class TestController {

   @PostMapping("/test")
   public TestResponse test(@Valid @RequestBody TestRequest request)
   {
      String message = "Hello " + request.getName();

      return new TestResponse(message, request.getAge());
   }

}