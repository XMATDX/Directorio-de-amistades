package aunonoma.DirectorioAmistades.exceptions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 * Clase exception donde avisa si hay un error en la valiabre que se ingreso  .
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/03/20
 * @see     autonoma.DirectorioAmistades.exceptions
 */
public class VerificarTelefono extends RuntimeException{
   
    public VerificarTelefono (String telefono){ 
     
        if (telefono.startsWith("606")|| telefono.startsWith("30")){
        }else{
        throw this;
        }
    
    }

}
