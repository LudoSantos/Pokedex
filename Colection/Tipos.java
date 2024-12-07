import java.util.ArrayList;
import java.util.Scanner;

public class Tipos{
    protected String tipo1;
    protected String tipo2;
    protected ArrayList<Colunas> fraquezas;
    protected ArrayList<String> vantagens;

    public Tipos(String tipo1, String tipo2) {
        fraquezas = new ArrayList<>();
        vantagens = new ArrayList<>();
        if(tipo1!=null) this.tipo1=setTipo(tipo1);
        if(tipo2!=null) this.tipo2=setTipo(tipo2);
    }

    public String getTipo1() {
        return tipo1;
    }
    public String getTipo2() {
        return tipo2;
    }

    public String setTipo(String tipo) {
        Scanner scan = new Scanner(System.in);
        boolean verificador=false;
        while(verificador==false){
            if(tipo=="Normal" || tipo=="normal" || tipo=="Planta" || tipo=="planta" || tipo=="Fogo" || tipo=="fogo"|| tipo=="Água" || tipo=="água" || tipo=="Elétrico" || tipo=="elétrico" || tipo=="Voador" || tipo=="voador" || tipo=="Gelo" || tipo=="gelo" || tipo=="Pedra" || tipo=="pedra" || tipo=="Terrestre" || tipo=="terrestre" || tipo=="Aço" || tipo=="aço" || tipo=="Lutador" || tipo=="lutador" || tipo=="Sombrio" || tipo=="sombrio" || tipo=="Psíquico" || tipo=="psíquico" || tipo=="Venenoso" || tipo=="venenoso" || tipo=="Inseto" || tipo=="inseto" || tipo=="Fada" || tipo=="fada" || tipo=="Fantasma" || tipo=="fantasma" || tipo=="Dragão" || tipo=="dragão"){
                verificador=true;
                if(tipo!=tipo1){
                    if(tipo=="Normal" || tipo=="normal"){
                        fraquezas.add(new Colunas("Lutador", 2.0, 5));
                        fraquezas.add(new Colunas("Fantasma", 0, 1));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Gelo", 1.0, 4));
                        fraquezas.add(new Colunas("Planta", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        fraquezas.add(new Colunas("Inseto", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));

                        vantagens.add("Nenhuma");
                        return tipo;
                    }

                    if(tipo=="Planta" || tipo=="planta"){
                        fraquezas.add(new Colunas("Água", 0.5, 3));
                        fraquezas.add(new Colunas("Elétrico", 0.5, 3));
                        fraquezas.add(new Colunas("Planta", 0.5, 3));
                        fraquezas.add(new Colunas("Terrestre", 0.5, 3));
                        fraquezas.add(new Colunas("Fogo", 2.0, 5));
                        fraquezas.add(new Colunas("Gelo", 2.0, 5));
                        fraquezas.add(new Colunas("Voador", 2.0, 5));
                        fraquezas.add(new Colunas("Inseto", 2.0, 5));
                        fraquezas.add(new Colunas("Venenoso", 2.0, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Lutador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));

                        vantagens.add("Terrestre");
                        vantagens.add("Pedra");
                        vantagens.add("Água");
                        return tipo;
                    }

                    if(tipo=="Fogo" || tipo=="fogo"){
                        fraquezas.add(new Colunas("Aço", 0.5, 3));
                        fraquezas.add(new Colunas("Fogo", 0.5, 3));
                        fraquezas.add(new Colunas("Planta", 0.5, 3));
                        fraquezas.add(new Colunas("Gelo", 0.5, 3));
                        fraquezas.add(new Colunas("Inseto", 0.5, 3));
                        fraquezas.add(new Colunas("Fada", 0.5, 3));
                        fraquezas.add(new Colunas("Água", 2, 5));
                        fraquezas.add(new Colunas("Terrestre", 2, 5));
                        fraquezas.add(new Colunas("Pedra", 2, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Lutador", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));

                        vantagens.add("Inseto");
                        vantagens.add("Planta");
                        vantagens.add("Gelo");
                        vantagens.add("Aço");
                        return tipo;
                    }

                    if(tipo=="Água" || tipo=="água"){
                        fraquezas.add(new Colunas("Fogo", 0.5, 3));
                        fraquezas.add(new Colunas("Água", 0.5, 3));
                        fraquezas.add(new Colunas("Gelo", 0.5, 3));
                        fraquezas.add(new Colunas("Aço", 0.5, 3));
                        fraquezas.add(new Colunas("Planta", 2, 5));
                        fraquezas.add(new Colunas("Elétrico", 2, 5));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Lutador", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));

                        vantagens.add("Fogo");
                        vantagens.add("Terrestre");
                        vantagens.add("Pedra");
                        return tipo;
                    }

                    if(tipo=="Elétrico" || tipo=="elétrico"){
                        fraquezas.add(new Colunas("Elétrico", 0.5, 3));
                        fraquezas.add(new Colunas("Voador", 0.5, 3));
                        fraquezas.add(new Colunas("Aço", 0.5, 3));
                        fraquezas.add(new Colunas("Terrestre", 2, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Fogo", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Gelo", 1.0, 4));
                        fraquezas.add(new Colunas("Lutador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));

                        vantagens.add("Água");
                        vantagens.add("Voador");
                        return tipo;
                    }

                    if(tipo=="Voador" || tipo=="voador"){
                        fraquezas.add(new Colunas("Planta", 0.5, 3));
                        fraquezas.add(new Colunas("Lutador", 0.5, 3));
                        fraquezas.add(new Colunas("Inseto", 0.5, 3));
                        fraquezas.add(new Colunas("Elétrico", 2, 5));
                        fraquezas.add(new Colunas("Pedra", 2, 5));
                        fraquezas.add(new Colunas("Gelo", 2, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Fogo", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));
                        
                        vantagens.add("Inseto");
                        vantagens.add("Lutador");
                        vantagens.add("Planta");
                        return tipo;
                    }

                    if(tipo=="Gelo" || tipo=="gelo"){
                        fraquezas.add(new Colunas("Gelo", 0.5, 3));
                        fraquezas.add(new Colunas("Fogo", 2, 5));
                        fraquezas.add(new Colunas("Pedra", 2, 5));
                        fraquezas.add(new Colunas("Lutador", 2, 5));
                        fraquezas.add(new Colunas("Aço", 2, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Lutador", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));
                        
                        vantagens.add("Dragão");
                        vantagens.add("Voador");
                        vantagens.add("Planta");
                        vantagens.add("Terrestre");
                        return tipo;
                    }

                    if(tipo=="Pedra" || tipo=="pedra"){
                        fraquezas.add(new Colunas("Venenoso", 0.5, 3));
                        fraquezas.add(new Colunas("Normal", 0.5, 3));
                        fraquezas.add(new Colunas("Fogo", 0.5, 3));
                        fraquezas.add(new Colunas("Voador", 0.5, 3));
                        fraquezas.add(new Colunas("Água", 2, 5));
                        fraquezas.add(new Colunas("Planta", 2, 5));
                        fraquezas.add(new Colunas("Lutador", 2, 5));
                        fraquezas.add(new Colunas("Terrestre", 2, 5));
                        fraquezas.add(new Colunas("Aço", 2, 5));
                        fraquezas.add(new Colunas("Psíquico", 2, 5));
                        fraquezas.add(new Colunas("Fada", 2, 5));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));

                        vantagens.add("Inseto");
                        vantagens.add("Voador");
                        vantagens.add("Fogo");
                        vantagens.add("Gelo");
                        return tipo;
                    }

                    if(tipo=="Terrestre" || tipo=="terrestre"){
                        fraquezas.add(new Colunas("Elétrico", 0.0, 1));
                        fraquezas.add(new Colunas("Venenoso", 0.5, 3));
                        fraquezas.add(new Colunas("Pedra", 0.5, 3));
                        fraquezas.add(new Colunas("Água", 2, 5));
                        fraquezas.add(new Colunas("Planta", 2, 5));
                        fraquezas.add(new Colunas("Gelo", 2, 5));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Lutador", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));

                        vantagens.add("Elétrico");
                        vantagens.add("Venenoso");
                        vantagens.add("Aço");
                        vantagens.add("Pedra");
                        vantagens.add("Fogo");
                        return tipo;
                    }

                    if(tipo=="Aço" || tipo=="aço"){
                        fraquezas.add(new Colunas("Venenoso", 0.0, 1));
                        fraquezas.add(new Colunas("Normal", 0.25, 2));
                        fraquezas.add(new Colunas("Gelo", 0.25, 2));
                        fraquezas.add(new Colunas("Dragão", 0.25, 2));
                        fraquezas.add(new Colunas("Fada", 0.25, 2));
                        fraquezas.add(new Colunas("Pedra",  0.5, 3));
                        fraquezas.add(new Colunas("Voador",  0.5, 3));
                        fraquezas.add(new Colunas("Psíquico",  0.5, 3));
                        fraquezas.add(new Colunas("Inseto",  0.5, 3));
                        fraquezas.add(new Colunas("Planta",  0.5, 3));
                        fraquezas.add(new Colunas("Fogo", 1.0, 4));
                        fraquezas.add(new Colunas("Terrestre", 1.0, 4));
                        fraquezas.add(new Colunas("Lutador", 1.0, 4));
                        
                        vantagens.add("Fada");
                        vantagens.add("Gelo");
                        vantagens.add("Pedra");
                        return tipo;
                    }

                    if(tipo=="Lutador" || tipo=="lutador"){
                        fraquezas.add(new Colunas("Sombrio", 0.5, 3));
                        fraquezas.add(new Colunas("Pedra", 0.5, 3));
                        fraquezas.add(new Colunas("Inseto", 0.5, 3));
                        fraquezas.add(new Colunas("Voador", 2, 5));
                        fraquezas.add(new Colunas("Psíquico", 2, 5));
                        fraquezas.add(new Colunas("Fada", 2, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Fogo", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Gelo", 1.0, 4));
                        fraquezas.add(new Colunas("Planta", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));

                        vantagens.add("Sombrio");
                        vantagens.add("Gelo");
                        vantagens.add("Normal");
                        vantagens.add("Pedra");
                        vantagens.add("Aço");
                        return tipo;
                    }

                    if(tipo=="Sombrio" || tipo=="sombrio"){
                        fraquezas.add(new Colunas("Psíquico", 0.0, 1));
                        fraquezas.add(new Colunas("Fantasma", 0.5, 3));
                        fraquezas.add(new Colunas("Sombrio", 0.5, 3));
                        fraquezas.add(new Colunas("Lutador", 2, 5));
                        fraquezas.add(new Colunas("Inseto", 2, 5));
                        fraquezas.add(new Colunas("Fada", 2, 5));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Fogo", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Gelo", 1.0, 4));
                        fraquezas.add(new Colunas("Planta", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        
                        vantagens.add("Fantasma");
                        vantagens.add("Psíquico");
                        return tipo;
                    }

                    if(tipo=="Psíquico" || tipo=="psíquico"){
                        fraquezas.add(new Colunas("Psíquico", 0.5, 3));
                        fraquezas.add(new Colunas("Lutador", 0.5, 3));
                        fraquezas.add(new Colunas("Inseto", 2.0, 5));
                        fraquezas.add(new Colunas("Fantasma", 2.0, 5));
                        fraquezas.add(new Colunas("Sombrio", 2.0, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Fogo", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Gelo", 1.0, 4));
                        fraquezas.add(new Colunas("Planta", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));

                        vantagens.add("Lutador");
                        vantagens.add("Venenoso");
                        return tipo;
                    }

                    if(tipo=="Venenoso" || tipo=="venenoso"){
                        fraquezas.add(new Colunas("Venenoso", 0.5, 3));
                        fraquezas.add(new Colunas("Inseto", 0.5, 3));
                        fraquezas.add(new Colunas("Fada", 0.5, 3));
                        fraquezas.add(new Colunas("Lutador", 0.5, 3));
                        fraquezas.add(new Colunas("Planta", 0.5, 3));
                        fraquezas.add(new Colunas("Terrestre", 2.0, 5));
                        fraquezas.add(new Colunas("Psíquico", 2.0, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Fogo", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Gelo", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        
                        vantagens.add("Fada");
                        vantagens.add("Planta");
                        return tipo;
                    }

                    if(tipo=="Inseto" || tipo=="inseto"){
                        fraquezas.add(new Colunas("Lutador", 0.5, 3));
                        fraquezas.add(new Colunas("Planta", 0.5, 3));
                        fraquezas.add(new Colunas("Terrestre", 0.5, 3));
                        fraquezas.add(new Colunas("Fogo", 2.0, 5));
                        fraquezas.add(new Colunas("Voador", 2.0, 5));
                        fraquezas.add(new Colunas("Pedra", 2.0, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Gelo", 1.0, 4));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));
                        
                        vantagens.add("Sombrio");
                        vantagens.add("Planta");
                        vantagens.add("Psíquico");
                        return tipo;
                    }

                    if(tipo=="Fada" || tipo=="fada"){
                        fraquezas.add(new Colunas("Sombrio", 0.5, 3));
                        fraquezas.add(new Colunas("Lutador", 0.5, 3));
                        fraquezas.add(new Colunas("Inseto", 0.5, 3));
                        fraquezas.add(new Colunas("Venenoso", 2.0, 5));
                        fraquezas.add(new Colunas("Aço", 2.0, 5));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));
                        fraquezas.add(new Colunas("Psíquico", 1.0, 4));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Fogo", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Gelo", 1.0, 4));
                        fraquezas.add(new Colunas("Planta", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));

                        vantagens.add("Sombrio");
                        vantagens.add("Dragão");
                        vantagens.add("Lutador");
                        return tipo;
                    }

                    if(tipo=="Fantasma" || tipo=="fantasma"){
                        fraquezas.add(new Colunas("Normal", 0.0, 1));
                        fraquezas.add(new Colunas("Lutador", 0.0, 1));
                        fraquezas.add(new Colunas("Venenoso", 0.5, 3));
                        fraquezas.add(new Colunas("Inseto", 0.5, 3));
                        fraquezas.add(new Colunas("Fantasma", 2.0, 5));
                        fraquezas.add(new Colunas("Noturno", 2.0, 5));
                        fraquezas.add(new Colunas("Fogo", 1.0, 4));
                        fraquezas.add(new Colunas("Água", 1.0, 4));
                        fraquezas.add(new Colunas("Elétrico", 1.0, 4));
                        fraquezas.add(new Colunas("Gelo", 1.0, 4));
                        fraquezas.add(new Colunas("Planta", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        fraquezas.add(new Colunas("Dragão", 1.0, 4));
                        fraquezas.add(new Colunas("Fada", 1.0, 4));

                        vantagens.add("Fantasma");
                        vantagens.add("Psíquico");
                        return tipo;
                    }

                    if(tipo=="Dragão" || tipo=="dragão"){
                        fraquezas.add(new Colunas("Elétrica", 0.5, 3));
                        fraquezas.add(new Colunas("Fogo", 0.5, 3));
                        fraquezas.add(new Colunas("Água", 0.5, 3));
                        fraquezas.add(new Colunas("Inseto", 0.5, 3));
                        fraquezas.add(new Colunas("Gelo", 2.0, 5));
                        fraquezas.add(new Colunas("Dragão", 2.0, 5));
                        fraquezas.add(new Colunas("Fada", 2.0, 5));
                        fraquezas.add(new Colunas("Normal", 1.0, 4));
                        fraquezas.add(new Colunas("Lutador", 1.0, 4));
                        fraquezas.add(new Colunas("Voador", 1.0, 4));
                        fraquezas.add(new Colunas("Pedra", 1.0, 4));
                        fraquezas.add(new Colunas("Fantasma", 1.0, 4));

                        vantagens.add("Dragão");
                        return tipo;
                    }
                    for(int i=0; i<fraquezas.size(); i++){
                        for(int j=i+1; j<fraquezas.size(); j++){
                            if(fraquezas.get(i).getNumero()==fraquezas.get(j).getNumero()){
                                if (fraquezas.get(i).getNumero()<fraquezas.get(j).getNumero()) {
                                    fraquezas.remove(j);
                                    j--;
                                } else {
                                    fraquezas.remove(i);
                                    i--; 
                                    break;
                                }
                                if(fraquezas.get(i).getNumero()<=0) fraquezas.get(i).setNumero(fraquezas.get(i).getNumero()*0.5);
                                else fraquezas.get(i).setNumero(fraquezas.get(i).getNumero()*2);
                                
                            }
                        }
                    }
                    
                    for(int i=0; i<vantagens.size(); i++){
                        for(int j=i+1; j<vantagens.size(); j++){
                            if(vantagens.get(i).equals(vantagens.get(j))){
                                vantagens.remove(j);
                                j--;
                            }
                        }
                    }
                }
            }
            else{
                System.out.println("O tipo de pokémon inserido não existe\nInsira um tipo válido: ");
                tipo = scan.nextLine();
            }
        }
        return "Luiz Miguel";
    }

    public void imprimir() {
        if(tipo1!=null && tipo2!=null ){    
            System.out.println("Tipo 1: "+tipo1+"\nTipo 2: "+tipo2+"\n\nVantagens: ");
            for(int i=0; i<vantagens.size(); i++){
                System.out.println("\t"+vantagens.get(i));
            }
            int verificador = 0;
            System.out.println("\nImune: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==1){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nMuito resistente: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==2){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nResistene: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==3){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nNormal: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==4){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nVulnerável: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==5){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nMuito Vulnerável: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==6){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
        }
        else if(tipo1!=null){    
            System.out.println("Tipo: "+tipo1+"\nVantagens: ");
            for(int i=0; i<vantagens.size(); i++){
                System.out.println("\t"+vantagens.get(i));
            }
            int verificador = 0;
            System.out.println("\nImune: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==1){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nMuito resistente: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==2){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nResistene: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==3){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nNormal: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==4){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nVulnerável: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==5){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nMuito Vulnerável: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==6){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
        }
        else if(tipo2!=null){    
            System.out.println("Tipo: "+tipo2+"\nVantagens: ");
            for(int i=0; i<vantagens.size(); i++){
                System.out.println("\t"+vantagens.get(i));
            }
            int verificador = 0;
            System.out.println("\nImune: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==1){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nMuito resistente: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==2){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nResistene: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==3){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nNormal: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==4){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nVulnerável: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==5){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
            verificador = 0;
            System.out.println("\nMuito Vulnerável: ");
            for(int i=0; i<fraquezas.size(); i++){
                if(fraquezas.get(i).getIdentificador()==6){
                    System.out.println("\t"+fraquezas.get(i).getTipo());
                    verificador++;
                }
            }
            if (verificador==0) {
                System.out.println("\tNenhum");
            }
        }

    }
}