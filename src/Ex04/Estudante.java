package Ex04;

public class Estudante extends Pessoa {
    
    private String curso;

    public Estudante(String nome, String email, String matricula, String curso) {
        
        super(nome, email, matricula);
        this.curso = curso;
    }

    @Override
    public void exibirInformacoes() {
        
        System.out.println("\n--INFO");
        System.out.println("Nome do estudante: " + nome);
        System.out.println("E-mail do estudante: " + email);
        System.out.println("Matricula foi feita? " + matricula);
        System.out.println("Curso do estudante: " + curso);
    }

    @Override
    public void validarMatricula() throws Exception{

        if(matricula.equals("nao")) {

            throw new Exception("\nMatricula ainda nao foi feita");
        }
        System.out.println("\nMatricula do estudante " + nome + " foi feita!");
    }
}
