/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

/**
 *
 * @author edgar.munar
 */
public class Reto4 {
    public static void main(String[] args) {
        Usuario objUsuario = new Usuario();
        objUsuario.addTelefono("333333");
        objUsuario.addTelefono("111111");
        objUsuario.addTelefono("222222");
        objUsuario.addTelefono("222222");
        objUsuario.mostrarTelefonos();
    }
}
