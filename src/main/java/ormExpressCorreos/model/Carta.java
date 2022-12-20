package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "carta")
public class Carta {
    @Id
    @GeneratedValue
    @Column(name = "id_c")
    private String id_c;
    @Column(name = "formato",nullable = false)
    private String formato;
    @Column(name = "fecha_entrega",nullable = true)
    private Date fecha_entrega;
    @Column(name = "comentario",nullable = true)
    private String comentario;
    @ManyToOne(optional = false)
    @JoinColumn(name = "emisor")
    private UsuarioGenerico emisor;
    @ManyToOne(optional = false)
    @JoinColumn(name = "receptor")
    private UsuarioGenerico receptor;
    @ManyToOne(optional = false)
    @JoinColumn(name = "recogida")
    private Recogida recogida;
    @ManyToOne(optional = false)
    @JoinColumn(name = "reparto")
    private Reparto reparto;

    public Carta(){}
    public Carta(String id_c, String formato, Date fecha_entrega, String comentario, UsuarioGenerico emisor, UsuarioGenerico receptor, Recogida recogida, Reparto reparto) {
        this.id_c = id_c;
        this.formato = formato;
        this.fecha_entrega = fecha_entrega;
        this.comentario = comentario;
        this.emisor = emisor;
        this.receptor = receptor;
        this.recogida = recogida;
        this.reparto = reparto;
    }

    public String getId_c() {
        return id_c;
    }

    public void setId_c(String id_c) {
        this.id_c = id_c;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
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

    public UsuarioGenerico getEmisor() {
        return emisor;
    }

    public void setEmisor(UsuarioGenerico emisor) {
        this.emisor = emisor;
    }

    public UsuarioGenerico getReceptor() {
        return receptor;
    }

    public void setReceptor(UsuarioGenerico receptor) {
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
