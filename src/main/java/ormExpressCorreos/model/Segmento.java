package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "segmento")
public class Segmento {

    @Id
    @GeneratedValue
    @Column(name = "id_segmento")
    private int id_segmento;

    @Column(name = "num_ini")
    private int num_ini;

    @Column(name = "num_fin")
    private int num_fin;

    @Column(name = "num_orden")
    private int num_orden;

    @ManyToOne(optional = false)
    @JoinColumn(name = "calle")
    private Calle calle;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ruta")
    private Ruta ruta;

    @ManyToMany(mappedBy = "segmentos")
    private Set<Area_de_envio> areas_de_envio;

    public Segmento(){}
    public Segmento(int num_ini, int num_fin, int num_orden, Calle calle, Ruta ruta) {
        this.num_ini = num_ini;
        this.num_fin = num_fin;
        this.num_orden = num_orden;
        this.calle = calle;
        this.ruta = ruta;
        this.areas_de_envio = new HashSet<Area_de_envio>();
    }

    public int getId_segmento() {
        return id_segmento;
    }

    public void setId_segmento(int id_segmento) {
        this.id_segmento = id_segmento;
    }

    public int getNum_ini() {
        return num_ini;
    }

    public void setNum_ini(int num_ini) {
        this.num_ini = num_ini;
    }

    public int getNum_fin() {
        return num_fin;
    }

    public void setNum_fin(int num_fin) {
        this.num_fin = num_fin;
    }

    public int getNum_orden() {
        return num_orden;
    }

    public void setNum_orden(int num_orden) {
        this.num_orden = num_orden;
    }

    public Calle getCalle() {
        return calle;
    }

    public void setCalle(Calle calle) {
        this.calle = calle;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}
