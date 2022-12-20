package ormExpressCorreos.model;


import javax.persistence.*;

@Entity
@Table(name = "oficina")
public class Oficina {

    @Id
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

    public Oficina(int id_oficina, String nombre_oficina, Municipio municipio, Direccion direccion) {
        this.id_oficina = id_oficina;
        this.nombre_oficina = nombre_oficina;
        this.municipio = municipio;
        this.direccion = direccion;
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
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
}
