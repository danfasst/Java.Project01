package Ex01;

public class ContaCorrente extends ContaBancaria {
    
    private float chequeEspecial;

    public ContaCorrente(String nomeCliente, int numeroConta, float saldo, float chequeEspecial) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void depositar(float valor) {

        saldo += valor;
        System.out.println("\nR$" + valor + " foi adicionado na conta nº " + numeroConta);
    } 

    @Override
    public void sacar(float valor) throws Exception {

        if(valor > saldo + chequeEspecial) {
            throw new Exception("\nSaque maior do que disponivel na conta!");
        }

        saldo -= valor;
        System.out.println("\nR$ " + valor + " foram retirados da conta nº " + numeroConta);
    }

    @Override
    public void exibirSaldo() {
        
        System.out.println("\n----CONTA");
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("Valor do Cheque Especial: R$ " + chequeEspecial);
    }
}
