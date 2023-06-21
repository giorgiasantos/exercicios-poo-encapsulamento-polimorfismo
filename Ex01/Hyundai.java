package Ex01;

public class Hyundai extends Carro{
    public Hyundai(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    public void iniciarPartida() {
        velocidade = 5.0;
        System.out.println("Iniciando o motor... Minha velocidade está em " + velocidade + "km/h");
    }

    @Override
    public void frearCarro() {
        if (velocidade - 2.0 >= 0) {
            velocidade = velocidade - 2.0;
            System.out.println("Freando... Minha velocidade está em " + velocidade + "km/h");
        } else if (velocidade - 2.0 < 0) {
            velocidade = 0.0;
            System.out.println("Freando... Minha velocidade está em " + velocidade + "km/h");
        }
    }

    @Override
    public void acelerarCarro(){
        velocidade = velocidade + 15.0;
        System.out.println("Acelerando... Minha velocidade está em " + velocidade + "km/h");
    }

}
