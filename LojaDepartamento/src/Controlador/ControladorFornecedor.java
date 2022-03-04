/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Fornecedor;
import Modelo.LojaDepartamento;
import java.util.Iterator;

/**
 *
 * @author Felipe de Freitas
 */
public class ControladorFornecedor {
    
    public ControladorFornecedor(){}
    
    public void addFornecedor(int codigoFornecedor, String cnpj, String nome, 
            String descricao, String email, String telefone, String endereco){
        Fornecedor fornecedor = new Fornecedor(codigoFornecedor, cnpj, nome,
            descricao, email, telefone, endereco);
        LojaDepartamento.getFornecedores().add(fornecedor);
    }
    
    public Iterator<Fornecedor> retornarFornecedor(){
        
        Iterator<Fornecedor> iterator = LojaDepartamento.getFornecedores().iterator();
        return(iterator);
    }
}
