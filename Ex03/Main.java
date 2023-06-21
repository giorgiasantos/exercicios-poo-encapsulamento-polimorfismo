package Ex03;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Funcionario func3 = new Funcionario();
        Funcionario func4 = new Funcionario();
        func1.setNome("Beatriz");
        func1.setSalario(100.0);
        func1.setDataAdmissao("2023-06-21");
        System.out.println(func1.getDataAdmissao());

        func2.setNome("Viviane");
        func2.setSalario(700.1);

        func3.setNome("José");
        func3.setSalario(700.0);

        func1.setIdentificador();
        func2.setIdentificador();
        func3.setIdentificador();
        func4.setIdentificador();
        System.out.println(func1.getIdentificador());
        System.out.println(func2.getIdentificador());
        System.out.println(func3.getIdentificador());
        System.out.println(func4.getIdentificador());

    }
}
