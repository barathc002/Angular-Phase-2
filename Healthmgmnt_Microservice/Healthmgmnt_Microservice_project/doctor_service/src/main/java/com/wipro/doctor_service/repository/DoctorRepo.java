package com.wipro.doctor_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.doctor_service.model.Doctor;
@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long>{

}
