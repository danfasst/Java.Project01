package Ex01;

public class ContaPoupanca extends ContaBancaria {
    
    private float taxaJuros;

    public ContaPoupanca(String nomeCliente, int numeroConta, float saldo, float taxaJuros) {
        super(nomeCliente, numeroConta, saldo);
        this.taxaJuros = taxaJuros;
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void depositar(float valor) {
        
        saldo += valor;
        System.out.println("\nR$ " + valor + " foram adicionados na conta nº " + numeroConta);
    }

    @Override
    public void sacar(float valor) throws Exception {
        
        if(valor > saldo) {
            
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
        System.out.println("Rendimento previsto: R$ " + (saldo * (taxaJuros / 100)));
    }
    
}
