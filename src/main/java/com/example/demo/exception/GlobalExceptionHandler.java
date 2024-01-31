package com.example.demo.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        // Log the exception
        e.printStackTrace();

        // Add an attribute to the model for error display in the view
        model.addAttribute("error", "An unexpected error occurred. Please try again.");

        // Return a custom error page or redirect
        return "error"; // Assuming you have an "error.html" template
    }
}
