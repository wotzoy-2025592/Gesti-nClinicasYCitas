package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "registro_sistema")
public class AuditLog {

    @Id
    @GeneratedValue
    @Column(name = "id_auditLog")
    private int idAuditLog;

    @Column(nullable = false)
    private String descripcionSistema;

    //Por medio del usuario se consulta que tipo de usuario lo hizo y sus atributos


    public AuditLog(){

    }

    public AuditLog(int idAuditLog, String descripcionSistema) {
        this.idAuditLog = idAuditLog;
        this.descripcionSistema = descripcionSistema;
    }

    public int getIdAuditLog() {
        return idAuditLog;
    }

    public void setIdAuditLog(int idAuditLog) {
        this.idAuditLog = idAuditLog;
    }

    public String getDescripcionSistema() {
        return descripcionSistema;
    }

    public void setDescripcionSistema(String descripcionSistema) {
        this.descripcionSistema = descripcionSistema;
    }

}
