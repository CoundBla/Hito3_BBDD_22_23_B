package ormExpressCorreos.model;

import javax.persistence.*;

@Entity
@Table(name = "centro_de_clasificacion")
public class Centro_de_clasificacion {
    @Id
    @GeneratedValue
    @Column(name = "codigo")
    private int codigo;

    @Column(name = "num_max_c",nullable = true)
    private int num_max_c;

    @Column(name = "num_max_p", nullable = true)
    private int num_max_p;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "oficina")
    private Oficina oficina;

    public Centro_de_clasificacion(int codigo, int num_max_c, int num_max_p, Oficina ofi) {
        this.codigo = codigo;
        this.num_max_c = num_max_c;
        this.num_max_p = num_max_p;
        this.oficina = ofi;
    }

    public Centro_de_clasificacion(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNum_max_c() {
        return num_max_c;
    }

    public void setNum_max_c(int num_max_c) {
        this.num_max_c = num_max_c;
    }

    public int getNum_max_p() {
        return num_max_p;
    }

    public void setNum_max_p(int num_max_p) {
        this.num_max_p = num_max_p;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina newOficina) {
        this.oficina = newOficina;
    }
}
