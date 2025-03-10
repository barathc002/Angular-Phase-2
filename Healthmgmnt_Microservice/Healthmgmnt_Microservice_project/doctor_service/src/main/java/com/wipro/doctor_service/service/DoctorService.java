package com.wipro.doctor_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.doctor_service.model.Doctor;
import com.wipro.doctor_service.repository.DoctorRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DoctorService {
	
	private final DoctorRepo doctorRepo;
	
	public List<Doctor> getAllDoctors(){
		List<Doctor> res=doctorRepo.findAll();
		return res;
	}
	
	public Doctor createDoctor(Doctor doctor) {
		Doctor newdoctor=new Doctor();
		newdoctor.setName(doctor.getName());
		newdoctor.setSpecialization(doctor.getSpecialization());
		doctorRepo.save(newdoctor);
		return newdoctor;
		
	}
	
	public Doctor deleteDoctor(Long id) {
		Optional<Doctor> dfind=doctorRepo.findById(id);
		if(dfind.isEmpty()) {
			throw new RuntimeException("Doctor id"+id+"not found");
			
		}
		Doctor res=dfind.get();
		doctorRepo.delete(res);
		
		return res;
		
	}
	
	public Doctor getDoctorbyId(Long id) {
		Optional<Doctor> dfind=doctorRepo.findById(id);
		if(dfind.isEmpty()) {
			throw new RuntimeException("Doctor Id "+id+"Not Found");
			
		}
		Doctor res=dfind.get();
		return res;
		
		
	}

}
