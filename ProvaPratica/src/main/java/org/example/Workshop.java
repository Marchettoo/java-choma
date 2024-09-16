package org.example;

import java.util.ArrayList;
import java.util.List;

public class Workshop extends Evento {
    private List<String> participantes;
    private final int LIMITE_PARTICIPANTES = 30;

    public Workshop(String nome, String data) {
        super(nome, data);
        this.participantes = new ArrayList<>();
    }

    public boolean inscreverParticipante(String participante) {
        if (participantes.size() < LIMITE_PARTICIPANTES) {
            participantes.add(participante);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validar() {
        return participantes.size() <= LIMITE_PARTICIPANTES;
    }
}

