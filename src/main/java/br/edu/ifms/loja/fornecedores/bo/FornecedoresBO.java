/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedores.bo;

import br.edu.ifms.loja.fornecedores.dao.FornecedoresDAO;
import br.edu.ifms.loja.fornecedores.datamodel.Fornecedores;
import java.util.ArrayList;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author silva
 */
public class FornecedoresBO extends GenericCRUDModel<Fornecedores> {
    
    private FornecedoresDAO dao;
    
    public FornecedoresBO(){
        dao = new FornecedoresDAO();
        preencherLista(dao.listarTodos());
    }

    @Override
    public void salvarEmBaseDeDados(Fornecedores t) {
        dao.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Fornecedores t) {
        dao.remover(t);
    }

    @Override
    public List<Fornecedores> carregarLista() {
        return dao.listarTodos();
    }

    @Override
    public List<Fornecedores> buscar(String string, String string1) {
        return new ArrayList<Fornecedores>();
    }
    
    

}
