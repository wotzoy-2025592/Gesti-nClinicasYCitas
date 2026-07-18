package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pacientes")
public class Patient {

    @Id
    @GeneratedValue
    @Column(name = "id_patient")
    private int idPatient;

    @Column(nullable = false)
    private String namePatient;

    @Column(nullable = false)
    private int edadPatient;

    @Column(nullable = false)
    private String emailPatient;

    @Column(nullable = false)
    private int estado;


    @OneToMany(mappedBy = "userPatient", cascade = CascadeType.ALL)
    private List<User> patientUser;

    @OneToMany(mappedBy = "doctorPatient", cascade = CascadeType.ALL)
    private List<Doctor> patientDoctor;

    @OneToMany(mappedBy = "medicationPatient", cascade = CascadeType.ALL)
    private List<Medication> patientMedication;

    @OneToMany(mappedBy = "prescriptionPatient", cascade = CascadeType.ALL)
    private List<Prescription> patientPrescription;

    @OneToMany(mappedBy = "appointmentPatient", cascade = CascadeType.ALL)
    private List<Appointment> patientAppointment;


    public Patient() {

    }

    public Patient(int idPatient, String namePatient, int edadPatient, String emailPatient, int estado) {
        this.idPatient = idPatient;
        this.namePatient = namePatient;
        this.edadPatient = edadPatient;
        this.emailPatient = emailPatient;
        this.estado = estado;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public int getEdadPatient() {
        return edadPatient;
    }

    public void setEdadPatient(int edadPatient) {
        this.edadPatient = edadPatient;
    }

    public String getEmailPatient() {
        return emailPatient;
    }

    public void setEmailPatient(String emailPatient) {
        this.emailPatient = emailPatient;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
