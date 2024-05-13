package Ex02;

public abstract class Item implements Estoque {
    
    protected int id;
    protected String nome;
    protected int quantidade;

    public Item() {
    }

    public Item(int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public abstract void exibirStatus();
}
