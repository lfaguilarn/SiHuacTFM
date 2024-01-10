/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Coneccion.Datos;
import java.sql.Connection;

/**
 *
 * @author Luis Fernando
 */
public class pruebas {
    public static Connection conectar;
    static Datos datos = new Datos();
    private static void conecta() {
        //this.conectar = this.datos.Conectar("prueba");
        conectar = datos.Conectar("prueba");
    }
    public static void main(String [] args){
        conecta();
    }
    
}
