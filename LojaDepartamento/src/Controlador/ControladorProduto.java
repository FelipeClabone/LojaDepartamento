/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alimentacao;
import Modelo.Eletrodomesticos;
import Modelo.Eletronicos;
import Modelo.Fornecedor;
import Modelo.LojaDepartamento;
import Modelo.Vestuario;
import java.util.Calendar;

/**
 *
 * @author Felipe de Freitas
 */
public class ControladorProduto {
    
    public ControladorProduto(){}
    
    public void addAlimentacao(int codigoProduto, String nome, String descricao, 
            Calendar dataFabricacao, float valor, Fornecedor fornecedor, 
            boolean disponivel){
        Alimentacao alimentacao = new Alimentacao(codigoProduto, nome, descricao, dataFabricacao,
            valor, fornecedor, disponivel);
        LojaDepartamento.getProdutos().add(alimentacao);
    }
    
    public void addEletrodomesticos(int codigoProduto, String nome, String descricao, 
            Calendar dataFabricacao, float valor, Fornecedor fornecedor, 
            boolean disponivel){
        Eletrodomesticos eletrodomesticos = new Eletrodomesticos(codigoProduto, nome, descricao, dataFabricacao,
            valor, fornecedor, disponivel);
        LojaDepartamento.getProdutos().add(eletrodomesticos);
    }
    
    public void addEletronicos(int codigoProduto, String nome, String descricao, 
            Calendar dataFabricacao, float valor, Fornecedor fornecedor, 
            boolean disponivel){
        Eletronicos eletronicos = new Eletronicos(codigoProduto, nome, descricao, dataFabricacao,
            valor, fornecedor, disponivel);
        LojaDepartamento.getProdutos().add(eletronicos);
    }
    
    public void addVestuario(int codigoProduto, String nome, String descricao, 
            Calendar dataFabricacao, float valor, Fornecedor fornecedor, 
            boolean disponivel){
        Vestuario vestuario = new Vestuario(codigoProduto, nome, descricao, dataFabricacao,
            valor, fornecedor, disponivel);
        LojaDepartamento.getProdutos().add(vestuario);
    }
}
