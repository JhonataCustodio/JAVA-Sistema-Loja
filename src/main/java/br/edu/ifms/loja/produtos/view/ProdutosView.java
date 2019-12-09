/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produtos.view;

import javax.swing.JDialog;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author silva
 */
public class ProdutosView extends GenericCRUDView{
private JDialog janela; 

    public ProdutosView(JPanel formulario) {
        super(formulario);
        janela = new JDialog();
        janela.setModal(true);
        janela.add(this);
        janela.setSize(600, 600);
        janela.setTitle("Produtos");
    }
  
    @Override
    public String[] configurarCamposDeBusca() {
        return new String[0];
    }
     public void setVisible(boolean b){
        janela.setVisible(b);
    }
    
}
