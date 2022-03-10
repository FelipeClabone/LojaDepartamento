/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Fornecedor;
import Modelo.LojaDepartamento;
import Modelo.Usuario;
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
    
    public Object[][] retornarRelatorioFornecedor(){

        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getFornecedores().size()][3];
        Iterator<Fornecedor> iterator = LojaDepartamento.getFornecedores().iterator();

        while(iterator.hasNext()){
            Fornecedor fornecedor = iterator.next();

            if(fornecedor instanceof Fornecedor){
                linha[cont][0] = fornecedor.getCodigoFornecedor();
                linha[cont][1] = fornecedor.getNome();
                linha[cont][2] = fornecedor.getCnpj();
   
                cont++;  
            }
        }


        return(linha);
    }
    
    public Fornecedor buscaFornecedor(int codigo){
        //Padrão Iterator!
        Iterator<Fornecedor> iterator = LojaDepartamento.getFornecedores().iterator();
        while (iterator.hasNext()) {
            
            Fornecedor fornecedor = iterator.next();
            
            if(fornecedor.getCodigoFornecedor() == codigo){
                return(fornecedor);
            }
        }
        return(null);
    }
    
    public Iterator<Fornecedor> retornarFornecedor(){
        
        Iterator<Fornecedor> iterator = LojaDepartamento.getFornecedores().iterator();
        return(iterator);
    }
}
