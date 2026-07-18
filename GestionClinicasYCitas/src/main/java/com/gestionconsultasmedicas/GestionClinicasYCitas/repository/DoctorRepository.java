package com.gestionconsultasmedicas.GestionClinicasYCitas.repository;

import com.gestionconsultasmedicas.GestionClinicasYCitas.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository {

    List<Doctor> findById();
}
