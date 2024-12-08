import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Colection.Estatisticas;
import Colection.Pokemon;
import Colection.Tipos;

public class main {
    public static void main(String[] args) {

        Estatisticas estatisticas = new Estatisticas(20, 30, -40, 20, 10, 100,
                "Pokemon veloz que adora voar pelos áres de alola.");

        Tipos tipo = new Tipos("Pedra", "Voador");
        Pokemon pokemon1 = new Pokemon("Passaro", 20, 2, 40, 0, estatisticas, tipo);
        System.out.println(pokemon1.toString());

        Pokemon evolucao = new Pokemon("Passaro Grande", 30);

        pokemon1.adicionarEvoluçao1(evolucao);
        System.out.println(pokemon1.toString());

        Pokemon evolucao2 = new Pokemon("Passaro Muito Grande", 50);
        pokemon1.adicionarEvoluçao2(evolucao2);
        System.out.println(pokemon1.toString());
    }
}
