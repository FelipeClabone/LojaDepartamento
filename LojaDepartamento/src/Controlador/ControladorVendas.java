/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.LojaDepartamento;
import Modelo.Pagamento;
import Modelo.Venda;
import Modelo.Vendedor;
import java.util.Calendar;

/**
 *
 * @author Felipe de Freitas
 */
public class ControladorVendas {
    
    public ControladorVendas(){}
    
    public void addVenda(int codigoVenda, Cliente cliente, Vendedor vendedor, 
            Calendar dataVenda, float valorTotal, float valorDesconto, Pagamento formaPagamento){
        Venda venda = new Venda(codigoVenda, cliente, vendedor, dataVenda, 
                valorTotal, valorDesconto, formaPagamento);
        LojaDepartamento.getVendas().add(venda);
    }
}
