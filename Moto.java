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
public class Moto {
    
    String placa;
    int ano;
    String modelo;

    public Moto(String placa, int ano, String modelo) {
        this.placa = placa;
        validaAno(ano);
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void informaDados () {
        System.out.println("A placa é: "+ getPlaca());
        System.out.println("O modelo é: "+ getModelo());
        System.out.println("O ano é: "+ getAno());
       
    }
    
    public void validaAno (int ano){
        if (ano >= 0) {
            setAno(ano);
            System.out.println("O ano é válido");
        } 
        else {
            System.out.println("O ano é inválido");
        }
        
}
    
}
