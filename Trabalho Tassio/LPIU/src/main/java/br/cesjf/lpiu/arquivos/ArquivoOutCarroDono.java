/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.arquivos;

import br.cesjf.lpiu.modelo.CarroDono;
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
public class ArquivoOutCarroDono {
    private FileOutputStream fout = null;
    private ObjectOutputStream objOut = null;
    private List<CarroDono> lista = new ArrayList<CarroDono>();
    
    public void abrir() throws FileNotFoundException, IOException { //throws, trata exceção para cada coisa que possa acontecer
        preparar();
        fout = new FileOutputStream("informacoes_carrodono.txt");
        objOut = new ObjectOutputStream(fout);
        for (int i = 0; i < lista.size(); i++) {
            objOut.writeObject(lista.get(i));
        }
    }
    
    private void preparar() {
        ArquivoInCarroDono arq = new ArquivoInCarroDono();
        try {
            arq.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoOutCarroDono.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoOutCarroDono.class.getName()).log(Level.SEVERE, null, ex);
        }


        boolean continua = true;
        CarroDono lig = null;
        while (continua) {
            try {
                lig = arq.getcarrodono();
                if (lig != null) {
                    lista.add(lig);
                } else {
                    continua = false;
                }
            } catch (EOFException ex) {
                continua = false;
            } catch (IOException ex) {
                Logger.getLogger(ArquivoOutCarroDono.class.getName()).log(Level.SEVERE, null, ex);
                continua = false;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ArquivoOutCarroDono.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        arq.fechar();
    }
    
    public void fechar() throws IOException {//throws, trata a exceção IOException
        objOut.close();
        fout.close();
    }
    
    public void Adicionar(CarroDono lig) throws IOException {
        objOut.writeObject(lig);//grava o objeto todo
    }
    
    public void recadastrar_todos(ArrayList<CarroDono> lista2) throws IOException {
        fout = new FileOutputStream("informacoes_carrodono.txt");
        objOut = new ObjectOutputStream(fout);

        for (int i = 0; i < lista2.size(); i++) {
            objOut.writeObject(lista2.get(i));
        }

    }
}
