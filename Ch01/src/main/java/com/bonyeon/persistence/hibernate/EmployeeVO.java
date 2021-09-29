package com.bonyeon.persistence.hibernate;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity // 하이버네이트는 이것이 붙은 클래스만 객체로 생성하고 관리할 수 있다.
@Table(name = "S_EMP")  // DB해당 테이블과 매핑되도록 설정
public class EmployeeVO {

    @Id // PK
    private Long id;

    private String name;

    @Column(name = "START_DATE") // 변수 이름과 테이블 컬럼을 매핑, 동일하게 사용시 필요없음
    private Timestamp startDate;

    private String title;

    @Column(name = "DEPT_NAME")
    private String deptName;

    private Double salary;

    private String email;

}
