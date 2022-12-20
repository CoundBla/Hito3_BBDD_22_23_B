package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table(name = "area_de_envio")
public class Area_de_envio {
    @Id
    @GeneratedValue
    @Column(name = "id_area_de_envio")
    private int id_area_envio;
    @ManyToOne(optional = false)
    @JoinColumn(name = "oficina")
    private Oficina oficina;
    @Column(name = "area_envio_padre", nullable = true)
    private Area_de_envio area_envio_padre;

    public Area_de_envio(){}
    public Area_de_envio(int id_area_envio, Oficina oficina, Area_de_envio area_envio_padre) {
        this.id_area_envio = id_area_envio;
        this.oficina = oficina;
        this.area_envio_padre = area_envio_padre;
    }

    public int getId_area_envio() {
        return id_area_envio;
    }

    public void setId_area_envio(int id_area_envio) {
        this.id_area_envio = id_area_envio;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Area_de_envio getArea_envio_padre() {
        return area_envio_padre;
    }

    public void setArea_envio_padre(Area_de_envio area_envio_padre) {
        this.area_envio_padre = area_envio_padre;
    }
}
