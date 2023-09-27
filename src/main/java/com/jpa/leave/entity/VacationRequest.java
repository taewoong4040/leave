package com.jpa.leave.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vacation_requests")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VacationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "vacation_type")
    private String vacationType;

    @Column(name = "sub_vacation_type")
    private String subVacationType;

    @Column(name = "vacation_reason")
    private String vacationReason;

    @Column(name = "request_datetime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime requestDatetime;

    @Column(name = "vacation_hope_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate vacationHopeDate;

    @Column(name = "vacation_period") // 휴가 기간 컬럼 추가
    private String vacationPeriod;

    @Column(name = "detailed_info")
    private String detailedInfo; // 세부사항 필드 추가

    // 생성자, getter 및 setter 메서드 생략
}
