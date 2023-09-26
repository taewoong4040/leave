package com.jpa.leave.service;

import com.jpa.leave.entity.VacationRequest;
import com.jpa.leave.repository.VacationRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacationRequestService {

    private final VacationRequestRepository vacationRequestRepository;

    @Autowired
    public VacationRequestService(VacationRequestRepository vacationRequestRepository) {
        this.vacationRequestRepository = vacationRequestRepository;
    }

    public void submitVacationRequest(VacationRequest vacationRequest) {
        vacationRequestRepository.save(vacationRequest);
    }

    public List<VacationRequest> getAllVacationRequests() {

        return vacationRequestRepository.findAll();
    }
}
