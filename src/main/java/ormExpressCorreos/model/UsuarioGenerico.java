package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "UsuarioGenerico")
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

    @ManyToOne()
    @JoinColumn(name = "direccion")
    private Direccion direccion;

    @OneToMany(mappedBy =  "emisor")
    private Set<Carta> enviadas;
    @OneToMany(mappedBy =  "receptor")
    private Set<Carta> recibidas;
    @OneToMany(mappedBy =  "emisor")
    private Set<Paquete> enviados;
    @OneToMany(mappedBy =  "receptor")
    private Set<Paquete> recibidos;
    public UsuarioGenerico(){}

    public UsuarioGenerico(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.enviadas = new HashSet<Carta>();
        this.recibidas = new HashSet<Carta>();
        this.enviados = new HashSet<Paquete>();
        this.recibidos = new HashSet<Paquete>();
    }

    public Long getId() {
        return id;
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
