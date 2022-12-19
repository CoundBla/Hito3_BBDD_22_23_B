package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trabaja")
public class Trabaja {

    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne(optional = false)
    @JoinColumn(name = "oficina")
    private Oficina oficina;

    @ManyToOne(optional = false)
    @JoinColumn(name = "turno")
    private Turno turno;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cartero")
    private Cartero cartero;

    public Trabaja(){}

    public Trabaja(Date fecha, Oficina oficina, Turno turno, Cartero cartero) {
        this.fecha = fecha;
        this.oficina = oficina;
        this.turno = turno;
        this.cartero = cartero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public void setCartero(Cartero cartero) {
        this.cartero = cartero;
    }
}
