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
public class Cliente extends Usuario{
    private boolean clienteOuro;
    
    public Cliente(){}
    
    public Cliente(int codigoUsuario, String nome, String cpf, String rg,
            Calendar dataNascimento, String endereco, String cep, String email,
            boolean clienteOuro){
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.clienteOuro = clienteOuro;
    }

    public boolean isClienteOuro() {
        return clienteOuro;
    }

    public void setClienteOuro(boolean clienteOuro) {
        this.clienteOuro = clienteOuro;
    }
}
