import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import Colection.Estatisticas;
import Colection.Pokemon;

public class main {
    public static void main(String[] args) {
        Estatisticas estatisticas = new Estatisticas(20, 30, 40, 20, 10, 100, "Pokemon veloz que adora voar pelos áres de alola.");
        Pokemon pokemon1 = new Pokemon("Passaro", 20, -2, 40, estatisticas);
        System.out.println(pokemon1.toString()); 
       }
}
