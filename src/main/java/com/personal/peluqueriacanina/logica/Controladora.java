package com.personal.peluqueriacanina.logica;

import com.personal.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


/**
 * @file Controlador.java
 * @brief pivote
 *
 * @version 1.0
 * @date 13/12/2025
 * 
 * @author Sebastian Barreto
 */

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        //crear dueño y asignar sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //crear mascota y asignar sus valores
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
        
    }

    public void borrarMascota(int num_cliente) {

        controlPersis.borrarMascota(num_cliente);
        
    }

}
