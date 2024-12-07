package Colection;

import java.util.Scanner;

public class Estatisticas {

    private int PontosDeVida = 0;
    private int DefesaEspecial = 0;
    private int AtaqueEspecial = 0;
    private int Defesa = 0;
    private int Ataque = 0;
    private int Velocidade = 0;
    private String DexEntry = null;

    public int getPontosDeVida() {
        return PontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        int i = 2;
        Scanner scan = new Scanner(System.in);
        if (pontosDeVida > 0 && pontosDeVida <= 200)
            PontosDeVida = pontosDeVida;
        else {
            while (i != 1) {

                if (pontosDeVida > 0 && pontosDeVida <= 200) {

                    PontosDeVida = pontosDeVida;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de vida do pokemon:");
                    pontosDeVida = scan.nextInt();
                }
            }
        }
    }

    public int getDefesaEspecial() {
        return DefesaEspecial;
    }

    public void setDefesaEspecial(int defesaEspecial) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        if (defesaEspecial > 0 && defesaEspecial <= 200)
            DefesaEspecial = defesaEspecial;
        else {
            while (i != 1) {

                if (defesaEspecial > 0 && defesaEspecial <= 200) {

                    DefesaEspecial = defesaEspecial;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de defesa especial do pokemon:");
                    defesaEspecial = scan.nextInt();
                }
            }
        }
    }

    public int getDefesa() {
        return Defesa;
    }

    public void setDefesa(int defesa) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        if (defesa > 0 && defesa <= 200)
            Defesa = defesa;
        else {
            while (i != 1) {

                if (defesa > 0 && defesa <= 200) {

                    Defesa = defesa;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de defesa do pokemon:");
                    defesa = scan.nextInt();
                }
            }
        }
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int ataque) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        if (ataque > 0 && ataque <= 200)
            Ataque = ataque;
        else {
            while (i != 1) {

                if (ataque > 0 && ataque <= 200) {

                    Ataque = ataque;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de ataque do pokemon:");
                    ataque = scan.nextInt();
                }
            }
        }
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int velocidade) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        if (velocidade > 0 && velocidade <= 200)
            Velocidade = velocidade;
        else {
            while (i != 1) {

                if (velocidade > 0 && velocidade <= 200) {

                    Velocidade = velocidade;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de velocidade do pokemon:");
                    velocidade = scan.nextInt();
                }
            }
        }
    }

    public int getAtaqueEspecial() {
        return AtaqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        if (ataqueEspecial > 0 && ataqueEspecial <= 200)
            AtaqueEspecial = ataqueEspecial;
        else {
            while (i != 1) {

                if (ataqueEspecial > 0 && ataqueEspecial <= 200) {

                    AtaqueEspecial = ataqueEspecial;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de ataque especial do pokemon:");
                    ataqueEspecial = scan.nextInt();
                }
            }
        }
    }

    public Estatisticas(int pontosDeVida, int defesaEspecial, int ataqueEspecial, int defesa, int ataque,
            int velocidade, String dexEntry) {
        setPontosDeVida(pontosDeVida);
        setDefesaEspecial(defesaEspecial);
        setAtaqueEspecial(ataqueEspecial);
        setDefesa(defesa);
        setAtaque(ataque);
        setVelocidade(velocidade);
        DexEntry = dexEntry;
    }

    @Override
    public String toString() {
        return "Estatisticas:\nPontosDeVida = " + PontosDeVida + "\nDefesaEspecial = " + DefesaEspecial + "\nAtaqueEspecial = "
                + AtaqueEspecial + "\nDefesa = " + Defesa + "\nAtaque = " + Ataque + "\nVelocidade = " + Velocidade
                + "\nDexEntry = " + DexEntry ;
    }

    
}
