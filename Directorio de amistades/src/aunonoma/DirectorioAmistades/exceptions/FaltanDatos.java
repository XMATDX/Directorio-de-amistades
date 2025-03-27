/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.DirectorioAmistades.exceptions;



/**
 * Clase exception donde avisa si hay un error en la valiabre que se ingreso  .
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/03/20
 * @see     autonoma.DirectorioAmistades.exceptions
 */
public class FaltanDatos extends RuntimeException{
    
    //  en esta expcion se va avisar que el nombre ingresado ya esta registrado
       public FaltanDatos(String nombre,String correo) {
            
            // Lanzar la excepción si nombre o el correo están vacíos

              // Lanzar la excepción si nombre o el correo est vacio
              throw this; // Lanzamos la excepción
            }
           
        }
        
    
    
    

    

