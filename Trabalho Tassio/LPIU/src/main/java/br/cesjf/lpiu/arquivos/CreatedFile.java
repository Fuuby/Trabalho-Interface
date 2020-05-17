/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.arquivos;

import br.cesjf.lpiu.modelo.Automovel;
import br.cesjf.lpiu.modelo.CarroDono;
import br.cesjf.lpiu.modelo.Pessoa;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Gustavo
 */
public class CreatedFile {
    
    /**
        * @param args
        * @throws
        */
       public static void main(String[] args) {
             try {
                    FileOutputStream fout = new FileOutputStream("informacoes_carro.txt");
                    ObjectOutputStream objOut = new ObjectOutputStream(fout);
        
                    Automovel auto = new Automovel();
                    auto.setPlaca("ABC-1234");
                    auto.setModelo("Uno");
                    auto.setData("1996");
                    auto.setValorBasico(10000);
                    auto.setMotorizacao("1.0");
                    auto.setCategoria("Carga");
                    
                    objOut.writeObject(auto);
                   
                    objOut.close();
             } catch (IOException e) {
                    e.printStackTrace();
             }
             
             try {
                    FileOutputStream fout = new FileOutputStream("informacoes_pessoa.txt");
                    ObjectOutputStream objOut = new ObjectOutputStream(fout);
        
                    Pessoa pess = new Pessoa();
                    pess.setNome("Gustavo");
                    pess.setRg("11.111.111-1");
                    pess.setCpf("111.111.111-11");
                    pess.setDataNascimento("12/12/1212");
                    pess.setCnh("11111111");
                    pess.setCep("11111-111");
                    pess.setEstado("MG");
                    pess.setCidade("Juiz de Fora");
                    pess.setBairro("Centro");
                    pess.setNumero("1");
                    pess.setEndereco("Av. Rio Branco");
                    
                    objOut.writeObject(pess);
                   
                    objOut.close();
             } catch (IOException e) {
                    e.printStackTrace();
             }
             
             try {
                    FileOutputStream fout = new FileOutputStream("informacoes_carrodono.txt");
                    ObjectOutputStream objOut = new ObjectOutputStream(fout);
        
                    CarroDono lig = new CarroDono();
                    lig.setNomeDono("Gustavo");
                    lig.setRg("11.111.111-1");
                    lig.setPlaca("asd-1234");
                    lig.setModelo("Basico");
                    
                    
                    objOut.writeObject(lig);
                   
                    objOut.close();
             } catch (IOException e) {
                    e.printStackTrace();
             }
             
       }
    
}
