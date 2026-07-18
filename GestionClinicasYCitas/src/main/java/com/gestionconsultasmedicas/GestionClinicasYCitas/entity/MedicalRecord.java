package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "control_medico")
public class MedicalRecord {

    @Id
    @GeneratedValue
    @Column(name = "id_medicalRecord")
    private int idMedicalRecord;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private Date fechaControl;

    @Column(nullable = false)
    private int estadoMedico; //La medicina fue tomada, si no


    //Medicamento asignado


    public MedicalRecord() {

    }

    public MedicalRecord(int idMedicalRecord, String descripcion, Date fechaControl, int estadoMedico) {
        this.idMedicalRecord = idMedicalRecord;
        this.descripcion = descripcion;
        this.fechaControl = fechaControl;
        this.estadoMedico = estadoMedico;
    }

    public int getIdMedicalRecord() {
        return idMedicalRecord;
    }

    public void setIdMedicalRecord(int idMedicalRecord) {
        this.idMedicalRecord = idMedicalRecord;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(Date fechaControl) {
        this.fechaControl = fechaControl;
    }

    public int getEstadoMedico() {
        return estadoMedico;
    }

    public void setEstadoMedico(int estadoMedico) {
        this.estadoMedico = estadoMedico;
    }
}
