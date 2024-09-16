package org.example;

public class Reuniao extends Evento {
    private boolean isPrivada;
    private String senha;

    public Reuniao(String nome, String data, boolean isPrivada, String senha) {
        super(nome, data);
        this.isPrivada = isPrivada;
        this.senha = senha;
    }

    public boolean acessarReuniao(String senhaInserida) {
        if (isPrivada) {
            return senhaInserida != null && senhaInserida.equals(senha);
        }
        return true;
    }

    @Override
    public boolean validar() {
        return !isPrivada || (senha != null && !senha.isEmpty());
    }
}
