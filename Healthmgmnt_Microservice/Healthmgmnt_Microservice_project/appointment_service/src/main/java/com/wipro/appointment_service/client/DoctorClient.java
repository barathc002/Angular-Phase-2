package com.wipro.appointment_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.appointment_service.Dto.DoctorDto;

@FeignClient(name= "DOCTOR-SERVICE")
@Component
public interface DoctorClient {
    @GetMapping("/doctors/{id}")
	DoctorDto getDoctor(@PathVariable("id") Long id);

}
