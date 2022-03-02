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
public class Vestuario extends Produto{
    
    public Vestuario(){}
    
    public Vestuario(int codigoProduto, String nome, String descricao,
            Calendar dataFabricacao, float valor, Fornecedor fornecedor, boolean disponivel){
        super(codigoProduto, nome, descricao, dataFabricacao, valor, fornecedor, disponivel);
    }    
    
    @Override
    public float calcularValor(){
        return (float) (valor * 1.0125);
    }
}
