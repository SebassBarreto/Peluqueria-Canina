package com.personal.peluqueriacanina.persistencia;

import com.personal.peluqueriacanina.logica.Duenio;
import com.personal.peluqueriacanina.logica.Mascota;

/**
 * @file ControladorPersistencia.java
 * @brief el otro lado del pivote 
 *
 * @version 1.0
 * @date 13/12/2025
 * 
 * @author Sebastian Barreto
 */

public class ControladoraPersistencia {
    //mapea por mascota y dueño
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        //crear dueño y guardar en la BD
        duenioJpa.create(duenio);
        //crear mascota y guardar en la BD
        mascotaJpa.create(masco);
    }
    
    
}
