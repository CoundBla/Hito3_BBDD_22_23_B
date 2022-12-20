package ormExpressCorreos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "asociado")
public class Asociado {
    @Column(name = "area_de_envio", nullable = false)
    private Area_de_envio area_de_envio;
    @Column(name = "cartero", nullable = false)
    private Cartero cartero;

    public Asociado(){}
    public Asociado(Area_de_envio area_de_envio, Cartero cartero) {
        this.area_de_envio = area_de_envio;
        this.cartero = cartero;
    }

    public Area_de_envio getArea_de_envio() {
        return area_de_envio;
    }

    public void setArea_de_envio(Area_de_envio area_de_envio) {
        this.area_de_envio = area_de_envio;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public void setCartero(Cartero cartero) {
        this.cartero = cartero;
    }
}
