/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis_transporte;

/**
 *
 * @author 1509447
 */
public class Sis_Transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caminhao c1 = new Caminhao("XXXX", 12, "TTTTT");
        
        c1.informaDados();
        System.out.println(c1.getAno());
        
        Moto m1 = new Moto("CMD-3456", 5, "HHHHHHH");
        
        m1.informaDados();
        System.out.println(m1.getAno());
    }
    
}
