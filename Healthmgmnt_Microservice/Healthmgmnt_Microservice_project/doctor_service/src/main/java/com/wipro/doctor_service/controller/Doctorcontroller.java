package com.wipro.doctor_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.doctor_service.model.Doctor;
import com.wipro.doctor_service.service.DoctorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/doctors")
public class Doctorcontroller {
	private final DoctorService doctorService;
	
	@GetMapping()
	public List<Doctor> showAllDoctors(){
		return doctorService.getAllDoctors();
		
	}
	
	@PostMapping()
	public Doctor createDoctor(@RequestBody Doctor dd) {
		return doctorService.createDoctor(dd);
		
	}
	@DeleteMapping("/{id}")
	public Doctor deleteDoctor(@PathVariable Long id) {
		return doctorService.deleteDoctor(id);
		
		
		
	}
	
	@GetMapping("/{id}")
	public Doctor getDoctor(@PathVariable Long id) {
		return doctorService.getDoctorbyId(id);
		
	}
	
	
	
	
	
	

}
