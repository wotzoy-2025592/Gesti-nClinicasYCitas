package com.gestionconsultasmedicas.GestionClinicasYCitas.repository;

import com.gestionconsultasmedicas.GestionClinicasYCitas.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SpecialityRepository extends JpaRepository {

    List<Speciality> findById();
    Optional findByName();
}
