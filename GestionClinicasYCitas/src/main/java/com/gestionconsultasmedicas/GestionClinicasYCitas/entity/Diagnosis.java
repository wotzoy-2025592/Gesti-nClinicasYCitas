package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "diagnostico")
public class Diagnosis {

    @Id
    @GeneratedValue
    @Column(name = "id_diagnostico")
    private int idDiagnostico;

    @Column(nullable = false)
    private String descripcion;

    //Datos del paciente - Medico asignado

    public Diagnosis() {

    }

    public Diagnosis(int idDiagnostico, String descripcion) {
        this.idDiagnostico = idDiagnostico;
        this.descripcion = descripcion;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
