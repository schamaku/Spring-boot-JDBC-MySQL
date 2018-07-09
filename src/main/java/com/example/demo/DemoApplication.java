package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class DemoApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
//}

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



//@SpringBootApplication
public class DemoApplication 
//extends SpringBootServletInitializer 
{

//  @Override
//  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//      return application.sources(DemoApplication.class);
//  }
//
//  public static void main(String[] args) {
//      SpringApplication.run(DemoApplication.class, args);
//  }
  
	public static void main(String[] args) throws SQLException {
//		Connection con = DriverManager.getConnection(
//				 "jdbc:mysql://localhost:3306/stest", "root", "root");
//		System.out.println("conn");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringJDBCConfiguration.class);
 
        EmployeeDAO empDAO = applicationContext.getBean(EmployeeDAO.class);
 
        String empName = empDAO.getEmployeeName();
 
        System.out.println("Employee name is " + empName);
 
        applicationContext.close();
    }
}