package ormExpressCorreos.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue
    @Column(name = "id_direccion")
    private int id_direccion;

    @Column(name = "numero", nullable = false)
    private int numero;

    @Column(name = "portal")
    private String portal;

    @Column(name = "piso")
    private int piso;

    @Column(name = "letra")
    private String letra;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "calle")
    private Calle calle;

    @OneToMany(mappedBy = "direccion")
    private Set<UsuarioGenerico> usuariosGenericos;

    @OneToMany(mappedBy = "direccion")
    private Set<UsuarioIdentificado> usuariosIdentificados;

    @OneToMany(mappedBy = "direccion")
    private Set<Oficina> oficinas;

    @OneToMany(mappedBy = "direccion")
    private Set<Recogida> recogidas;
    // @TODO completar las anotaciones de todos los atributos


    public Direccion() {
    }

    public Direccion(int numero, String portal, String letra, Calle calle) {

        this.numero = numero;
        this.portal = portal;
        this.letra = letra;
        this.calle = calle;
        this.usuariosGenericos = new HashSet<UsuarioGenerico>();
        this.usuariosIdentificados = new HashSet<UsuarioIdentificado>();
        this.oficinas = new HashSet<Oficina>();
        this.recogidas = new HashSet<Recogida>();
    }

    public Integer getNumero() {
        return this.numero;
    }

    public Integer getPiso() {
        return this.piso;
    }

    public String getLetra() {
        return this.letra;
    }

    public String getPortal() {
        return this.portal;
    }

    public String getDireccionCompleta() {
        // @TODO completar para que devuelva la dirección completa de un usuario
        String direccionCompleta = String.format("%s, %d",calle.getNombre_c(),numero);
        if(portal != null)
            direccionCompleta += String.format(", %s",portal);
        if(letra != null)
            direccionCompleta += String.format(", %s",letra);

        direccionCompleta += String.format(", %s",calle.getMunicipio());
        return direccionCompleta;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setCalle(Calle calle) {
        this.calle = calle;
    }
}
