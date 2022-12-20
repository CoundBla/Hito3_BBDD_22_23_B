package ormExpressCorreos.model;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "recogida")
public class Recogida {
    @Id
    @GeneratedValue
    @Column(name = "id_recogida")
    private int id_recogida;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario")
    private UsuarioIdentificado usuario;

    @Column(name = "fecha_recogida")
    private Date fecha_recogida;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion")
    private Direccion direccion;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "cartero")
    private Cartero cartero;

    @OneToMany(mappedBy = "recogida",cascade = CascadeType.ALL)
    private Set<Paquete> paquetes;

    @OneToMany(mappedBy = "recogida",cascade = CascadeType.ALL)
    private Set<Carta> cartas;

    @OneToMany(mappedBy = "recogida",cascade = CascadeType.ALL)
    private Set<Cartacertificada> cartascertificadas;


    public Recogida(UsuarioIdentificado usuario, Date fecha_recogida, Direccion direccion, Cartero cartero) {
        this.usuario = usuario;
        this.fecha_recogida = fecha_recogida;
        this.direccion = direccion;
        this.cartero = cartero;
    }

    public int getId_recogida() {
        return id_recogida;
    }

    public UsuarioIdentificado getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioIdentificado usuario) {
        this.usuario = usuario;
    }

    public Date getFecha_recogida() {
        return fecha_recogida;
    }

    public void setFecha_recogida(Date fecha_recogida) {
        this.fecha_recogida = fecha_recogida;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public void setCartero(Cartero cartero) {
        this.cartero = cartero;
    }
}
