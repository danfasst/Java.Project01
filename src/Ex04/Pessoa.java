package Ex04;

public abstract class Pessoa {
    
    protected String nome;
    protected String email;
    protected String matricula;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String matricula) {
        
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    public abstract void exibirInformacoes();
    
    public abstract void validarMatricula() throws Exception;
}
