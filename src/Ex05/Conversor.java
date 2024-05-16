package Ex05;

public abstract class Conversor implements Conversivel {
    
    protected String unidadeOriginal;
    protected String unidadeModificada;

    public Conversor() {
    }

    public Conversor(String unidadeOriginal, String unidadeModificada) {
    
        this.unidadeOriginal = unidadeOriginal;
        this.unidadeModificada = unidadeModificada;
    }
}
