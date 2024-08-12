package org.example;

public class Calculadora {

    private int numeroA;

    private int numeroB;



    // construtor
    public Calculadora(int numeroA, int numeroB){
        this.numeroA =  numeroA;
        this.numeroB = numeroB;
    }

    int somar(){
        return numeroA + numeroB;
    }

    int subtrair(){
        return numeroA - numeroB;
    }

    public  int getNumeroA(){
        return this.numeroA;
    }

    public void setNumeroA(int numeroA){
        this.numeroA = numeroA;
    }

    public  int getNumeroB(){
        return this.numeroB;
    }

    public void setNumeroB(int numeroB){
        this.numeroB = numeroB;
    }
}
