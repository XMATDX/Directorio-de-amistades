/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.DirectorioAmistades.exceptions;

import autonoma.DirectorioAmistades.models.Amigo;
import java.util.ArrayList;


/**
 * Clase exception donde avisa si hay un error en la valiabre que se ingreso  .
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/03/20
 * @see     autonoma.DirectorioAmistades.exceptions
 */
public class AmigoYaRegistrado extends RuntimeException{
    
        int posicion = 0;
    //  en esta expcion se va avisar que el nombre ingresado ya esta registrado
        public AmigoYaRegistrado(ArrayList<Amigo> amigos, String nuevoCorreo, int numero) {
        
        
        for (Amigo revisarAmigo : amigos){
            
            //se obtine el nombre de la clase amigo qeu se va revisar 
            String correo = revisarAmigo.getCorreo();
            if (correo.equalsIgnoreCase(nuevoCorreo)){
              // Lanzar la excepción si el nombre ya existe
              numero = this.posicion;
              throw this; // Lanzamos la excepción
            }
           this.posicion ++;
        }
        
    }
    
    
}
