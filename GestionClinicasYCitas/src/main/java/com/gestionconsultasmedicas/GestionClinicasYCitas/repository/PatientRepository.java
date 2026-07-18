package com.gestionconsultasmedicas.GestionClinicasYCitas.repository;

import com.gestionconsultasmedicas.GestionClinicasYCitas.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository {

    List<Patient> findByID();
}
