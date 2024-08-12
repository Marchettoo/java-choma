package org.example;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora(2,2);
        System.out.println("soma = "+ calc.somar());

        //calc.numeroB = 200;
        System.out.println("subtração = "+ calc.subtrair()); ;

        //new Calculadora(2,2).somar();
        //new Calculadora(2,2).subtrair();

        System.out.println("Numero A = "+ calc.getNumeroA());
        calc.setNumeroA(200);
        System.out.println("Numero A = "+ calc.getNumeroA());

        System.out.println("Numero B = "+ calc.getNumeroB());
        calc.setNumeroB(100);
        System.out.println("Numero B = "+ calc.getNumeroB());
    }
}