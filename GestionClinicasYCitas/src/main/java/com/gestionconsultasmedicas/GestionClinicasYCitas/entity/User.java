package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id_user")
    private int idUser;

    @Column(nullable = false)
    private String nameUser;

    @Column(nullable = false)
    private String emailUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("patientUser")
    @JoinColumn(name = "idPatient", foreignKey = @ForeignKey(name = "FK_user_patient"))
    private Patient userPatient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("doctorUser")
    @JoinColumn(name = "idDoctor", foreignKey = @ForeignKey(name = "FK_user_doctor"))
    private Doctor userDoctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("roleUser")
    @JoinColumn(name = "idRole", foreignKey = @ForeignKey(name = "FK_user_role"))
    private Role userRole;

    public User() {

    }

    public User(int idUser, String nameUser, String emailUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }
}
