/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Felipe de Freitas
 */
public class Contexto {
    private OrdenacaoStrategy strategy;

    public void setStrategy(OrdenacaoStrategy strategy) {
        this.strategy = strategy;
    }
    
    public ArrayList<Produto> executarStrategy(ArrayList<Produto> produtosGeral){
        return strategy.executarOrdenacao(produtosGeral);
    }
}
