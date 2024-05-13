import Ex01.ContaBancaria;
import Ex01.ContaCorrente;
import Ex01.ContaPoupanca;
import Ex02.Item;
import Ex02.Alimento;
import Ex02.Eletronicos;

public class Main {
    public static void main(String[] args) throws Exception {
        
        exercicio01();
        exercicio02();
    }

    private static void exercicio01() throws Exception {
        
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
}
