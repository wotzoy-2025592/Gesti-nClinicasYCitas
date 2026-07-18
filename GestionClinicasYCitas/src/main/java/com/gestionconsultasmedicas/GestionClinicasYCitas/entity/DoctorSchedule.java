package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "doctor_horario")
public class DoctorSchedule {

    @Id
    @Column(name = "id_horario")
    @GeneratedValue
    private int idHorario;

    @Column(nullable = false)
    private Date workDay;

    @Column(nullable = false)
    private int estadoTrabajo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("doctorDocSchedule")
    @JoinColumn(name = "idDoctor", foreignKey = ForeignKey)
    private DoctorSchedule doctorWork;

    public DoctorSchedule() {

    }

    public DoctorSchedule(int idHorario, Date workDay, int estadoTrabajo) {
        this.idHorario = idHorario;
        this.workDay = workDay;
        this.estadoTrabajo = estadoTrabajo;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public Date getWorkDay() {
        return workDay;
    }

    public void setWorkDay(Date workDay) {
        this.workDay = workDay;
    }

    public int getEstadoTrabajo() {
        return estadoTrabajo;
    }

    public void setEstadoTrabajo(int estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }

}
