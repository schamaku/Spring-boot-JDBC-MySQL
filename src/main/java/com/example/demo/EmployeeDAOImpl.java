package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
 
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
 
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
 
    public String getEmployeeName() {
        String sql = "select name from employee";
        String name = jdbcTemplate.queryForObject(sql,String.class);
        return name;
    }
 
}