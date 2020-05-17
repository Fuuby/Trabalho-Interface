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
public class Pessoa implements Serializable{
    private String nome, rg, cpf, dataNascimento, cnh, cep, estado, cidade, bairro, numero, endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String rg, String cpf, String dataNascimento, String cnh, String cep, String estado, String cidade, String bairro, String numero, String endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.cnh = cnh;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", cnh=" + cnh + ", cep=" + cep + ", estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", numero=" + numero + ", endereco=" + endereco + '}';
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
      
    public Object[] getpessoa() {
        Object pessoa[] = {nome, rg, cpf, dataNascimento, cnh, cep, estado, cidade, bairro, numero, endereco};
        return pessoa;
    }
}
 