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
public class Automovel implements Serializable {

    private String placa, modelo;
    private String data;
    private String motorizacao;
    private double valorBasico;
    private String categoria;

    public Automovel(String placa, String modelo, String data, String motorizacao, double valorBasico, String categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.data = data;
        this.motorizacao = motorizacao;
        this.valorBasico = valorBasico;
        this.categoria = categoria;
    }

    public Automovel() {
    }

    public double calcularImposto(double valor, double aliquota) {

        return valor * (aliquota / 100);
    }

    public double calcularValorTotal(Double valor, Double imposto) {
        return valor + imposto;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }

    public double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(double valorBasico) {
        this.valorBasico = valorBasico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Automovel{" + "placa=" + placa + ", modelo=" + modelo + ", data=" + data + ", motorizacao=" + motorizacao + ", valorBasico=" + valorBasico + ", categoria=" + categoria + '}';
    }

    public Object[] getcarro() {
        Object carro[] = {placa, modelo, data, motorizacao, valorBasico, categoria};
        return carro;
    }

}
