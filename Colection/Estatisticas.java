package Colection;

import java.util.Scanner;

public class Estatisticas {

    private int pontosDeVida = 0;
    private int defesaEspecial = 0;
    private int ataqueEspecial = 0;
    private int defesa = 0;
    private int ataque = 0;
    private int velocidade = 0;
    private String DexEntry = null;
    Scanner scan = new Scanner(System.in);

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        int i = 0;
        if (pontosDeVida > 0 && pontosDeVida <= 200) {
            this.pontosDeVida = pontosDeVida;
        }
        if (pontosDeVida < 0 || pontosDeVida > 200) {
            while (i != 1) {

                if (pontosDeVida > 0 && pontosDeVida <= 200) {

                    this.pontosDeVida = pontosDeVida;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de vida do pokemon:");
                    pontosDeVida = scan.nextInt();
                    scan.nextLine();
                }
            }
        }
    }

    public int getDefesaEspecial() {
        return defesaEspecial;
    }

    public void setDefesaEspecial(int defesaEspecial) {
        int i = 0;
        if (defesaEspecial > 0 && defesaEspecial <= 200) {
            this.defesaEspecial = defesaEspecial;
        }
        if (defesaEspecial < 0 || defesaEspecial > 200)
            while (i != 1) {

                if (defesaEspecial > 0 && defesaEspecial <= 200) {

                    this.defesaEspecial = defesaEspecial;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de defesa especial do pokemon:");
                    defesaEspecial = scan.nextInt();
                    scan.nextLine();
                }
            }
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        int i = 0;
        if (defesa > 0 && defesa <= 200) {
            this.defesa = defesa;
        }
        if (defesa < 0 || defesa > 200)
            while (i != 1) {

                if (defesa > 0 && defesa <= 200) {

                    this.defesa = defesa;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de defesa do pokemon:");
                    defesa = scan.nextInt();
                    scan.nextLine();
                }
            }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        int i = 0;
        if (ataque > 0 && ataque <= 200) {
            this.ataque = ataque;
        }
        if (ataque < 0 || ataque > 200)
            while (i != 1) {

                if (ataque > 0 && ataque <= 200) {

                    this.ataque = ataque;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de ataque do pokemon:");
                    ataque = scan.nextInt();
                    scan.nextLine();
                }
            }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        int i = 0;
        if (velocidade > 0 && velocidade <= 200) {
            this.velocidade = velocidade;
        }
        if (velocidade < 0 || velocidade > 200)
            while (i != 1) {

                if (velocidade > 0 && velocidade <= 200) {

                    this.velocidade = velocidade;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de velocidade do pokemon:");
                    velocidade = scan.nextInt();
                    scan.nextLine();
                }
            }
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        int i = 0;
        if (ataqueEspecial > 0 && ataqueEspecial <= 200) {
            this.ataqueEspecial = ataqueEspecial;
        }
        if (velocidade < 0 || velocidade > 200)
            while (i != 1) {

                if (ataqueEspecial > 0 && ataqueEspecial <= 200) {

                    this.ataqueEspecial = ataqueEspecial;
                    i = 1;

                } else {
                    System.out.println("Valor invalido.");
                    System.out.println("O valor deve ser maior que 0 e menor que 200.");
                    System.out.println("Insira os pontos de ataque especial do pokemon:");
                    ataqueEspecial = scan.nextInt();
                    scan.nextLine();
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
        return "Pontos De Vida = " + pontosDeVida + "\nDefesa Especial = " + defesaEspecial
                + "\nAtaque Especial = "
                + ataqueEspecial + "\nDefesa = " + defesa + "\nAtaque = " + ataque + "\nVelocidade = " + velocidade
                + "\nDex Entry = " + DexEntry;
    }

}
