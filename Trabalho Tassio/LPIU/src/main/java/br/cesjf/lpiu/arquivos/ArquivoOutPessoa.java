/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.arquivos;


import br.cesjf.lpiu.modelo.Pessoa;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class ArquivoOutPessoa {
    
    private FileOutputStream fout = null;
    private ObjectOutputStream objOut = null;
    private List<Pessoa> lista = new ArrayList<Pessoa>();
    
    public void abrir() throws FileNotFoundException, IOException { //throws, trata exceção para cada coisa que possa acontecer
        preparar();
        fout = new FileOutputStream("informacoes_pessoa.txt");
        objOut = new ObjectOutputStream(fout);
        for (int i = 0; i < lista.size(); i++) {
            objOut.writeObject(lista.get(i));
        }
    }
    
    private void preparar() {
        ArquivoInPessoa arq = new ArquivoInPessoa();
        try {
            arq.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoOutPessoa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoOutPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }


        boolean continua = true;
        Pessoa pess = null;
        while (continua) {
            try {
                pess = arq.getpessoa();
                if (pess != null) {
                    lista.add(pess);
                } else {
                    continua = false;
                }
            } catch (EOFException ex) {
                continua = false;
            } catch (IOException ex) {
                Logger.getLogger(ArquivoOutPessoa.class.getName()).log(Level.SEVERE, null, ex);
                continua = false;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ArquivoOutPessoa.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        arq.fechar();
    }
    
    public void fechar() throws IOException {//throws, trata a exceção IOException
        objOut.close();
        fout.close();
    }
    
    public void Adicionar(Pessoa pess) throws IOException {
        objOut.writeObject(pess);//grava o objeto todo
    }
    
    public void recadastrar_todos(ArrayList<Pessoa> lista2) throws IOException {
        fout = new FileOutputStream("informacoes_pessoa.txt");
        objOut = new ObjectOutputStream(fout);

        for (int i = 0; i < lista2.size(); i++) {
            objOut.writeObject(lista2.get(i));
        }

    }
    
}
