package Ex03;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private static int identificador = 1;

    public int getIdentificador() {
        return identificador++;
    }

    public int setIdentificador() {
        return identificador + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataAdmissao() {

        return dataAdmissao;
    }
    public void setDataAdmissao(CharSequence dataAdmissao) {
        LocalDate dataNova = LocalDate.parse(dataAdmissao);
        if(dataNova.isAfter(LocalDate.now())){
            System.out.println("Você não pode usar uma data do futuro para admissão.");
        } else {
            System.out.println("Você adicionou a data de admissão com sucesso.");
            this.dataAdmissao = dataNova;
        }

    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 700){
            this.salario = salario;
        } else {
            System.out.println("Opção inválida. Adicione um salário maior que 700.");
        }

    }
}
