package Ex01;

public class Fiat extends Carro{
    public Fiat(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    public void iniciarPartida() {
        velocidade = 3.0;
        System.out.println("Iniciando o motor... Minha velocidade está em " + velocidade + "km/h");
    }

    @Override
    public void frearCarro() {
        if (velocidade - 6.0 >= 0) {
            velocidade = velocidade - 6.0;
            System.out.println("Freando... Minha velocidade está em " + velocidade + "km/h");
        } else if (velocidade - 6.0 < 0) {
            velocidade = 0.0;
            System.out.println("Freando... Minha velocidade está em " + velocidade + "km/h");
        }
    }

    @Override
    public void acelerarCarro(){
        velocidade = velocidade + 12.0;
        System.out.println("Acelerando... Minha velocidade está em " + velocidade + "km/h");
    }

}
