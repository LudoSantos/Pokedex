public class Colunas {
    private int identificador;
    private double numero;
    private String tipo;
    
    public Colunas(String tipo, double numero, int identificador) {
        this.identificador = identificador;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean Compara(String tipo1, String tipo2){
        return tipo1==tipo2;
    }

    @Override
    public String toString() {
        return "colunas [identificador=" + identificador + ", numero=" + numero + ", tipo=" + tipo + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Colunas colunas = (Colunas) obj;
        return tipo.equals(colunas.tipo); // Comparando apenas o atributo "tipo"
    }

    @Override
    public int hashCode() {
        return tipo.hashCode();
    }
}
