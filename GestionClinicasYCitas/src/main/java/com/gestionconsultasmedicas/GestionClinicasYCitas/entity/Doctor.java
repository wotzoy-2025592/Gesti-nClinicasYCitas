package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("patientDoctor")
    @JoinColumn(name = "idPatient")
    private Doctor doctorPatient;


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
