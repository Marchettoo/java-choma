package org.example;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;
    private double bolsaAuxilio;

    public Estagiario(String nome, String cpf, String instituicaoEnsino, double bolsaAuxilio) {
        super(nome, cpf, 0);
        this.instituicaoEnsino = instituicaoEnsino;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Instituição de Ensino: " + instituicaoEnsino);
        System.out.println("Bolsa Auxílio: " + bolsaAuxilio);
    }
}
