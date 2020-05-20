package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.*;
import mx.com.gm.peliculas.excepciones.*;

public interface AccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosEX;

    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEX;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEX;

    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEX;

    public void crear(String nombreArchivo) throws AccesoDatosEX;

    public void borrar(String nombreArchivo) throws AccesoDatosEX;

}
