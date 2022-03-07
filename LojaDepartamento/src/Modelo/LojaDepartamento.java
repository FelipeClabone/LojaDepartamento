/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
 *
 * @author Felipe de Freitas
 */
public class LojaDepartamento {
    private String nomeLoja;
    private static ArrayList<Venda> vendas = new ArrayList();
    private static ArrayList<Produto> produtos = new ArrayList();
    private static ArrayList<Fornecedor> fornecedores = new ArrayList();
    private static ArrayList<Usuario> usuarios = new ArrayList();
    private String configuracoes; //TODO: tem q mudar para a classe Configuracao

    public LojaDepartamento(){}

    public LojaDepartamento(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }
    
    public static void addVenda(int codigoVenda, Cliente cliente, Vendedor vendedor, 
            Calendar dataVenda, float valorTotal, float valorDesconto, Pagamento formaPagamento){
        Venda venda = new Venda(codigoVenda, cliente, vendedor, dataVenda,
            valorTotal, valorDesconto, formaPagamento);
        LojaDepartamento.vendas.add(venda);
    }

    public static ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public static void setVendas(ArrayList<Venda> vendas) {
        LojaDepartamento.vendas = vendas;
    }
    
    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    public static void setProdutos(ArrayList<Produto> produtos) {
        LojaDepartamento.produtos = produtos;
    }
    
    public static ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }
    
    public static void setFornecedores(ArrayList<Fornecedor> fornecedores) {
        LojaDepartamento.fornecedores = fornecedores;
    }
    
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        LojaDepartamento.usuarios = usuarios;
    }
    
    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(String configuracoes) {
        this.configuracoes = configuracoes;
    }
}
