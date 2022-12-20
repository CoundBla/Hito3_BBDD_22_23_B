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
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "autoriza")
    private UsuarioIdentificado usuarioIdentificado;

    @ManyToOne(optional = false)
    @JoinColumn(name = "direccion")
    private Direccion direccion;

    @Column(name = "dni", nullable = false)
    private String dni;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToMany(mappedBy = "usuarioidentificado",cascade = CascadeType.ALL)
    private Set<Cartacertificada> recibidas;

    @OneToMany(mappedBy = "usuarioidentificado",cascade = CascadeType.ALL)
    private Set<Cartacertificada> enviadas;

    public UsuarioIdentificado(){}

    public UsuarioIdentificado(String nombre, String apellidos, UsuarioIdentificado usuarioIdentificado, Direccion direccion, String dni, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuarioIdentificado = usuarioIdentificado;
        this.direccion = direccion;
        this.dni = dni;
        this.email = email;
        this.enviadas = new HashSet<Cartacertificada>();
        this.recibidas = new HashSet<Cartacertificada>();
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

    public UsuarioIdentificado getUsuarioIdentificado() {
        return usuarioIdentificado;
    }

    public void setUsuarioIdentificado(UsuarioIdentificado usuarioIdentificado) {
        this.usuarioIdentificado = usuarioIdentificado;
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
