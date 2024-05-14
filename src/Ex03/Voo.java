package Ex03;

public class Voo extends ReservaVoo {
    
    private int numeroPassagem;
    private String pais;

    public Voo(int diaVoo, int numeroPassagem, String pais) {
        
        super(diaVoo);
        this.numeroPassagem = numeroPassagem;
        this.pais = pais;
    }

    @Override
    public void cancelarReserva() {
    
        System.out.println("\nViagem cancelada com sucesso!");
    }

    @Override
    public void fazerReserva() throws Exception {
        
        if(diaVoo == 3)
            throw new Exception("\nDia indisponivel para reserva de voo!");
        
        System.out.println("\nReserva feita com sucesso!");
    }

    @Override
    public void exibirInfo() {
        
        System.out.println("\n---INFO");
        System.out.println("Dia do Voo: " + diaVoo);
        System.out.println("Numero da passagem: " + numeroPassagem);
        System.out.println("País de destino: " + pais);
    }

}
