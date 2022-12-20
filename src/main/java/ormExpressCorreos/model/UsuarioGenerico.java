package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "segmento")
public class UsuarioGenerico {
    
    // @TODO completar las anotaciones de todos los atributos

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @ManyToOne(optional = false)
    @JoinColumn(name = "direccion")
    private Direccion direccion;

    @OneToMany(mappedBy =  "usuarioGenerico")
    private Set<Carta> enviadas;
    @OneToMany(mappedBy =  "usuarioGenerico")
    private Set<Carta> recibidas;
    public UsuarioGenerico(){}

    public UsuarioGenerico(Long id, String nombre, String apellidos, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.enviadas = new HashSet<Carta>();
        this.recibidas = new HashSet<Carta>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
