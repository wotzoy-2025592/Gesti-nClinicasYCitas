package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "id_role")
    private int idRole;

    @Column(nullable = false)
    private String role;

    //Un usuario puede tener varios roles

    //User

    public Role() {

    }

    public Role(int idRole, String role) {
        this.idRole = idRole;
        this.role = role;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
