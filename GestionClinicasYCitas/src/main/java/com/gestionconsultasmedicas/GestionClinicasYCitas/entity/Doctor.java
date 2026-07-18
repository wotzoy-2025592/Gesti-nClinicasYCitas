package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jdk.jshell.Diag;

import java.util.List;

@Entity
@Table(name = "doctores")
public class Doctor {

    @Id
    @GeneratedValue
    @Column(name = "id_doctor")
    private int idDoctor;

    @Column(nullable = false)
    private String nameDoctor;

    @Column(nullable = false)
    private int edadDoctor;

    @Column(nullable = false)
    private String emailDoctor;

    @Column(nullable = false)
    private int estado;

    @OneToMany(mappedBy = "patientDoctor", cascade = CascadeType.ALL)
    private List<Patient> doctorPatient;

    @OneToMany(mappedBy = "diagnosisDoctor", cascade = CascadeType.ALL)
    private List<Diagnosis> doctorDiagnosis;

    @OneToMany(mappedBy = "prescriptionDoctor", cascade = CascadeType.ALL)
    private List<Prescription> doctorPrescription;

    @OneToMany(mappedBy = "specialityDoctor", cascade = CascadeType.ALL)
    private List<Speciality> doctorSpeciality;


    public Doctor(){

    }

    public Doctor(int idDoctor, String nameDoctor, int edadDoctor, String emailDoctor, int estado) {
        this.idDoctor = idDoctor;
        this.nameDoctor = nameDoctor;
        this.edadDoctor = edadDoctor;
        this.emailDoctor = emailDoctor;
        this.estado = estado;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public int getEdadDoctor() {
        return edadDoctor;
    }

    public void setEdadDoctor(int edadDoctor) {
        this.edadDoctor = edadDoctor;
    }

    public String getEmailDoctor() {
        return emailDoctor;
    }

    public void setEmailDoctor(String emailDoctor) {
        this.emailDoctor = emailDoctor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
