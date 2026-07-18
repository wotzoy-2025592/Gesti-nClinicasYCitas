package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "notificationCita", cascade = CascadeType.ALL)
    private List<Notification> appointmentNotificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("doctorAppointment")
    @JoinColumn(name = "idDoctor", foreignKey = @ForeignKey(name = "FK_appointment_doctor"))
    private Doctor appointmentDoctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("patientAppointment")
    @JoinColumn(name = "idPatient", foreignKey = @ForeignKey(name = "FK_appointment_patient"))
    private Patient appointmentPatient;

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
