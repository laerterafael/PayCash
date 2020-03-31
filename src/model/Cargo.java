/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author laert
 */
public class Cargo {
    private int codigo;
    private String nome;
    private double salario;
    ArrayList <Funcionario> funcionario_list;

    public Cargo() {
    }

    public Cargo(int codigo, String nome, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionario_list() {
        return funcionario_list;
    }

    public void setFuncionario_list(ArrayList<Funcionario> funcionario_list) {
        this.funcionario_list = funcionario_list;
    }
    
    
}
