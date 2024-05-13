import Ex01.ContaBancaria;
import Ex01.ContaCorrente;
import Ex01.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        
        exercicio01();
        exercicio02();
    }

    private static void exercicio01() {
        
        ContaBancaria contaCorrente = new ContaCorrente("Obedes Cunha", 1234, 400.50f, 200);

        contaCorrente.exibirSaldo();
        contaCorrente.depositar(200);

        contaCorrente.exibirSaldo();

        try {
            contaCorrente.sacar(500);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        contaCorrente.exibirSaldo();

        ContaBancaria contaPoupanca = new ContaPoupanca("Marilene Cruz", 1407, 600.50f, 1.2f);
        
        contaPoupanca.exibirSaldo();
        contaPoupanca.depositar(300);

        try {
            contaPoupanca.sacar(280);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        contaPoupanca.exibirSaldo();
    }

    private static void exercicio02() {


    }
}
