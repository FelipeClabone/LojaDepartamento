/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Felipe de Freitas
 */
public class Venda {
    private int codigoVenda;
    private Cliente cliente;
    private Vendedor vendedor;
    private Calendar dataVenda;
    private static ArrayList<ItemVenda> itensVenda = new ArrayList();
    private float valorTotal;
    private float valorDesconto;
    private Pagamento formaPagamento;
    
    public Venda(){}
    
    public Venda(int codigoVenda, Cliente cliente, Vendedor vendedor, Calendar dataVenda,
            float valorTotal, float valorDesconto, Pagamento formaPagamento){
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.formaPagamento = formaPagamento;
    }

    public static void addItemVenda(int codigoProduto, float valor, int quantidade){
        ItemVenda item = new ItemVenda(codigoProduto, valor, quantidade);
        Venda.itensVenda.add(item);
    }
    
    public float calcularValorTotal(){
        float valorTotal = 0;
        for(ItemVenda item : itensVenda){
            valorTotal = item.calcularValor();
        }
        
        if(cliente.isClienteOuro() == true){
            valorTotal = (float) (valorTotal - valorTotal*0.02);
        }
        
        return valorTotal;
    }
            
    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }
}
