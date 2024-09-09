package org.example;

public class FuncionarioTempoIntegral extends Funcionario {
    private double bonus;

    public FuncionarioTempoIntegral(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1 + bonus / 100);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Bônus: " + bonus + "%");
        System.out.println("Salário com Bônus: " + calcularSalario());
    }
}
