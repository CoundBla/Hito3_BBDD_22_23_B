package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "UsuarioIdentificado")
public class UsuarioIdentificado {
    
    // @TODO completar las anotaciones de todos los atributos

    @Id
    @Column(name = "dni", nullable = false)
    private String dni;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @ManyToOne()
    @JoinColumn(name = "usuarioAutorizado")
    private UsuarioIdentificado usuarioAutorizado;

    @OneToMany(mappedBy = "usuarioAutorizado")
    private Set<UsuarioIdentificado> autoriza_hijo;



    @ManyToOne()
    @JoinColumn(name = "direccion")
    private Direccion direccion;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToMany(mappedBy = "emisor",cascade = CascadeType.ALL)
    private Set<Cartacertificada> recibidas;

    @OneToMany(mappedBy = "receptor",cascade = CascadeType.ALL)
    private Set<Cartacertificada> enviadas;

    public UsuarioIdentificado(){}

    public UsuarioIdentificado( String dni, String nombre, String apellidos, UsuarioIdentificado usuarioIdentificado, Direccion direccion, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.enviadas = new HashSet<Cartacertificada>();
        this.recibidas = new HashSet<Cartacertificada>();
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
