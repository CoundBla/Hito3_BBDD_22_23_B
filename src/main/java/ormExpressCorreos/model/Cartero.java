package ormExpressCorreos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Modela un cartero. No es necesario modificar esta clase. Pero debe crear tantas clases como entidades
 * necesite para llevar a cabo esta parte del hito 3. Inclúyalas en el paquete "expresscorreos.model"
 */

@Entity
@Table(name = "cartero")
public class Cartero {

    @Id
    @Column(name = "dni",nullable = false)
    private String DNI;
    @Column(name = "nombre",nullable = false)
    private String nombre;
    @Column(name = "apellidos",nullable = false)
    private String apellidos;

    public Cartero(){}
    public Cartero(String DNI, String nombre, String apellidos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }
}
