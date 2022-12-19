package ormExpressCorreos.model;

// @TODO completar las anotaciones de la clase
public class Direccion {

    private int id_direccion;
    private int numero;
    private String portal;
    private int piso;
    private String letra;
    private int id_calle;
    // @TODO completar las anotaciones de todos los atributos


    public Direccion(int id_direccion, int numero, String portal, String letra, int id_calle) {
        this.id_direccion = id_direccion;
        this.numero = numero;
        this.portal = portal;
        this.letra = letra;
        this.id_calle = id_calle;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public Integer getPiso() {
        return this.piso;
    }

    public String getLetra() {
        return this.letra;
    }

    public String getPortal() {
        return this.portal;
    }

    public String getDireccionCompleta() {
        // @TODO completar para que devuelva la dirección completa de un usuario
        return "";
    }
}
