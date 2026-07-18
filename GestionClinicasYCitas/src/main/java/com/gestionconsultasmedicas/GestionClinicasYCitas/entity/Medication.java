package com.gestionconsultasmedicas.GestionClinicasYCitas.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medicamentos")
public class Medication {

    @Id
    @GeneratedValue
    @Column(name = "id_medicamento")
    private int idMedicamento;

    @Column(nullable = false)
    private String nameMedicamento;

    @Column(nullable = false)
    private int precioMedicamento;

    //Paciente, medico, medicalrecord,

    public Medication() {

    }

    public Medication(int idMedicamento, String nameMedicamento, int precioMedicamento) {
        this.idMedicamento = idMedicamento;
        this.nameMedicamento = nameMedicamento;
        this.precioMedicamento = precioMedicamento;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNameMedicamento() {
        return nameMedicamento;
    }

    public void setNameMedicamento(String nameMedicamento) {
        this.nameMedicamento = nameMedicamento;
    }

    public int getPrecioMedicamento() {
        return precioMedicamento;
    }

    public void setPrecioMedicamento(int precioMedicamento) {
        this.precioMedicamento = precioMedicamento;
    }
}
