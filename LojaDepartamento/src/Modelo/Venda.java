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
public class Venda {
    private int codigoVenda;
    private Cliente cliente;
    private Vendedor vendedor;
    private Calendar dataVenda;
    //private ArrayList<ItemVenda> itensVenda
    private float valorTotal;
    private float valorDesconto;
    private String formaPagamento; //vai ser da classe Pagamento
    
    Venda(){}
    
    Venda(int codigoVenda, Cliente cliente, Vendedor vendedor, Calendar dataVenda,
            float valorTotal, float valorDesconto, String formaPagamento){
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.formaPagamento = formaPagamento;
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

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
