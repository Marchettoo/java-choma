package org.example;

public class Pontuacao {
    private int pontuacao;

    public Pontuacao() {
        this.pontuacao = 0; // Inicializa a pontuação com 0
    }

    public void adicionarPontos(int pontos) {
        this.pontuacao += pontos;
    }

    public void removerPontos(int pontos) {
        if (this.pontuacao - pontos < 0) {
            this.pontuacao = 0; // Não permitir pontuação negativa
        } else {
            this.pontuacao -= pontos;
        }
    }

    public int getPontuacao() {
        return this.pontuacao;
    }
}
