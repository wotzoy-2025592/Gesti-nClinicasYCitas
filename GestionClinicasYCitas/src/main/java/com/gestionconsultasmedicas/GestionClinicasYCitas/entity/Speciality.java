package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "especialidades")
public class Speciality {

    @Id
    @GeneratedValue
    @Column(name = "id_speciality")
    private int idSpeciality;

    @Column(nullable = false)
    private String nameEspecialidad;

    //Medico
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("doctorSpeciality")
    @JoinColumn(name = "idDoctor", foreignKey = @ForeignKey(name = "FK_speciality_doctor"))
    private Speciality specialityDoctor;



    public Speciality() {

    }

    public Speciality(int idSpeciality, String nameEspecialidad) {
        this.idSpeciality = idSpeciality;
        this.nameEspecialidad = nameEspecialidad;
    }

    public int getIdSpeciality() {
        return idSpeciality;
    }

    public void setIdSpeciality(int idSpeciality) {
        this.idSpeciality = idSpeciality;
    }

    public String getNameEspecialidad() {
        return nameEspecialidad;
    }

    public void setNameEspecialidad(String nameEspecialidad) {
        this.nameEspecialidad = nameEspecialidad;
    }
}
