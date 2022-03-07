/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Felipe de Freitas
 */
public class StrategyOrdenacaoA implements OrdenacaoStrategy{
    //private Produto produtos[];
    private static ArrayList<Produto> produtosOrdenados = new ArrayList();;
    //private int cont;
    
    @Override
    public ArrayList<Produto> executarOrdenacao(Produto[] produtos){
        /**
        for(Produto produto : produtosGeral){
            produtos[cont] = produto;
            cont++;
        }
        */
        boolean troca = true;
        Produto aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < produtos.length - 1; i++) {
                if (produtos[i].calcularValor() > produtos[i + 1].calcularValor()) {
                    aux = produtos[i];
                    produtos[i] = produtos[i + 1];
                    produtos[i + 1] = aux;
                    troca = true;
                }
            }
        }
        
        produtosOrdenados.addAll(Arrays.asList(produtos));
        
        return produtosOrdenados;
    }
}
