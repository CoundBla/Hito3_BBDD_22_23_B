package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "turno")
public class Turno {

    @Id
    @GeneratedValue
    @Column(name = "id_turno")
    private int id_turno;

    @Column(name = "hora_entrada")
    private String hora_entrada;

    @Column(name = "hora_salida")
    private String hora_salida;

    @Column(name = "tipo_turno",nullable = false)
    private String tipo_turno;

    @ManyToMany(mappedBy = "turnos")
    private Set<Oficina> oficinas;

    @ManyToMany(mappedBy = "turnos")
    private Set<Cartero> carteros;

    public Turno(String hora_entrada, String hora_salida, String tipo_turno) {
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.tipo_turno = tipo_turno;
        this.oficinas= new HashSet<Oficina>();
        this.carteros= new HashSet<Cartero>();
    }

    public int getId_turno() {
        return id_turno;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getTipo_turno() {
        return tipo_turno;
    }

    public void setTipo_turno(String tipo_turno) {
        this.tipo_turno = tipo_turno;
    }

    public Set<Oficina> getOficinas() {
        return oficinas;
    }

    public Set<Cartero> getCarteros() {
        return carteros;
    }
}

