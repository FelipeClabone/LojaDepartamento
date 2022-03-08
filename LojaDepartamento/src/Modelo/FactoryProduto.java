/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Felipe de Freitas
 */
public class FactoryProduto {
    
    public static Produto factoryMethod(int codigoProduto, String nome, String descricao, 
            Calendar dataFabricacao, float valor, Fornecedor fornecedor, 
            boolean disponivel, String tipo){
        switch (tipo){
            case "Alimentacao":
                return new Alimentacao(codigoProduto, nome, descricao, dataFabricacao,
                                    valor, fornecedor, disponivel);
            case "Eletrodomesticos":
                return new Eletrodomesticos(codigoProduto, nome, descricao, dataFabricacao,
                                    valor, fornecedor, disponivel);
            case "Eletronicos":
                return new Eletronicos(codigoProduto, nome, descricao, dataFabricacao,
                                    valor, fornecedor, disponivel);
            case "Vestuario":
                return new Vestuario(codigoProduto, nome, descricao, dataFabricacao,
                                    valor, fornecedor, disponivel);
            default:
                return null;
        }
    }
}
