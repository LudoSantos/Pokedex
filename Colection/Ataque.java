public class Ataque {
    protected String nomeAtaque;
    protected double quantDano;
    protected String tipoAtaque;
    protected double estamina;
    protected Tipos tipo;
    
    public Ataque(String nomeAtaque, double quantDano, String tipoAtaque, double estamina, Tipos tipo) {
        this.tipo=tipo;
        this.nomeAtaque = nomeAtaque;
        setQuantDano(quantDano);
        setTipoAtaque(tipoAtaque);
        setEstamina(estamina);
    }

    public double UsarAtaque() {
        if(estamina>0){
            estamina--;
            return quantDano;
        }
        System.out.println("O Pokémon já não tem mais PP para usar esse ataque.\nProcure o Posto de Saúde mais próximo ou use algum item.");
        return 0;   
    }

    public String getNomeAtaque() {
        return nomeAtaque;
    }
    public void setNomeAtaque(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }

    public double getQuantDano() {
        return quantDano;
    }
    public void setQuantDano(double quantDano) {
        if(quantDano>=0) this.quantDano = quantDano;
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }
    public void setTipoAtaque(String tipoAtaque) {
        if(tipoAtaque=="Normal" || tipoAtaque=="normal" || tipoAtaque=="Planta" || tipoAtaque=="planta" || tipoAtaque=="Fogo" || tipoAtaque=="fogo"|| tipoAtaque=="Água" || tipoAtaque=="água" || tipoAtaque=="Elétrico" || tipoAtaque=="elétrico" || tipoAtaque=="Voador" || tipoAtaque=="voador" || tipoAtaque=="Gelo" || tipoAtaque=="gelo" || tipoAtaque=="Pedra" || tipoAtaque=="pedra" || tipoAtaque=="Terrestre" || tipoAtaque=="terrestre" || tipoAtaque=="Aço" || tipoAtaque=="aço" || tipoAtaque=="Lutador" || tipoAtaque=="lutador" || tipoAtaque=="Sombrio" || tipoAtaque=="sombrio" || tipoAtaque=="Psíquico" || tipoAtaque=="psíquico" || tipoAtaque=="Venenoso" || tipoAtaque=="venenoso" || tipoAtaque=="Inseto" || tipoAtaque=="inseto" || tipoAtaque=="Fada" || tipoAtaque=="fada" || tipoAtaque=="Fantasma" || tipoAtaque=="fantasma" || tipoAtaque=="Dragão" || tipoAtaque=="dragão"){
            if(tipo.getTipo1()=="Normal" || tipo.getTipo1()=="normal"){
                if(tipoAtaque=="Normal" || tipoAtaque=="Lutador" || tipoAtaque=="Psíquico" || tipoAtaque=="normal" || tipoAtaque=="lutador" || tipoAtaque=="psíquico" ){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Normal" || tipo.getTipo2()=="normal"){
                if(tipoAtaque=="Normal" || tipoAtaque=="Lutador" || tipoAtaque=="Psíquico" || tipoAtaque=="normal" || tipoAtaque=="lutador" || tipoAtaque=="psíquico" ){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Planta" || tipo.getTipo1()=="planta"){
                if(tipoAtaque=="Planta" || tipoAtaque=="Veneno" || tipoAtaque=="Voador" || tipoAtaque=="Gelo" || tipoAtaque=="Fogo" || tipoAtaque=="planta" || tipoAtaque=="veneno" || tipoAtaque=="voador" || tipoAtaque=="gelo" || tipoAtaque=="fogo"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Planta" || tipo.getTipo2()=="planta"){
                if(tipoAtaque=="Planta" || tipoAtaque=="Veneno" || tipoAtaque=="Voador" || tipoAtaque=="Gelo" || tipoAtaque=="Fogo" || tipoAtaque=="planta" || tipoAtaque=="veneno" || tipoAtaque=="voador" || tipoAtaque=="gelo" || tipoAtaque=="fogo"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Fogo" || tipo.getTipo1()=="fogo"){
                if(tipoAtaque=="Fogo" || tipoAtaque=="Terrestre" || tipoAtaque=="Dragão" || tipoAtaque=="Fantasma" || tipoAtaque=="Aço" || tipoAtaque=="fogo" || tipoAtaque=="terrestre" || tipoAtaque=="dragão" || tipoAtaque=="fantasma" || tipoAtaque=="aço"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Fogo" || tipo.getTipo2()=="fogo"){
                if(tipoAtaque=="Fogo" || tipoAtaque=="Terrestre" || tipoAtaque=="Dragão" || tipoAtaque=="Fantasma" || tipoAtaque=="Aço" || tipoAtaque=="fogo" || tipoAtaque=="terrestre" || tipoAtaque=="dragão" || tipoAtaque=="fantasma" || tipoAtaque=="aço"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Água" || tipo.getTipo1()=="água"){
                if(tipoAtaque=="Água" || tipoAtaque=="Gelo" || tipoAtaque=="Elétrico" || tipoAtaque=="Terrestre" || tipoAtaque=="agua" || tipoAtaque=="gelo" || tipoAtaque=="elétrico" || tipoAtaque=="terrestre"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Água" || tipo.getTipo2()=="água"){
                if(tipoAtaque=="Água" || tipoAtaque=="Gelo" || tipoAtaque=="Elétrico" || tipoAtaque=="Terrestre" || tipoAtaque=="agua" || tipoAtaque=="gelo" || tipoAtaque=="elétrico" || tipoAtaque=="terrestre"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Elétrico" || tipo.getTipo1()=="elétrico"){
                if(tipoAtaque=="Elétrico" || tipoAtaque=="Voador" || tipoAtaque=="Aço" || tipoAtaque=="elétrico" || tipoAtaque=="voador" || tipoAtaque=="aço"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Elétrico" || tipo.getTipo2()=="elétrico"){
                if(tipoAtaque=="Elétrico" || tipoAtaque=="Voador" || tipoAtaque=="Aço" || tipoAtaque=="elétrico" || tipoAtaque=="voador" || tipoAtaque=="aço"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Voador" || tipo.getTipo1()=="voador"){
                if(tipoAtaque=="Normal" || tipoAtaque=="Elétrico" || tipoAtaque=="Lutador" || tipoAtaque=="Gelo" || tipoAtaque=="Fogo" || tipoAtaque=="Voador" || tipoAtaque=="normal" || tipoAtaque=="elétrico" || tipoAtaque=="lutador" || tipoAtaque=="gelo" || tipoAtaque=="fogo" || tipoAtaque=="voador"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Voador" || tipo.getTipo2()=="voador"){
                if(tipoAtaque=="Normal" || tipoAtaque=="Elétrico" || tipoAtaque=="Lutador" || tipoAtaque=="Gelo" || tipoAtaque=="Fogo" || tipoAtaque=="Voador" || tipoAtaque=="normal" || tipoAtaque=="elétrico" || tipoAtaque=="lutador" || tipoAtaque=="gelo" || tipoAtaque=="fogo" || tipoAtaque=="voador"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Gelo" || tipo.getTipo1()=="gelo"){
                if(tipoAtaque=="Gelo" || tipoAtaque=="Água" || tipoAtaque=="Aço" || tipoAtaque=="Voador" || tipoAtaque=="Fogo" || tipoAtaque=="gelo" || tipoAtaque=="agua" || tipoAtaque=="aço" || tipoAtaque=="voador" || tipoAtaque=="fogo"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Gelo" || tipo.getTipo2()=="gelo"){
                if(tipoAtaque=="Gelo" || tipoAtaque=="Água" || tipoAtaque=="Aço" || tipoAtaque=="Voador" || tipoAtaque=="Fogo" || tipoAtaque=="gelo" || tipoAtaque=="agua" || tipoAtaque=="aço" || tipoAtaque=="voador" || tipoAtaque=="fogo"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Pedra" || tipo.getTipo1()=="pedra"){
                if(tipoAtaque=="Voador" || tipoAtaque=="Fogo" || tipoAtaque=="Água" || tipoAtaque=="Elétrico" || tipoAtaque=="voador" || tipoAtaque=="fogo" || tipoAtaque=="agua" || tipoAtaque=="elétrico"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Pedra" || tipo.getTipo2()=="pedra"){
                if(tipoAtaque=="Voador" || tipoAtaque=="Fogo" || tipoAtaque=="Água" || tipoAtaque=="Elétrico" || tipoAtaque=="voador" || tipoAtaque=="fogo" || tipoAtaque=="agua" || tipoAtaque=="elétrico"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Terrestre" || tipo.getTipo1()=="terrestre"){
                if(tipoAtaque=="Terrestre" || tipoAtaque=="Elétrico" || tipoAtaque=="Fogo" || tipoAtaque=="Pedra" || tipoAtaque=="terrestre" || tipoAtaque=="elétrico" || tipoAtaque=="fogo" || tipoAtaque=="pedra"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Terrestre" || tipo.getTipo2()=="terrestre"){
                if(tipoAtaque=="Terrestre" || tipoAtaque=="Elétrico" || tipoAtaque=="Fogo" || tipoAtaque=="Pedra" || tipoAtaque=="terrestre" || tipoAtaque=="elétrico" || tipoAtaque=="fogo" || tipoAtaque=="pedra"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Aço" || tipo.getTipo1()=="aço"){
                if(tipoAtaque=="Aço" || tipoAtaque=="Fada" || tipoAtaque=="Lutador" || tipoAtaque=="Voador"|| tipoAtaque=="Gelo" || tipoAtaque=="aço" || tipoAtaque=="fada" || tipoAtaque=="lutador" || tipoAtaque=="voador"|| tipoAtaque=="gelo"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Aço" || tipo.getTipo2()=="aço"){
                if(tipoAtaque=="Aço" || tipoAtaque=="Fada" || tipoAtaque=="Lutador" || tipoAtaque=="Voador"|| tipoAtaque=="Gelo" || tipoAtaque=="aço" || tipoAtaque=="fada" || tipoAtaque=="lutador" || tipoAtaque=="voador"|| tipoAtaque=="gelo"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Lutador" || tipo.getTipo1()=="lutador"){
                if(tipoAtaque=="Lutador" || tipoAtaque=="Normal" || tipoAtaque=="Aço" || tipoAtaque=="Fantasma" || tipoAtaque=="lutador" || tipoAtaque=="normal" || tipoAtaque=="aço" || tipoAtaque=="fantasma"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Lutador" || tipo.getTipo2()=="lutador"){
                if(tipoAtaque=="Lutador" || tipoAtaque=="Normal" || tipoAtaque=="Aço" || tipoAtaque=="Fantasma" || tipoAtaque=="lutador" || tipoAtaque=="normal" || tipoAtaque=="aço" || tipoAtaque=="fantasma"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Sombrio" || tipo.getTipo1()=="sombrio"){
                if(tipoAtaque=="Sombrio" || tipoAtaque=="Fantasma" || tipoAtaque=="Psíquico" || tipoAtaque=="Inseto" || tipoAtaque=="Fada" || tipoAtaque=="sombrio" || tipoAtaque=="fantasma" || tipoAtaque=="psíquico" || tipoAtaque=="inseto" || tipoAtaque=="fada"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Sombrio" || tipo.getTipo2()=="sombrio"){
                if(tipoAtaque=="Sombrio" || tipoAtaque=="Fantasma" || tipoAtaque=="Psíquico" || tipoAtaque=="Inseto" || tipoAtaque=="Fada" || tipoAtaque=="sombrio" || tipoAtaque=="fantasma" || tipoAtaque=="psíquico" || tipoAtaque=="inseto" || tipoAtaque=="fada"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Psíquico" || tipo.getTipo1()=="psíquico"){
                if(tipoAtaque=="Psíquico" || tipoAtaque=="Lutador" || tipoAtaque=="Fantasma" || tipoAtaque=="Fada" || tipoAtaque=="psíquico" || tipoAtaque=="lutador" || tipoAtaque=="fantasma" || tipoAtaque=="fada"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Psíquico" || tipo.getTipo2()=="psíquico"){
                if(tipoAtaque=="Psíquico" || tipoAtaque=="Lutador" || tipoAtaque=="Fantasma" || tipoAtaque=="Fada" || tipoAtaque=="psíquico" || tipoAtaque=="lutador" || tipoAtaque=="fantasma" || tipoAtaque=="fada"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Venenoso" || tipo.getTipo1()=="venenoso"){
                if(tipoAtaque=="Venenoso" || tipoAtaque=="Psíquico" || tipoAtaque=="Fada" || tipoAtaque=="Inseto" || tipoAtaque=="venenoso" || tipoAtaque=="psíquico" || tipoAtaque=="fada" || tipoAtaque=="inseto"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Venenoso" || tipo.getTipo2()=="venenoso"){
                if(tipoAtaque=="Venenoso" || tipoAtaque=="Psíquico" || tipoAtaque=="Fada" || tipoAtaque=="Inseto" || tipoAtaque=="venenoso" || tipoAtaque=="psíquico" || tipoAtaque=="fada" || tipoAtaque=="inseto"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Fada" || tipo.getTipo1()=="fada"){
                if(tipoAtaque=="Fada" || tipoAtaque=="Dragão" || tipoAtaque=="Lutador" || tipoAtaque=="Psíquico" ||tipoAtaque=="fada" || tipoAtaque=="dragão" || tipoAtaque=="lutador" || tipoAtaque=="psíquico"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Fada" || tipo.getTipo2()=="fada"){
                if(tipoAtaque=="Fada" || tipoAtaque=="Dragão" || tipoAtaque=="Lutador" || tipoAtaque=="Psíquico" ||tipoAtaque=="fada" || tipoAtaque=="dragão" || tipoAtaque=="lutador" || tipoAtaque=="psíquico"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Fantasma" || tipo.getTipo1()=="fantasma"){
                if(tipoAtaque=="Fantasma" || tipoAtaque=="Sombrio" || tipoAtaque=="Psíquico" || tipoAtaque=="fantasma" || tipoAtaque=="sombrio" || tipoAtaque=="psíquico"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Fantasma" || tipo.getTipo2()=="fantasma"){
                if(tipoAtaque=="Fantasma" || tipoAtaque=="Sombrio" || tipoAtaque=="Psíquico" || tipoAtaque=="fantasma" || tipoAtaque=="sombrio" || tipoAtaque=="psíquico"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            if(tipo.getTipo1()=="Dragão" || tipo.getTipo1()=="dragão"){
                if(tipoAtaque=="Dragão" || tipoAtaque=="Fada" || tipoAtaque=="Voador" || tipoAtaque=="Gelo" || tipoAtaque=="Aço" || tipoAtaque=="Fogo" || tipoAtaque=="dragão" || tipoAtaque=="fada" || tipoAtaque=="voador" || tipoAtaque=="gelo" || tipoAtaque=="aço" || tipoAtaque=="fogo"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
            else if(tipo.getTipo2()=="Dragão" || tipo.getTipo2()=="dragão"){
                if(tipoAtaque=="Dragão" || tipoAtaque=="Fada" || tipoAtaque=="Voador" || tipoAtaque=="Gelo" || tipoAtaque=="Aço" || tipoAtaque=="Fogo" || tipoAtaque=="dragão" || tipoAtaque=="fada" || tipoAtaque=="voador" || tipoAtaque=="gelo" || tipoAtaque=="aço" || tipoAtaque=="fogo"){
                    this.tipoAtaque = tipoAtaque;
                }
            }
        }
        else System.out.println("Esse tipo de pokémon é inválido.");
    }

    public double getEstamina() {
        return estamina;
    }
    public void setEstamina(double estamina) {
        if(estamina>=0) this.estamina = estamina;
    }

    @Override
    public String toString() {
        return "\n\nNome do Ataque: "+ nomeAtaque+"\nQuantidade de Dano: "+quantDano+"\nTipo do ataque: "+tipoAtaque+"\nPP: "+estamina;
    }

}
