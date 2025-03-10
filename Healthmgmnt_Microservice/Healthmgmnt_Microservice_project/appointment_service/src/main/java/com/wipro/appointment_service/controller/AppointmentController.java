package com.wipro.appointment_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.appointment_service.model.Appointment;
import com.wipro.appointment_service.service.Appointment_service;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/appointments")
public class AppointmentController {
	
	private final Appointment_service appointment_service;
	
	@PostMapping
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointment_service.createAppointment(appointment);
		
	}
	
	@GetMapping("/{id}")
	public Appointment getAppointmentDetail(@PathVariable Long id) {
		return appointment_service.getAppointmentdetail(id);
		
	}
	

	

}
