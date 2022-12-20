package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
    @ManyToMany(mappedBy = "areas_de_envio")
    private Set<Cartero> carteros;
    @ManyToMany()
    @JoinTable(name= "agrupan")
    private Set<Segmento> segmentos;

    public Area_de_envio(){}
    public Area_de_envio(Oficina oficina, Area_de_envio area_envio_padre) {
        this.oficina = oficina;
        this.area_envio_padre = area_envio_padre;
        this.carteros= new HashSet<Cartero>();
        this.segmentos = new HashSet<Segmento>();
    }

    public int getId_area_envio() {
        return id_area_envio;
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
