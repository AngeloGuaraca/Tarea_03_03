/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Actor;
import servicio.ActorServicio;

/**
 *
 * @author user
 */
public class ActorControlador {
    
    private final ActorServicio actorServicio = new ActorServicio();
    
    public Actor crear(String [] args){
        
        var actor= new Actor (Integer.valueOf(args[0]),args[1],args[2],
                                              args[3],args[4], args[5]);
        
      
        
        this.actorServicio.crear(actor);
        return actor;
    }
    
    public List<Actor> listar(){
        return this.actorServicio.listar();
    }
}
