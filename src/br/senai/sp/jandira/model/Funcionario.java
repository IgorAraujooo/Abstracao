package br.senai.sp.jandira.model;

abstract class Funcionario {
    private String nome;
    private int id;
    private double salarioBase;

    public Funcionario(String nome, int id, double salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public int getID() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
