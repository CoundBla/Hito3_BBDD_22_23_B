package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "centro_de_clasificacion")
public class Coche {
    @Id
    @Column(name = "matricula")
    private String matricula;

    @Column(name = "capacidad",nullable = false)
    private float capacidad;
    @Column(name = "")
    private int id_oficina;

    @OneToMany(mappedBy = "coche")
    private Set<Reparto> repartos;

    public Coche(String matricula, float capacidad, int id_oficina) {
        this.matricula = matricula;
        this.capacidad = capacidad;
        this.id_oficina = id_oficina;
        this.repartos = new HashSet<Reparto>();
    }

    public Coche() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }

    public Set<Reparto> getRepartos() {
        return repartos;
    }
}
