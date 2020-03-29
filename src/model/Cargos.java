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
public class Cargos {
    private int codigo;
    private String nome;
    ArrayList <Funcionario> funcionario_list;

    public Cargos() {
        funcionario_list = new ArrayList ();
    }

    public Cargos(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        funcionario_list = new ArrayList ();
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
