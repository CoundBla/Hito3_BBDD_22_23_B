package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cartaCertficada")
public class Cartacertificada {
    @Id
    @GeneratedValue
    @Column(name = "id_cf")
    private String id_cf;
    @Column(name = "urgencia",nullable = false)
    private String urgencia;
    @Column(name = "fecha_entrega",nullable = true)
    private Date fecha_entrega;
    @Column(name = "comentario",nullable = true)
    private String comentario;
    @ManyToOne(optional = false)
    @JoinColumn(name = "emisor")
    private UsuarioIdentificado emisor;
    @ManyToOne(optional = false)
    @JoinColumn(name = "receptor")
    private UsuarioIdentificado receptor;
    @ManyToOne(optional = false)
    @JoinColumn(name = "recogida")
    private Recogida recogida;
    @ManyToOne(optional = false)
    @JoinColumn(name = "reparto")
    private Reparto reparto;

    public Cartacertificada(){}
    public Cartacertificada(String id_cf, String urgencia, Date fecha_entrega, String comentario, UsuarioIdentificado emisor, UsuarioIdentificado receptor, Recogida recogida, Reparto reparto) {
        this.id_cf = id_cf;
        this.urgencia = urgencia;
        this.fecha_entrega = fecha_entrega;
        this.comentario = comentario;
        this.emisor = emisor;
        this.receptor = receptor;
        this.recogida = recogida;
        this.reparto = reparto;
    }

    public String getId_cf() {
        return id_cf;
    }

    public void setId_cf(String id_cf) {
        this.id_cf = id_cf;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public UsuarioIdentificado getEmisor() {
        return emisor;
    }

    public void setEmisor(UsuarioIdentificado emisor) {
        this.emisor = emisor;
    }

    public UsuarioIdentificado getReceptor() {
        return receptor;
    }

    public void setReceptor(UsuarioIdentificado receptor) {
        this.receptor = receptor;
    }

    public Recogida getRecogida() {
        return recogida;
    }

    public void setRecogida(Recogida recogida) {
        this.recogida = recogida;
    }

    public Reparto getReparto() {
        return reparto;
    }

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }
}
