/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.LojaDepartamento;
import Modelo.Usuario;
import Modelo.Vendedor;
import java.util.Calendar;
import java.util.Iterator;


/**
 *
 * @author Felipe de Freitas
 */
public class ControladorUsuario {
    
    public ControladorUsuario(){}
    
    public void addCliente(int codigoUsuario, String nome, String cpf, String rg,
            Calendar dataNascimento, String endereco, String cep, String email,
            boolean clienteOuro){
        Cliente cliente = new Cliente(codigoUsuario, nome, cpf, rg, dataNascimento,
            endereco, cep, email, clienteOuro);
        LojaDepartamento.getUsuarios().add(cliente);
    }
    
    public void addVendedor(int codigoUsuario, String nome, String cpf, String rg,
            Calendar dataNascimento, String endereco, String cep, String email,
            float salario, String pis, Calendar dataAdmissao){
        Vendedor vendedor = new Vendedor(codigoUsuario, nome, cpf, rg, dataNascimento,
            endereco, cep, email, salario, pis, dataAdmissao);
        LojaDepartamento.getUsuarios().add(vendedor);
    }
    
    public Object[][] retornarRelatorioCliente(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][4];
        Iterator<Usuario> iterator = LojaDepartamento.getUsuarios().iterator();
        
        while(iterator.hasNext()){
            Usuario usuario = iterator.next();
            
            if(usuario instanceof Cliente){
                linha[cont][0] = usuario.getCodigoUsuario();
                linha[cont][1] = usuario.getNome();
                linha[cont][2] = usuario.getCpf();
                linha[cont][3] = ((Cliente) usuario).isClienteOuro();
                cont++;  
            }
        }
        
        return(linha);
    }
    
    public Object[][] retornarRelatorioClienteOuro(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][3];
        Iterator<Usuario> iterator = LojaDepartamento.getUsuarios().iterator();
        
        while(iterator.hasNext()){
            Usuario usuario = iterator.next();
            
            if(usuario instanceof Cliente){
                if(((Cliente) usuario).isClienteOuro() == true)
                    linha[cont][0] = usuario.getCodigoUsuario();
                    linha[cont][1] = usuario.getNome();
                    linha[cont][2] = usuario.getCpf();
                    cont++;  
            }
        }
        
        return(linha);
    }
    
    public Object[][] retornarRelatorioVendedor(){
        
        int cont = 0;
        Object[][] linha = new Object[LojaDepartamento.getProdutos().size()][4];
        Iterator<Usuario> iterator = LojaDepartamento.getUsuarios().iterator();
        
        while(iterator.hasNext()){
            Usuario usuario = iterator.next();
            
            if(usuario instanceof Vendedor){
                linha[cont][0] = usuario.getCodigoUsuario();
                linha[cont][1] = usuario.getNome();
                linha[cont][2] = usuario.getCpf();
                linha[cont][3] = ((Vendedor) usuario).getSalario();
                cont++;  
            }
        }
        
        return(linha);
    }
}
