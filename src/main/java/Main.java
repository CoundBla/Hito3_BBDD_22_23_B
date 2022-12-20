import ormExpressCorreos.Controller;
import ormExpressCorreos.model.Direccion;
import ormExpressCorreos.model.UsuarioGenerico;
import ormExpressCorreos.model.UsuarioIdentificado;

import java.sql.SQLException;

public class Main {

    public static void main (String [] args) {
        try {
            Controller controlador= new Controller();

            // @TODO añada las llamadas a las funciones de la clase Controller.java necesarias
            // para la creación del usuario identificado y la direccion.

            UsuarioGenerico usuarioGenerico = controlador.createUsuarioGenerico("Hugo","Garcia");
            UsuarioIdentificado usuarioIdentificado =controlador.createUsuarioIdentificado("54326262D","AARON","FLORES VARGAS","dz5reo28q@hotmail.com");
            usuarioIdentificado = controlador.createDireccion(32,1,"B","--","Calle de Guzman el Bueno","Madrid","Madrid",usuarioIdentificado);
            if(usuarioIdentificado != null && usuarioIdentificado.getDireccion() != null) {
                System.out.println("Se ha creado el usuario identificado " + usuarioIdentificado.getNombre() + " con DNI "
                        + usuarioIdentificado.getDni() + " que vive en " + usuarioIdentificado.getDireccion().getDireccionCompleta());
            }

        } catch(SQLException e) {
            System.err.println("Se ha producido un error en la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}
