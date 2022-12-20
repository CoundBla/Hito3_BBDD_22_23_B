package ormExpressCorreos.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "oficina")
public class Oficina {

    @Id
    @GeneratedValue
    @Column(name = "id_oficina")
    private int id_oficina;

    @Column(name = "nombre_oficina")
    private String nombre_oficina;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "municipio")
    private Municipio municipio;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion")
    private Direccion direccion;

    @OneToMany(mappedBy = "oficina")
    private Set<Area_de_envio> areas_de_envio;

    public Oficina(String nombre_oficina, Municipio municipio, Direccion direccion) {
        this.nombre_oficina = nombre_oficina;
        this.municipio = municipio;
        this.direccion = direccion;
        this.areas_de_envio = new HashSet<Area_de_envio>();
    }

    public int getId_oficina() {
        return id_oficina;
    }


    public String getNombre_oficina() {
        return nombre_oficina;
    }

    public void setNombre_oficina(String nombre_oficina) {
        this.nombre_oficina = nombre_oficina;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Set<Area_de_envio> getAreas_de_envio() {
        return areas_de_envio;
    }
}
