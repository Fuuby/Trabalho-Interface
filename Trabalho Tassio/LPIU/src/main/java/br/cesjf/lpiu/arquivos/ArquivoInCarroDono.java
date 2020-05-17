/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.arquivos;

import br.cesjf.lpiu.modelo.CarroDono;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class ArquivoInCarroDono {
    
    private FileInputStream fin = null;
    private ObjectInputStream objIn = null;
    
    public void abrir() throws FileNotFoundException, IOException {
        fin = new FileInputStream("informacoes_carrodono.txt");
        objIn = new ObjectInputStream(fin);
    }
    
    public void fechar() {
        try {
            objIn.close();
            fin.close();
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInCarroDono.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public CarroDono getcarrodono() throws IOException, ClassNotFoundException {
        CarroDono lig = null;

        try {
            lig = (CarroDono) objIn.readObject();
        } catch (EOFException ex) {
            lig = null;
        }
        return lig;
    }
    
    public List getTodasCarroDono() {
        List<CarroDono> lista = new ArrayList<CarroDono>();

        try {
            this.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoInCarroDono.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInCarroDono.class.getName()).log(Level.SEVERE, null, ex);
        }


        boolean continua = true;
        CarroDono lig = null;
        while (continua) {
            try {
                lig = (CarroDono) objIn.readObject();
                lista.add(lig);
            } catch (EOFException ex) {
                continua = false;
            } catch (IOException ex) {
                continua = false;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ArquivoInCarroDono.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        fechar();
        return lista;
    }
    
}
