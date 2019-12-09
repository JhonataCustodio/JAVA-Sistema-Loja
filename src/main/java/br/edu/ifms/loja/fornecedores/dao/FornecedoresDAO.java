/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedores.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.fornecedores.datamodel.Fornecedores;

/**
 *
 * @author silva
 */
public class FornecedoresDAO extends GenericDAO<Fornecedores> {
    
    public FornecedoresDAO() {
        super(Fornecedores.class);
    }
    
}
