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

    @OneToMany(mappedBy = "patientUser", cascade = CascadeType.ALL)
    private List<User> userPatient;

    @OneToMany(mappedBy = "doctorUser", cascade = CascadeType.ALL)
    private List<User> userDoctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("rolesUser")
    @JoinColumn(name = "idRole")
    private User userRole;

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
