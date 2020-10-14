package com.training.org;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDAO {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }

   public void create(Integer empid,String name, double salary) {
      String SQL = "insert into Employee (empid,name,salary) values (?, ?, ?)";
      
      jdbcTemplateObject.update( SQL, empid, name, salary);
      System.out.println("Created Record Id = "+ empid +"Name = " + name + " salary = " + salary);
      return;
   }

   public Employee getEmployee(Integer id) {
      String SQL = "select * from Student where id = ?";
      Employee student = jdbcTemplateObject.queryForObject(SQL, 
                        new Object[]{id}, new EmployeeMapper());
      return student;
   }

   public List<Employee> listEmployees() {
	      String SQL = "select * from Employee";
	      List <Employee> emp = jdbcTemplateObject.query(SQL, 
	                                new EmployeeMapper());
	      return emp;
	   }

	   
	}




    










