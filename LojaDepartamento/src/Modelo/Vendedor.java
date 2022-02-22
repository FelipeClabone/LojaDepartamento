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
public class Vendedor extends Usuario{
    
    private float salario;
    private String pis;
    private Calendar dataAdmissao;
    
    Vendedor(){}
    
    Vendedor(int codigoUsuario, String nome, String cpf, String rg,
            Calendar dataNascimento, String endereco, String cep, String email,
            float salario, String pis, Calendar dataAdmissao){
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
