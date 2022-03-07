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
public class StrategyOrdenacaoB implements OrdenacaoStrategy{
    private static ArrayList<Produto> produtosOrdenados = new ArrayList();;
    
    @Override
    public ArrayList<Produto> executarOrdenacao(Produto[] produtos){        
        int j;
        float key;
        Produto keyProduto;
        int i;

        for (j = 1; j < produtos.length; j++){
            key = produtos[j].calcularValor();
            keyProduto = produtos[j];
            for (i = j - 1; (i >= 0) && (produtos[i].calcularValor() > key); i--){
                produtos[i + 1] = produtos[i];
            }
            produtos[i + 1] = keyProduto;
        }
        
        
        produtosOrdenados.addAll(Arrays.asList(produtos));
        
        return produtosOrdenados;
    }
}
