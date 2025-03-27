/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DirectorioAmistades.main;

import autonoma.DirectorioAmistades.models.Amigo;
import autonoma.DirectorioAmistades.views.PantallaPrincipal;
import java.util.ArrayList;

/** 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/03/20
 * @see     autonoma.DirectorioAmistades.main
 */
public class DirectorioAmistades {
    
    
    public static void main(String[] args){
    ArrayList<Amigo> amigos = new ArrayList<>();
    
    //se crea objeto Pantalla Pripal para que funcione el codigo
    PantallaPrincipal pantalla = new PantallaPrincipal(amigos);        
    //para se active el Jfrems (PantallaPripal)
    pantalla.setVisible(true);
    }
    
}
