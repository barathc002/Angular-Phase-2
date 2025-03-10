package com.wipro.appointment_service.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.appointment_service.Dto.DoctorDto;
import com.wipro.appointment_service.client.DoctorClient;
import com.wipro.appointment_service.model.Appointment;
import com.wipro.appointment_service.repository.AppointmentRepo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Appointment_service {
	
	private final DoctorClient doctorClient;
	
	private  final AppointmentRepo appointmentRepo;
    @CircuitBreaker(name="doctorServiceCircuitBreaker",fallbackMethod = "fallbackDoctorService")
	public Appointment createAppointment(Appointment appointment) {
		DoctorDto doctorfd=doctorClient.getDoctor(appointment.getDoctorId());
	   
		Appointment finAppointment=new Appointment();
		finAppointment.setAppointmentDate(appointment.getAppointmentDate());
		finAppointment.setDoctorId(doctorfd.getId());
		finAppointment.setDoctorname(doctorfd.getName());
		finAppointment.setDoctorspln(doctorfd.getSpecialization());
		finAppointment.setPatientName(appointment.getPatientName());;
		
		appointmentRepo.save(finAppointment);
		
		return finAppointment;
		
	}
	
    public Appointment fallbackDoctorService(Appointment appointment, Throwable ex) {
        System.out.println("Doctor Service is unavailable. Providing default data.");
        Appointment finAppointment = new Appointment();
        finAppointment.setAppointmentDate(appointment.getAppointmentDate());
        finAppointment.setDoctorId(-1L); // Default ID
        finAppointment.setDoctorname("Null");
        finAppointment.setDoctorspln("Null");
        finAppointment.setPatientName(appointment.getPatientName());

        return finAppointment;
    }
	public Appointment getAppointmentdetail(Long id) {
       Optional<Appointment>	appfind=appointmentRepo.findById(id);
       if(appfind.isEmpty()) {
    	   throw new RuntimeException("Appointment Id "+id+" NOt found");
    	   
       }
       
       var res=appfind.get();
       return res;
		
	}
}
