package com.training.org;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
   public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
      Employee emp = new Employee();
      emp.setEmpId(rs.getInt("empid"));
      emp.setName(rs.getString("name"));
      emp.setSalary(rs.getInt("salary"));
      return emp;
   }
}
