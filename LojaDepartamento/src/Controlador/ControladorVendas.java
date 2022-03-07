/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CartaoCredito;
import Modelo.Cliente;
import Modelo.Dinheiro;
import Modelo.LojaDepartamento;
import Modelo.Pagamento;
import Modelo.Pix;
import Modelo.Usuario;
import Modelo.Venda;
import Modelo.Vendedor;
import java.util.Calendar;
import java.util.Iterator;

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
    
    public Iterator<Venda> retornarVenda(){
        
        Iterator<Venda> iterator = LojaDepartamento.getVendas().iterator();
        return(iterator);
    }
    
    public Object[][] retornarVendas(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][4];
        Iterator<Venda> iterator = LojaDepartamento.getVendas().iterator();
        
        while(iterator.hasNext()){
            Venda venda = iterator.next();
            
            linha[cont][0] = venda.getCodigoVenda();
            linha[cont][1] = venda.getCliente();
            linha[cont][2] = venda.getValorTotal();
            linha[cont][3] = venda.getVendedor();
            cont++;  
        }
        
        return(linha);
    }
    
    public Object[][] retornarVendasClienteEspecifico(int codigoCliente){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][3];
        Iterator<Venda> iterator = LojaDepartamento.getVendas().iterator();
        Iterator<Usuario> iteratorUsuario = LojaDepartamento.getUsuarios().iterator();
        
        Usuario usuarioPrincipal = null;
        while(iteratorUsuario.hasNext()){
            Usuario usuario = iteratorUsuario.next();
            
            if(usuario.getCodigoUsuario() == codigoCliente){
                usuarioPrincipal = usuario;
            }
            
        }
        
        while(iterator.hasNext()){
            Venda venda = iterator.next();
            
            if(venda.getCliente().equals(usuarioPrincipal)){
                linha[cont][0] = venda.getCodigoVenda();
                linha[cont][1] = venda.getValorTotal();
                linha[cont][2] = venda.getVendedor();
                cont++;  
            }
        }
        
        return(linha);
    }
    
    public Object[][] retornarVendasMesEspecifico(int codigoCliente){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][3];
        Iterator<Venda> iterator = LojaDepartamento.getVendas().iterator();
        Iterator<Usuario> iteratorUsuario = LojaDepartamento.getUsuarios().iterator();
        
        Usuario usuarioPrincipal = null;
        while(iteratorUsuario.hasNext()){
            Usuario usuario = iteratorUsuario.next();
            
            if(usuario.getCodigoUsuario() == codigoCliente){
                usuarioPrincipal = usuario;
            }
            
        }
        
        while(iterator.hasNext()){
            Venda venda = iterator.next();
            
            if(venda.getCliente().equals(usuarioPrincipal)){ //ALTERAR ESSE IF PARA COMPARAR OS MESES
                linha[cont][0] = venda.getCodigoVenda();
                linha[cont][1] = venda.getValorTotal();
                linha[cont][2] = venda.getVendedor();
                cont++;  
            }
        }
        
        return(linha);
    }
    
    public Object[][] retornarRelatorioPix(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][4];
        Iterator<Venda> iterator = LojaDepartamento.getVendas().iterator();
        
        while(iterator.hasNext()){
            Venda venda = iterator.next();
            
            if(venda.getFormaPagamento() instanceof Pix){
                linha[cont][0] = venda.getCodigoVenda();
                linha[cont][1] = venda.getCliente();
                linha[cont][2] = venda.getValorTotal();
                linha[cont][3] = venda.getVendedor();
                cont++;  
            }
        }
        
        return(linha);
    }
    
    public Object[][] retornarRelatorioCartaoCredito(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][4];
        Iterator<Venda> iterator = LojaDepartamento.getVendas().iterator();
        
        while(iterator.hasNext()){
            Venda venda = iterator.next();
            
            if(venda.getFormaPagamento() instanceof CartaoCredito){
                linha[cont][0] = venda.getCodigoVenda();
                linha[cont][1] = venda.getCliente();
                linha[cont][2] = venda.getValorTotal();
                linha[cont][3] = venda.getVendedor();
                cont++;  
            }
        }
        
        return(linha);
    }
    
    public Object[][] retornarRelatorioDinheiro(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][4];
        Iterator<Venda> iterator = LojaDepartamento.getVendas().iterator();
        
        while(iterator.hasNext()){
            Venda venda = iterator.next();
            
            if(venda.getFormaPagamento() instanceof Dinheiro){
                linha[cont][0] = venda.getCodigoVenda();
                linha[cont][1] = venda.getCliente();
                linha[cont][2] = venda.getValorTotal();
                linha[cont][3] = venda.getVendedor();
                cont++;  
            }
        }
        
        return(linha);
    }
}
