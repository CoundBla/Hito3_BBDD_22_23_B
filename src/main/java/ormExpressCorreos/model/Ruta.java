package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ruta")
public class Ruta {

    @Id
    @GeneratedValue
    @Column(name = "id_ruta")
    private int id_ruta;

    @OneToMany(mappedBy = "ruta")
    private Set<Reparto> repartos;


    public Ruta() {
        this.repartos = new HashSet<Reparto>();
    }

    public int getId_ruta() {
        return id_ruta;
    }


    public Set<Reparto> getRepartos() {
        return repartos;
    }

}
