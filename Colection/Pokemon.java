package Colection;

import java.util.Scanner;

public class Pokemon{
    
    protected String nome;
    protected int level;
    protected float altura;
    protected float peso;
    protected Pokemon evoluçao1, evoluçao2;
    private Scanner scan= new Scanner(System.in);

    public float getAltura() {
        return altura;
    }

    public void adicionarAltura() {

        float altura;

        System.out.println("Qual a altura do seu pokemón?(em Metros)");
        altura=scan.nextFloat();

        if(altura>0){

            this.altura = altura;
        }
        else{
            this.altura = 1;
        }
    }

    public float getPeso() {
        return peso;
    }

    public void adicionarPeso() {

        float peso;

        System.out.println("Qual o peso do pokemón?(em Kg)");
        peso=scan.nextFloat();

        if(peso>0){
        this.peso = peso;
        }
        else{
            this.peso=10;
        }
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNome() {

        String nome;

        System.out.println("QUEM É ESSE POKEMÓN???????");
        nome=scan.nextLine();

            this.nome= nome;
    }

    public int getLevel() {
        return level;
    }

    public void adicionarLevel() {

        int level;

        System.out.println("Qual o level do seu Pokemón?");
        level=scan.nextInt();

        if(level>0){
        this.level = level;
        }
        else{
            this.level=1;
        }
    }

    public void adicionarEvoluçao1(Pokemon evoluçao){

        if(evoluçao.getLevel()>level){
            evoluçao1=evoluçao;
        }
        else{
            System.out.println("Level do pokemon abaixo da fase inicial");
        }


    }

    public void adicionarEvoluçao2(Pokemon evoluçao){
        if(evoluçao.getLevel()>evoluçao1.getLevel() && evoluçao1.getLevel()!=0){
            evoluçao2= evoluçao;
        }
        else{
            System.out.println("Level do pokemon abaixo da primeira evoluçao ou primeira evoluçao ainda nao criada");
        }
    }

    
    
    
    
}
