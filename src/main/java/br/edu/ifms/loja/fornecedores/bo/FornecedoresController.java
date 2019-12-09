/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedores.bo;

import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.cliente.bo.ClienteBO;
import br.edu.ifms.loja.cliente.view.ClienteForm;
import br.edu.ifms.loja.cliente.view.ClienteView;
import br.edu.ifms.loja.fornecedores.datamodel.Fornecedores;
import br.edu.ifms.loja.fornecedores.view.FornecedoresForm;
import br.edu.ifms.loja.fornecedores.view.FornecedoresView;
import br.edu.ifms.loja.uf.datamodel.Uf;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDController;
import maruyama.components.mvc.GenericCRUDModel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author silva
 */
public class FornecedoresController extends GenericCRUDController<Fornecedores>{
    private FornecedoresView view;
    private FornecedoresBO model;
    
    public FornecedoresController(GenericCRUDModel model, GenericCRUDView view) {
        super(model, view);
        FornecedoresView fornecedoresView = (FornecedoresView) view;
        FornecedoresBO bo = (FornecedoresBO) model;
        
        this.view = (FornecedoresView) view;
        this.model = (FornecedoresBO) model;
        
        
    }
    
    
    @Override
    public void dadosViewParaModel(Fornecedores t, JPanel pnl) {
        FornecedoresForm form = (FornecedoresForm) pnl;
        t.setNomeFantasia(form.getCampoNomeFantasia().getText());
        t.setRazaoSocial(form.getCampoRazaoSocial().getText());
        t.setCnpj(form.getCampoCnpj().getText());
        t.setTelefone(form.getCampoTelefone().getText());
        t.setEmail(form.getCampoEmail().getText());
        t.setCep(form.getCampoCep().getText());
        t.setEndereco(form.getCampoEndereco().getText());
        t.setNumero(form.getCampoNumero().getText());
        
    }

    @Override
    public void dadosModelParaView(Fornecedores t, JPanel pnl) {
        FornecedoresForm form = (FornecedoresForm) pnl;
        form.getCampoNomeFantasia().setText(t.getNomeFantasia());
        form.getCampoRazaoSocial().setText(t.getRazaoSocial());
        form.getCampoCnpj().setText(t.getCnpj());
        form.getCampoTelefone().setText(t.getTelefone());
        form.getCampoEmail().setText(t.getEmail());
        form.getCampoCep().setText(t.getCep());
        form.getCampoEndereco().setText(t.getEndereco());
        form.getCampoNumero().setText(t.getNumero());
        
        
    }

    
    
}
