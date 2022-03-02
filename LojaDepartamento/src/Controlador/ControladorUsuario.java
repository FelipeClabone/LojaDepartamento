/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.LojaDepartamento;
import Modelo.Vendedor;
import java.util.Calendar;


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
}
