package Colection;

import java.util.Scanner;

public class Pokemon {

    private String nome;
    private int level;
    private float altura;
    private float peso;
    private Pokemon evoluçao1 = null, evoluçao2 = null;
    private Scanner scan = new Scanner(System.in);
    private int id;
    private Estatisticas status = new Estatisticas(0, 0, 0, 0, 0, 0, null);

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public int getLevel() {
        return level;
    }

    public void adicionarEvoluçao1(Pokemon evoluçao) {

        if (evoluçao.getLevel() > level) {
            evoluçao1 = evoluçao;
        } else {
            System.out.println("Level do pokemon abaixo da fase inicial");
        }

    }

    public void adicionarEvoluçao2(Pokemon evoluçao) {
        if (evoluçao.getLevel() > evoluçao1.getLevel() && evoluçao1 != null) {
            evoluçao2 = evoluçao;
        } else {
            System.out.println("Level do pokemon abaixo da primeira evoluçao ou primeira evoluçao ainda nao criada");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLevel(int level) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        if (level > 0 && level < 100) {
            this.level = level;
        } else {
            while (i != 1) {
                if (level > 0 && level < 100) {
                    this.level = level;
                    i = 1;
                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("Insira um level válido:");
                    level = scan.nextInt();
                }
            }
        }
    }

    public void setAltura(float altura) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        if (altura > 0 && altura < 50) {
            this.altura = altura;
        } else {
            while (i != 1) {
                if (altura > 0 && altura < 50) {
                    this.altura = altura;
                    i = 1;
                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("Insira um altura válido:");
                    altura = scan.nextInt();
                }
            }
        }
    }

    public void setPeso(float peso) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        if (peso > 0 && peso < 1000) {
            this.peso = peso;
        } else {
            while (i != 1) {
                if (peso > 0 && peso < 1000) {
                    this.peso = peso;
                    i = 1;
                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("Insira um peso válido:");
                    peso = scan.nextInt();
                }
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pokemon(String nome, int level, float altura, float peso, Estatisticas status) {
        this.nome = nome;
        setLevel(level);
        setAltura(altura);
        setPeso(peso);
        this.status = status;
    }

    public Pokemon(String nome, int level) {
        this.nome = nome;
        this.level = level;
    }

    @Override
    public String toString() {
        if (evoluçao1 == null) {
            return "\nNome = " + nome + "\nlevel = " + level + "\naltura = " + altura + "\npeso = " + peso
                    + "\nevoluçao1 = "
                    + evoluçao1 + "\nevoluçao2 = " + evoluçao2 + "\nid = " + id + "\n" + status;
        } else {
            if (evoluçao2 == null) {
                return "\nNome = " + nome + "\nlevel = " + level + "\naltura = " + altura + "\npeso = " + peso
                        + "\nevoluçao1 = "
                        + evoluçao1.getNome() + "\nevoluçao2 = " + evoluçao2 + "\nid = " + id + "\n" + status;
            } else {
                return "\nNome = " + nome + "\nlevel = " + level + "\naltura = " + altura + "\npeso = " + peso
                        + "\nevoluçao1 = "
                        + evoluçao1.getNome() + "\nevoluçao2 = " + evoluçao2.getNome() + "\nid = " + id + "\n"
                        + status;
            }
        }

    }

}
