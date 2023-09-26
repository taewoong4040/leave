package com.jpa.leave.repository;

import com.jpa.leave.entity.VacationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRequestRepository extends JpaRepository<VacationRequest, Long> {

}
