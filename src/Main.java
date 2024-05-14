import Ex01.ContaBancaria;
import Ex01.ContaCorrente;
import Ex01.ContaPoupanca;
import Ex02.Item;
import Ex02.Alimento;
import Ex02.Eletronicos;
import Ex03.Hotel;
import Ex03.Voo;
import Ex03.ReservaHotel;
import Ex03.ReservaVoo;
import Ex04.Estudante;
import Ex04.Pessoa;
import Ex04.Professor;

public class Main {
    public static void main(String[] args) throws Exception {

        exercicio01();
        exercicio02();
        exercicio03();
        exercicio04();
    }

    private static void exercicio01() throws Exception {

        ContaBancaria contaCorrente = new ContaCorrente("Obedes Cunha", 1234, 400.50f, 200);

        contaCorrente.exibirSaldo();
        contaCorrente.depositar(200);

        contaCorrente.exibirSaldo();

        try {
            contaCorrente.sacar(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        contaCorrente.exibirSaldo();

        ContaBancaria contaPoupanca = new ContaPoupanca("Marilene Cruz", 1407, 600.50f, 1.2f);

        contaPoupanca.exibirSaldo();
        contaPoupanca.depositar(300);

        try {
            contaPoupanca.sacar(280);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        contaPoupanca.exibirSaldo();
    }

    private static void exercicio02() throws Exception {

        Item alimento = new Alimento(1, "Wafer", 3, 21);

        alimento.exibirStatus();
        alimento.adicionarItem(4);

        alimento.exibirStatus();

        try {
            alimento.removerItem(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        alimento.exibirStatus();

        Item eletronico = new Eletronicos(2, "Celular", 5, 500.50f);

        eletronico.exibirStatus();

        eletronico.adicionarItem(6);

        eletronico.exibirStatus();

        try {
            eletronico.removerItem(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        eletronico.exibirStatus();
    }

    private static void exercicio03() throws Exception {

        ReservaVoo europa = new Voo(3, 123, "Alemanha");

        europa.exibirInfo();

        try {
            europa.fazerReserva();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        europa.exibirInfo();

        europa.cancelarReserva();

        // -----------------

        ReservaHotel saintgerman = new Hotel(123, "Julia", 2);

        saintgerman.exibirInfo();

        try {
            saintgerman.fazerReserva();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        saintgerman.exibirInfo();

        saintgerman.cancelarReserva();

    }

    private static void exercicio04() throws Exception {

        Pessoa prof = new Professor("Renan", "renan@gmail.com", "nao","Matematica e Historia");

        try {
            prof.validarMatricula();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        prof.exibirInformacoes();

        Pessoa estudante = new Estudante("Daniel", "daniel@gmail.com", "sim", "ADS");

        try {
            estudante.validarMatricula();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        estudante.exibirInformacoes();
    }

}
