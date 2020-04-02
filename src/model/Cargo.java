/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author laert
 */
public class Cargo {
    private int id;
    private int codigo;
    private String nome;
    private double salario;

    public Cargo() {
    }

    public Cargo(int codigo, String nome, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }
    
    public Cargo(int id, int codigo, String nome, double salario) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
