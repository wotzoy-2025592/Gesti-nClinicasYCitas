package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "notificacion")
public class Notification {

    @Id
    @GeneratedValue
    @Column(name = "id_notification")
    private int idNotification;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private Date fechaNotificacion;



    public Notification() {

    }

    public Notification(int idNotification, String descripcion, Date fechaNotificacion) {
        this.idNotification = idNotification;
        this.descripcion = descripcion;
        this.fechaNotificacion = fechaNotificacion;
    }

    public int getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    // Conexión notificacion al paciente de su cita aprobada, notificacion al doctor la fecha de su cita. Appointment

}
