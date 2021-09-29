package com.bonyeon.persistence.hibernate;

import java.sql.Timestamp;
import java.util.List;

public class EmployeeServiceClient {
    public static void main(String[] args) {
        EmployeeVO vo = new EmployeeVO();
        vo.setId(5L);
        vo.setName("고길동");
        vo.setStartDate(new Timestamp(System.currentTimeMillis()));
        vo.setTitle("과장");
        vo.setDeptName("총무부");
        vo.setSalary(4000.0);
        vo.setEmail("bonyeon@gmail.com");

        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.insertEmployee(vo);

        List<EmployeeVO> employeeVOList = employeeDAO.getEmployeeList();
        employeeVOList.stream()
                .forEach((it) -> System.out.println(it));
    }
}
