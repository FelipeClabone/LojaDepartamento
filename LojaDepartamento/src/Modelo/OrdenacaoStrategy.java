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
public interface OrdenacaoStrategy {
    
    public ArrayList<Produto> executarOrdenacao(ArrayList<Produto> produtosGeral);
}
