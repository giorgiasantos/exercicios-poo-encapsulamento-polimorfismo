package Ex01;

public abstract class Carro {
    String marca;
    int ano;
    double valor;
    String cor;
    int portas;
    double velocidade;

    public Carro(String marca, int ano, double valor, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
    }

    abstract void iniciarPartida();

    abstract void frearCarro();

    abstract void acelerarCarro();

}
