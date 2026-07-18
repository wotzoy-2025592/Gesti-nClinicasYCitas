package com.gestionconsultasmedicas.GestionClinicasYCitas.repository;

import com.gestionconsultasmedicas.GestionClinicasYCitas.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicationRepository extends JpaRepository {

    List<Medication> findById();
}
