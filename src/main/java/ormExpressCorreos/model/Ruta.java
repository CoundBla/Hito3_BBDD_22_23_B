package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table(name = "ruta")
public class Ruta {

    @Id
    @GeneratedValue
    @Column(name = "id_ruta")
    private int id_ruta;

    public Ruta(){}

    public Ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }
}
