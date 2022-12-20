package ormExpressCorreos.model;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "reparto")
public class Reparto {

    @Id
    @GeneratedValue
    @Column(name = "id_reparto")
    private int id_reparto;

    @Column(name = "fecha_alta",nullable = false)
    private Date fecha_alta;

    @Column(name = "num_cartas")
    private int num_cartas;

    @Column(name = "peso")
    private int peso;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ruta")
    private Ruta ruta;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cartero")
    private Cartero cartero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "coche")
    private Coche coche;

    @Column(name = "fecha_reserva")
    private Date fecha_reserva;

    @OneToMany(mappedBy = "reparto",cascade = CascadeType.ALL)
    private Set<Paquete> paquetes;

    @OneToMany(mappedBy = "reparto",cascade = CascadeType.ALL)
    private Set<Carta> cartas;

    @OneToMany(mappedBy = "reparto",cascade = CascadeType.ALL)
    private Set<Cartacertificada> cartascertificadas;

    public Reparto(){}

    public Reparto(Date fecha_alta, int num_cartas, int peso, Ruta ruta, Cartero cartero, Coche coche, Date fecha_reserva) {

        this.fecha_alta = fecha_alta;
        this.num_cartas = num_cartas;
        this.peso = peso;
        this.ruta = ruta;
        this.cartero = cartero;
        this.coche = coche;
        this.fecha_reserva = fecha_reserva;
        this.paquetes = new HashSet<Paquete>();
        this.cartas = new HashSet<Carta>();
        this.cartascertificadas = new HashSet<Cartacertificada>();
    }

    public int getId_reparto() {
        return id_reparto;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public int getNum_cartas() {
        return num_cartas;
    }

    public void setNum_cartas(int num_cartas) {
        this.num_cartas = num_cartas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public void setCartero(Cartero cartero) {
        this.cartero = cartero;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }
}
