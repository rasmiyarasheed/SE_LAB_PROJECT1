package com.example.Studentrestapicrud;

import ...

@SpringBootApplications
@OpenApiDefinations(
		info = @info(
				title = "swagger",
				version = "1.0.0",
				description="url of..."
				),
		server = @server(
				url="http://localhost:8080",
				description = "url .."
				)
		)
public class StudentRestApiApplications {
	public static void main(String[] args) { SpringApplication.run(StudentRestApiCrudApplication.class, args);}
      
}
