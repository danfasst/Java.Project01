package Ex04;

public class Professor extends Pessoa {
 
    private String aulas;

    public Professor(String nome, String email, String matricula, String aulas) {

        super(nome, email, matricula);
        this.aulas = aulas;

    }

    public void exibirInformacoes() {

        System.out.println("\n--INFO");
        System.out.println("Nome do professor: " + nome);
        System.out.println("E-mail do professor: " + email);
        System.out.println("Matricula foi feita? " + matricula);
        System.out.println("Aulas lecionadas pelo professor: " + aulas);
    }

    public void validarMatricula() throws Exception{

        if(matricula.equals("nao")) {
            throw new Exception("\nProfessor deve fazer matricula!");
        }

        System.out.println("\nMatricula do professor " + nome + " esta em ordem!");
    }
}
