/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Felipe de Freitas
 */
public class LojaDepartamento {
    private String nomeLoja;
    private final static ArrayList<Venda> vendas = new ArrayList();;
    private final static ArrayList<Produto> produtos = new ArrayList();;
    private final static ArrayList<Fornecedor> fornecedores = new ArrayList();;
    private final static ArrayList<Usuario> usuarios = new ArrayList();;
    private String configuracoes; //TODO: tem q mudar para a classe Configuracao

    LojaDepartamento(){}

    LojaDepartamento(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }
    
    public void addVenda(Venda v){
        this.vendas.add(v);
    }
    
    public void removeVenda(int codigoVenda){
        for (Iterator<Venda> it = this.vendas.iterator(); it.hasNext();) {
            Venda venda = it.next();
            if (venda.getCodigoVenda() == codigoVenda){
                this.vendas.remove(venda);
                break;
            }
        }
    }
        
    public void addProduto(Produto p){
        this.produtos.add(p);
    }
    
    public void removeproduto(int codigoProduto){
        for (Iterator<Produto> it = LojaDepartamento.produtos.iterator(); it.hasNext();) {
            Produto produto = it.next();
            if (produto.getCodigoProduto() == codigoProduto){
                this.produtos.remove(produto);
                break;
            }
        }
    }
        
    public void addForneceder(Fornecedor f){
        this.fornecedores.add(f);
    }
    
    public void removeFornecedor(int codigoFornecedor){
        for (Iterator<Fornecedor> it = this.fornecedores.iterator(); it.hasNext();) {
            Fornecedor fornecedor = it.next();
            if (fornecedor.getCodigoFornecedor() == codigoFornecedor){
                this.fornecedores.remove(fornecedor);
                break;
            }
        }
    }

    public void addUsuario(Usuario u){
        this.usuarios.add(u);
    }
    
    public void removeUsuario(int codigoUsuario){
        for (Iterator<Usuario> it = this.usuarios.iterator(); it.hasNext();) {
            Usuario usuario = it.next();
            if (usuario.getCodigoUsuario() == codigoUsuario){
                this.usuarios.remove(usuario);
                break;
            }
        }
    }
}
