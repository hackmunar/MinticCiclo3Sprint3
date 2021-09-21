/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

import java.util.SortedSet;
import java.util.TreeSet;

public class Usuario {

    private SortedSet<String> objTelefonos;

    public Usuario() {
        objTelefonos = new TreeSet<String>();
    }

    public void addTelefono(String telefono) {
        objTelefonos.add(telefono);
    }

    public void mostrarTelefonos() {
        System.out.println(objTelefonos);
    }
}
