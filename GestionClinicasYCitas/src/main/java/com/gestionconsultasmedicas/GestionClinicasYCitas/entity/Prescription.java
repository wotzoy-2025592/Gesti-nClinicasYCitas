package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "preinscripción")
public class Prescription {

    @Id
    @GeneratedValue
    @Column(name = "id_preinscription")
    private int idPreinscription;

    @Column(nullable = false)
    private int estado; // Aceptada - Rechazada

    @Column(nullable = false)
    private String sintomas;

    @Column(nullable = false)
    private Date fechaConsulta;




    public Prescription() {

    }

    public Prescription(int idPreinscription, int estado, String sintomas, Date fechaConsulta) {
        this.idPreinscription = idPreinscription;
        this.estado = estado;
        this.sintomas = sintomas;
        this.fechaConsulta = fechaConsulta;
    }

    public int getIdPreinscription() {
        return idPreinscription;
    }

    public void setIdPreinscription(int idPreinscription) {
        this.idPreinscription = idPreinscription;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }
}
