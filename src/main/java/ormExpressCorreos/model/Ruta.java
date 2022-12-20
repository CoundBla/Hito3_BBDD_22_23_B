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

    @OneToMany(mappedBy = "ruta")
    private Set<Segmento> segmentos;


    public Ruta() {
        this.repartos = new HashSet<Reparto>();
        this.segmentos = new HashSet<Segmento>();
    }

    public int getId_ruta() {
        return id_ruta;
    }


    public Set<Reparto> getRepartos() {
        return repartos;
    }

    public Set<Segmento> getSegmentos() {
        return segmentos;
    }
}
