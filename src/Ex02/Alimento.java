package Ex02;

public class Alimento extends Item {
    
    private int sodio;

    public Alimento(int id, String nome, int quantidade, int sodio) {
        super(id, nome, quantidade);
        this.sodio = sodio;
    }

    public void adicionarItem(int quantidade) throws Exception {

        if(quantidade <= 0) 
            throw new Exception("\nA quantidade de itens para adicionar deve ser maior que zero!");
        
        this.quantidade += quantidade;
        System.out.println("\nFoi adicionado " + quantidade + " item(s) no estoque de " + nome);
    }

    public void removerItem(int quantidade) throws Exception {

        if(quantidade > this.quantidade) 
            throw new Exception("\nA quantidade para remover deve ser menor que o total disponivel");

        this.quantidade -= quantidade;
        System.out.println("\nFoi retirado " + quantidade + " item(s) no estoque de " + nome);
    }

    public void exibirStatus() {

        System.out.println("\n---ESTOQUE");
        System.out.println("ID: " + id);
        System.out.println("Nome do produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Quantidade de sódio: " + sodio);
    }
}
