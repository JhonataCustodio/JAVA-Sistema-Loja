/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produtos.bo;

import br.edu.ifms.loja.produtos.dao.ProdutosDAO;
import br.edu.ifms.loja.produtos.datamodel.Produtos;
import java.util.ArrayList;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author silva
 */
public class ProdutosBO extends GenericCRUDModel<Produtos> {
    private ProdutosDAO dao;
    
    public ProdutosBO(){
        dao = new ProdutosDAO();
        preencherLista(dao.listarTodos());

    }
    
    
    @Override
    public void salvarEmBaseDeDados(Produtos t) {
        dao.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Produtos t) {
       dao.remover(t);
    }

    @Override
    public List<Produtos> carregarLista() {
        return dao.listarTodos();
    }

    @Override
    public List<Produtos> buscar(String string, String string1) {
        return new ArrayList<Produtos>();
    }

    
}

