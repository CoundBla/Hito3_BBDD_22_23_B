package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "calle")
public class Calle {
    @Id
    @GeneratedValue
    @Column(name = "id_calle")
    private int id_calle;
    @Column(name = "nombre_c",nullable = false)
    private String nombre_c;
    @ManyToOne(optional = false)
    @JoinColumn(name = "municipio")
    private Municipio municipio;
    @Column(name = "longitud",nullable = true)
    private int longitud;

    @OneToMany(mappedBy = "calle")
    private Set<Segmento> segmentos;
    @OneToMany(mappedBy = "calle")
    private Set<Direccion> direcciones;

    public Calle(){}
    public Calle(String nombre_c, Municipio municipio, int longitud) {
        this.nombre_c = nombre_c;
        this.municipio = municipio;
        this.longitud = longitud;
        this.segmentos = new HashSet<Segmento>();
        this.direcciones = new HashSet<Direccion>();
    }

    public int getId_calle() {
        return id_calle;
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Set<Segmento> getSegmento() {
        return segmentos;
    }
}
