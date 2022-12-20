package ormExpressCorreos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "municipio")
public class Municipio {
    @Id
    @Column(name = "nombre_m")
    private String nombre_m;

    @Column(name = "provincia", nullable = false)
    private String provincia;

    public Municipio(String nombre_m, String provincia) {
        this.nombre_m = nombre_m;
        this.provincia = provincia;
    }

    public String getNombre_m() {
        return nombre_m;
    }

    public void setNombre_m(String nombre_m) {
        this.nombre_m = nombre_m;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
