/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produtos.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.produtos.datamodel.Produtos;

/**
 *
 * @author silva
 */
public class ProdutosDAO extends GenericDAO<Produtos>{
      
    public ProdutosDAO() {
        super(Produtos.class);
    }
      
   
}
