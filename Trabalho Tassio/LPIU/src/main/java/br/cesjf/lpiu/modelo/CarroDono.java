/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.modelo;

import java.io.Serializable;

/**
 *
 * @author Gustavo
 */
public class CarroDono implements Serializable{
    
    private String nomeDono, rg, placa, modelo;

    public CarroDono() {
    }

    @Override
    public String toString() {
        return "CarroDono{" + "nomeDono=" + nomeDono + ", rg=" + rg + ", placa=" + placa + ", modelo=" + modelo + '}';
    }

    public CarroDono(String nomeDono, String cnh, String placa, String modelo) {
        this.nomeDono = nomeDono;
        this.rg = rg;
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Object[] getcarrodono() {
        Object pessoa[] = {nomeDono, rg, placa, modelo};
        return pessoa;
    }
    
}
