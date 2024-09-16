package org.example;

public class Main {
    public static void main(String[] args) {

        Workshop workshop = new Workshop("Workshop Java", "2024-10-10");
        for (int i = 1; i <= 30; i++) {
            if (workshop.inscreverParticipante("Participante " + i)) {
                System.out.println("Participante " + i + " inscrito.");
            } else {
                System.out.println("Não foi possível inscrever o Participante " + i + ". Limite atingido.");
            }
        }

        Reuniao reuniaoPublica = new Reuniao("Reunião Pública", "2024-11-10", false, null);
        System.out.println("Reunião Pública válida: " + reuniaoPublica.validar());

        Reuniao reuniaoPrivada = new Reuniao("Reunião Privada", "2024-12-15", true, "senha123");
        System.out.println("Acesso à reunião privada com senha correta: " + reuniaoPrivada.acessarReuniao("senha123"));
        System.out.println("Acesso à reunião privada com senha incorreta: " + reuniaoPrivada.acessarReuniao("senhaErrada"));

        EventoCorporativo eventoCorporativo = new EventoCorporativo("Evento Corporativo", "2024-12-10", "Sala A", "Refeitório");
        System.out.println("Evento Corporativo válido: " + eventoCorporativo.validar());
    }
}
