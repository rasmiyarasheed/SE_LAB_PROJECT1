/**
 * The main class for the Software Engineering Lab Project application.
 */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * Main application class responsible for starting the Spring Boot application.
 */
@SpringBootApplication
public class SeLabProjectApplication {

    /**
     * Main method to run the Spring Boot application.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SeLabProjectApplication.class, args);
    }

    /**
     * Controller class for handling home-related functionality.
     */
    @Controller
    public static class HomeController {

        /**
         * Handles GET requests for the root path ("/").
         *
         * @return The login page
         */
        @GetMapping("/")
        public String index() {
            return "login";
        }

        /**
         * Handles POST requests for the "/login" path.
         *
         * @param username The username parameter
         * @param password The password parameter
         * @param model    The model for the view
         * @return Redirect to the dashboard or login page based on authentication
         */
        @PostMapping("/login")
        public String login(@RequestParam String username, @RequestParam String password, Model model) {
            // Replace with actual authentication logic
            if ("admin".equals(username) && "password".equals(password)) {
                return "redirect:/dashboard"; // Redirect to "home.html" after successful login
            } else {
                model.addAttribute("error", "Invalid username or password");
                return "login";
            }
        }

        // Other mapping methods for various pages (home, reviewers, accepted, responses, dashboard, assignreviewers, rejectedpapers)

        /**
         * Handles GET requests for the "/register" path.
         *
         * @param model The model for the view
         * @return The registration form page
         */
        @GetMapping("/register")
        public String showRegistrationForm(Model model) {
            model.addAttribute("user", new User()); // Assuming you have a User class for registration data
            return "register";
        }

        /**
         * Handles POST requests for the "/register" path.
         *
         * @param user           The User object with registration data
         * @param bindingResult  The binding result for form validation
         * @return Redirect to login page or handle registration success
         */
        @PostMapping("/register")
        public String register(@ModelAttribute User user, BindingResult bindingResult) {
            // Perform registration logic here
            // Redirect to login page or handle registration success

            // For example:
            if (bindingResult.hasErrors()) {
                return "register"; // Return to the registration form with error messages
            }

            // Registration logic goes here

            return "redirect:/"; // Redirect to the login page after successful registration
        }
    }

    /**
     * User class for registration data.
     */
    public static class User {
        private String lname;
        private String email;
        private String password;
        private String dob;
        private String phone;
        private String tandc;
        private boolean consent;

        // Getters and setters
    }
}
