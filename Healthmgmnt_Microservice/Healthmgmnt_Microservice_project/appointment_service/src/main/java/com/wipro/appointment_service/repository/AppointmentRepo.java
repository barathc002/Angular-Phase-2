package com.wipro.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.appointment_service.model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

}
