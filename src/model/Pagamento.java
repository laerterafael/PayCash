/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author laert
 */
public class Pagamento {
    private int id;
    private double valor;
    private Date data;
    private int status;
    private Funcionario funcionario;
    
    public Pagamento() {
        
    }

    public Pagamento(int id, double valor, Date data, int status, Funcionario funcionario) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.status = status;
        this.funcionario = funcionario;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
