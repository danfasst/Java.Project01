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
import Ex05.Conversor;
import Ex05.Distancia;
import Ex05.Peso;
import Ex05.Temperatura;

public class Main {
    public static void main(String[] args) throws Exception {

        exercicio01();
        exercicio02();
        exercicio03();
        exercicio04();
        exercicio05();
    }

    private static void exercicio01() throws Exception {

        // SISTEMA DE GESTÃO BANCÁRIA

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

        // SISTEMA DE CONTROLE DE ESTOQUE

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

        // SISTEMA DE RESERVA DE VIAGEM E HOTEL 

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

        // SISTEMA DE REGISTRO ACADEMICO

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

    private static void exercicio05() throws Exception {

        //CONVERSOR DE UNIDADES

        /*O programa identifica qual unidade está errada 
        * (por exemplo só a primeira opção errada,
        * apenas a segunda ou as duas)
        * Temperatura: celsius - kelvin
        * Peso: kilo - grama
        * Distancia: kilometro - metro
        */

        //-----------
        Conversor kilometro = new Distancia("erro", "erro");

        System.out.println("\n---DISTANCIA");

        try {
            System.out.println("\n1 Km tem " + kilometro.converterDeSi(1) + " metros");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n1000 m tem " + kilometro.converterParaSi(1000) + " Km");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //----------------
        Conversor celsius = new Temperatura("erro", "kelvin");

        System.out.println("\n---TEMPERATURA");

        try {
            System.out.println("\n10 °C são " + celsius.converterDeSi(10) + " K");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n283 K são " + celsius.converterParaSi(283) + " °C");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //----------------
        Conversor quilo = new Peso("quilo", "erro");

        System.out.println("\n---PESO");

        try {
            System.out.println("\n10 Kg são " + quilo.converterDeSi(10) + " g");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n10.000 g são " + quilo.converterDeSi(10000) + " Kg");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
