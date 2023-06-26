package Ex03;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Funcionario func1 = new Funcionario();
//        Funcionario func2 = new Funcionario();
//        Funcionario func3 = new Funcionario();
//        Funcionario func4 = new Funcionario();
//        func1.setNome("Beatriz");
//        func1.setSalario(100.0);
//        func1.setDataAdmissao("2023-06-21");
//        System.out.println(func1.getDataAdmissao());
//
//        func2.setNome("Viviane");
//        func2.setSalario(700.1);
//
//        func3.setNome("José");
//        func3.setSalario(700.0);
//
//        func1.setIdentificador();
//        func2.setIdentificador();
//        func3.setIdentificador();
//        func4.setIdentificador();
//        System.out.println(func1.getIdentificador());
//        System.out.println(func2.getIdentificador());
//        System.out.println(func3.getIdentificador());
//        System.out.println(func4.getIdentificador());

        Scanner entrada = new Scanner(System.in);

        System.out.println("SISTEMA DE REGISTRO DE FUNCIONÁRIOS");
        System.out.println("---------------------------------------");
        System.out.println("QUANTOS FUNCIONÁRIOS DESEJA CADASTRAR? ");
        int qtdeFuncionarios = entrada.nextInt();
        //List<Funcionario> listaFuncionarios = new ArrayList<>();
        Funcionario funcionario = new Funcionario();

        for(int i = 0; i < qtdeFuncionarios; i++) {

            System.out.println("DIGITE O NOME DO FUNCIONÁRIO: ");
            funcionario.setNome(entrada.next());
            System.out.println("DIGITE O SALARIO: ");
            funcionario.setSalario(entrada.nextDouble());
            System.out.println("DIGITE A DATA DE ADMISSÃO: ");
            funcionario.setDataAdmissao(entrada.next());
            funcionario.setIdentificador();
            funcionario.mostrarInfos();
            //listaFuncionarios.add(funcionario);

        }
        //System.out.println(listaFuncionarios);

    }
}
