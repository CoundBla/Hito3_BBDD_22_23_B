package ormExpressCorreos.model;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "oficina")
public class Paquete {
    @Id
    @Column(name = "id_p")
    private String id_p;

    @Column(name = "dimensiones", nullable = false)
    private String dimensiones;

    @Column(name = "alto",nullable = false)
    private int alto;

    @Column(name = "ancho",nullable = false)
    private int ancho;

    @Column(name = "peso",nullable = false)
    private float peso;

    @Column(name = "comentario")
    private String comentario;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "emisor")
    private UsuarioGenerico emisor;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "receptor")
    private UsuarioGenerico receptor;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion")
    private Recogida recogida;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion")
    private Reparto reparto;

    @Column(name = "fecha_entrega")
    private Date fecha_entrega;

    public Paquete(String id_p, String dimensiones, int alto, int ancho, float peso, String comentario, UsuarioGenerico emisor, UsuarioGenerico receptor, Recogida recogida, Reparto reparto, Date fecha_entrega) {
        this.id_p = id_p;
        this.dimensiones = dimensiones;
        this.alto = alto;
        this.ancho = ancho;
        this.peso = peso;
        this.comentario = comentario;
        this.emisor = emisor;
        this.receptor = receptor;
        this.recogida = recogida;
        this.reparto = reparto;
        this.fecha_entrega = fecha_entrega;
    }

    public String getId_p() {
        return id_p;
    }

    public void setId_p(String id_p) {
        this.id_p = id_p;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
}
