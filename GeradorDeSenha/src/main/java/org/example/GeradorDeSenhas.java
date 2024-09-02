package org.example;

import java.security.SecureRandom;

public class GeradorDeSenhas {

    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITOS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    public String gerarSenha(int tamanho, boolean incluirMinusculas, boolean incluirMaiusculas, boolean incluirNumeros, boolean incluirSimbolos) {
        if (tamanho <= 0) {
            return "";
        }

        StringBuilder caracteresDisponiveis = new StringBuilder();
        if (incluirMinusculas) caracteresDisponiveis.append(LETRAS_MINUSCULAS);
        if (incluirMaiusculas) caracteresDisponiveis.append(LETRAS_MAIUSCULAS);
        if (incluirNumeros) caracteresDisponiveis.append(DIGITOS);
        if (incluirSimbolos) caracteresDisponiveis.append(SIMBOLOS);

        if (caracteresDisponiveis.length() == 0) {
            throw new IllegalArgumentException("Pelo menos uma categoria de caracteres deve ser incluída");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            int indiceAleatorio = random.nextInt(caracteresDisponiveis.length());
            senha.append(caracteresDisponiveis.charAt(indiceAleatorio));
        }

        return senha.toString();
    }
}