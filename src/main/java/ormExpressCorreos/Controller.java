package ormExpressCorreos;

import ormExpressCorreos.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.sql.*;

/**
 * Controlador de la aplicación. Por favor, revise detenidamente la clase y complete las partes omitidas
 * atendiendo a los comentarios indicados mediante @TODO
 */
public class Controller {

    private Session session;

    /**
     * Crea un nuevo controlador
     */
    public Controller () {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

        this.session = sessionFactory.openSession();
    }

    /**
     * Crea un nuevo usuario_generico
     * param id id del usuario
     * param nombre nombre del usuario
     * param apellidos apellidos del usuario
     * @return el nuevo usuario creado
     * @throws SQLException
     */
    public UsuarioGenerico createUsuarioGenerico(String nombre, String apellidos) throws SQLException{
        UsuarioGenerico nuevoUG = new UsuarioGenerico();
        nuevoUG.setNombre(nombre);
        nuevoUG.setApellidos(apellidos);
        return nuevoUG;

    }

    public UsuarioIdentificado createUsuarioIdentificado(String DNI, String nombre, String apellidos, String email) throws SQLException {
        // @TODO completa este metodo para crear de forma presistente un usuario identificado
        UsuarioIdentificado ui = new UsuarioIdentificado();
        ui.setDni(DNI);
        ui.setNombre(nombre);
        ui.setApellidos(apellidos);
        ui.setEmail(email);
        return ui;
    }

    public UsuarioIdentificado createDireccion(Integer numero, Integer piso, String letra, String portal, String calle, String municipio,
                                               String provincia, UsuarioIdentificado user) throws SQLException {
        Direccion objDir = new Direccion();
        Municipio objMunicipio = new Municipio(municipio,provincia);
        Calle objCalle = new Calle();
        objCalle.setNombre_c(calle);
        objCalle.setMunicipio(objMunicipio);
        objDir.setCalle(objCalle);
        objDir.setLetra(letra);
        objDir.setPiso(piso);
        objDir.setPortal(portal);
        user.setDireccion(objDir);
        return user;
    }
}
