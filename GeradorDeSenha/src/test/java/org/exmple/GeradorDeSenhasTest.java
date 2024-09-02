package org.exmple;

import org.example.GeradorDeSenhas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeradorDeSenhasTest {

    GeradorDeSenhas gerador = new GeradorDeSenhas();

    @Test
    public void testGerarSenhaComApenasLetrasMinusculas() {

        String senha = gerador.gerarSenha(10, true, false, false, false);

        Assertions.assertEquals(10, senha.length());
        Assertions.assertTrue(senha.matches("[a-z]+"));
    }

    @Test
    public void testGerarSenhaComLetrasMaiusculasEMinusculas() {

        String senha = gerador.gerarSenha(12, true, true, false, false);

        Assertions.assertEquals(12, senha.length());
        Assertions.assertTrue(senha.matches("[a-zA-Z]+"));
    }

    @Test
    public void testGerarSenhaComNumerosESimbolos() {

        String senha = gerador.gerarSenha(15, false, false, true, true);

        Assertions.assertEquals(15, senha.length());
        Assertions.assertTrue(senha.matches("[0-9!@#$%^&*()\\-_=+\\[\\]{}|;:',.<>?/]+"));
    }

    @Test
    public void testGerarSenhaComTodosOsCaracteres() {

        String senha = gerador.gerarSenha(20, true, true, true, true);

        Assertions.assertEquals(20, senha.length());
        Assertions.assertTrue(senha.matches("[a-zA-Z0-9!@#$%^&*()\\-_=+\\[\\]{}|;:',.<>?/]+"));
    }

    @Test
    public void testGerarSenhaComTamanhoZero() {

        String senha = gerador.gerarSenha(0, true, true, true, true);

        Assertions.assertEquals(0, senha.length());
    }


}
