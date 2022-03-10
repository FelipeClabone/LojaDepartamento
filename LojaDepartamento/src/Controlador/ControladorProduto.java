/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alimentacao;
import Modelo.Cliente;
import Modelo.Contexto;
import Modelo.Eletrodomesticos;
import Modelo.Eletronicos;
import Modelo.FactoryProduto;
import Modelo.Fornecedor;
import Modelo.LojaDepartamento;
import Modelo.Produto;
import Modelo.StrategyOrdenacaoA;
import Modelo.StrategyOrdenacaoB;
import Modelo.Usuario;
import Modelo.Vestuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
 *
 * @author Felipe de Freitas
 */
public class ControladorProduto {
    
    public ControladorProduto(){}
    
    public void addProduto(int codigoProduto, String nome, String descricao, 
            Calendar dataFabricacao, float valor, Fornecedor fornecedor, 
            boolean disponivel, String tipo){
        Produto produto = FactoryProduto.factoryMethod(codigoProduto, nome, 
                descricao, dataFabricacao, valor, fornecedor, disponivel, tipo);
        LojaDepartamento.getProdutos().add(produto);
    }
    
    public Produto buscaProduto(int codigo){
    //Padrão Iterator!
        Iterator<Produto> iterator = LojaDepartamento.getProdutos().iterator();
        while (iterator.hasNext()) {

            Produto produto = iterator.next();

            if(produto.getCodigoProduto() == codigo){
                return produto;
            }
        }
        return(null);
    }
    
    public Iterator<Produto> retornaProdutos(){
        
        //Padrão Iterator!
        Iterator<Produto> iterator = LojaDepartamento.getProdutos().iterator();
        return(iterator);
    }
    
    public Object[][] retornarRelatorioProdutos(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][3];
        Iterator<Produto> iterator = LojaDepartamento.getProdutos().iterator();
        
        while(iterator.hasNext()){
            Produto produto = iterator.next();
            
            linha[cont][0] = produto.getCodigoProduto();
            linha[cont][1] = produto.getNome();
            linha[cont][2] = produto.calcularValor();
            cont++;
        }
        
        return(linha);
    }
        
    public Object[][] retornarRelatorioAlimentacao(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][3];
        Iterator<Produto> iterator = LojaDepartamento.getProdutos().iterator();
        
        while(iterator.hasNext()){
            Produto produto = iterator.next();
            
            if(produto instanceof Alimentacao){
                linha[cont][0] = produto.getCodigoProduto();
                linha[cont][1] = produto.getNome();
                linha[cont][2] = produto.calcularValor();
                cont++;  
            }
        }
        
        return(linha);
    }
    
    public Object[][] retornarRelatorioEletronicos(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][3];
        Iterator<Produto> iterator = LojaDepartamento.getProdutos().iterator();
        
        while(iterator.hasNext()){
            Produto produto = iterator.next();
            
            if(produto instanceof Eletronicos){
                linha[cont][0] = produto.getCodigoProduto();
                linha[cont][1] = produto.getNome();
                linha[cont][2] = produto.calcularValor();
                cont++;  
            }
        }
        
        return(linha);
    }
    
    public Object[][] retornarRelatorioEletrodomesticos(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][3];
        Iterator<Produto> iterator = LojaDepartamento.getProdutos().iterator();
        
        while(iterator.hasNext()){
            Produto produto = iterator.next();
            
            if(produto instanceof Eletrodomesticos){
                linha[cont][0] = produto.getCodigoProduto();
                linha[cont][1] = produto.getNome();
                linha[cont][2] = produto.calcularValor();
                cont++;  
            }
        }
        
        return(linha);
    }
    
    public Object[][] retornarRelatorioVestuario(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][3];
        Iterator<Produto> iterator = LojaDepartamento.getProdutos().iterator();
        
        while(iterator.hasNext()){
            Produto produto = iterator.next();
            
            if(produto instanceof Vestuario){
                linha[cont][0] = produto.getCodigoProduto();
                linha[cont][1] = produto.getNome();
                linha[cont][2] = produto.calcularValor();
                cont++;  
            }
        }
        
        return(linha);
    }
    
    public ArrayList<Produto> retornarRelatorioProdutosOrdenadosA(){
        Contexto contexto = new Contexto();
         
        contexto.setStrategy(new StrategyOrdenacaoA());
        Produto[] produtos = (Produto[]) LojaDepartamento.getProdutos().toArray();
        
        return contexto.executarStrategy(produtos);       
    }
    
    public ArrayList<Produto> retornarRelatorioProdutosOrdenadosB(){
        Contexto contexto = new Contexto();
         
        contexto.setStrategy(new StrategyOrdenacaoB());
        Produto[] produtos = (Produto[]) LojaDepartamento.getProdutos().toArray();
        
        return contexto.executarStrategy(produtos);  
    }
}
