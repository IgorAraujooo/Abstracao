package br.senai.sp.jandira.model;

public class Gerente extends Funcionario{
    private double bonusGerencia;

    public Gerente(String nome, int ID, double salarioBase, double bonusGerencia) {
        super(nome, ID, salarioBase);
        this.bonusGerencia = bonusGerencia;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonusGerencia;
    }

    public double getBonusGerencia() {
        return bonusGerencia;
    }
}

