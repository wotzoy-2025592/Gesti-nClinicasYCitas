package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cita")
public class Appointment {

    @Id
    @GeneratedValue
    @Column(name = "id_cita")
    private int idCita;

    @Column(nullable = false)
    private Date fechaCita;

    @Column(nullable = false)
    private int estadoCita; // Resuelto - Pendiente




    public Appointment() {

    }

    public Appointment(int idCita, Date fechaCita, int estadoCita) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.estadoCita = estadoCita;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public int getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(int estadoCita) {
        this.estadoCita = estadoCita;
    }
}
