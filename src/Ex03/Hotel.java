package Ex03;

public class Hotel extends ReservaHotel { 

    private String nomeCliente;
    private int diaReserva;

    public Hotel(int numeroReserva, String nomeCliente, int diaReserva) {
        
        super(numeroReserva);
        this.nomeCliente = nomeCliente;
        this.diaReserva = diaReserva;
    }

    @Override
    public void exibirInfo() {
        
        System.out.println("\n---INFO");
        System.out.println("Numero da reserva: " + numeroReserva);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Dia da reserva: " + diaReserva);
    }

    @Override
    public void fazerReserva() throws Exception {

        if(diaReserva == 2 || diaReserva == 6)
            throw new Exception("\nDia indisponivel para reserva!");

        System.out.println("\n" + nomeCliente + ", sua reserva de hotel foi feita com sucesso!");
    }

    @Override
    public void cancelarReserva() {

        System.out.println("\n" + nomeCliente + ", sua reserva no dia "
            + diaReserva + " foi feita com sucesso!");
    }

}
