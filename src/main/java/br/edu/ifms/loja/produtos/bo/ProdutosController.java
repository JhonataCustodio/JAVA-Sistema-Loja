/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produtos.bo;

import br.edu.ifms.loja.fornecedores.datamodel.Fornecedores;
import br.edu.ifms.loja.produtos.datamodel.Produtos;
import br.edu.ifms.loja.produtos.view.ProdutosForm;
import br.edu.ifms.loja.produtos.view.ProdutosView;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDController;
import maruyama.components.mvc.GenericCRUDModel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author silva
 */
public class ProdutosController extends GenericCRUDController<Produtos> {

    private ProdutosView view;
    private ProdutosBO model;

    public ProdutosController(GenericCRUDModel model, GenericCRUDView view) {
        super(model, view);
        ProdutosView produtosView = (ProdutosView) view;
        ProdutosBO bo = (ProdutosBO) model;
        
        this.view = (ProdutosView) view;
        this.model = (ProdutosBO) model;
        
    }

   
    @Override
    public void dadosViewParaModel(Produtos t, JPanel pnl) {
        ProdutosForm form = (ProdutosForm) pnl;
        t.setDescricao(form.getCampoDescricao().getText());
        t.setMarca(form.getCampoMarca().getText());
        t.setModelo(form.getCampoModelo().getText());
        t.setQuantidade(new Integer(form.getCampoQuantidade().getText()));
        t.setValor(new Double(form.getCampoValor().getText()));
        
    }

    @Override
    public void dadosModelParaView(Produtos t, JPanel pnl) {
        ProdutosForm form = (ProdutosForm) pnl;
        form.getCampoDescricao().setText(t.getDescricao());
        form.getCampoMarca().setText(t.getMarca());
        form.getCampoModelo().setText(t.getModelo());
        form.getCampoQuantidade().setText(Integer.toString(t.getQuantidade()));
        form.getCampoValor().setText(Double.toString(t.getValor()));
        
    }

}

