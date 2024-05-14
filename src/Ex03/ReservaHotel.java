package Ex03;

public abstract class ReservaHotel implements Reservavel {
    
    protected int numeroReserva;

    public ReservaHotel() {
    }

    public ReservaHotel(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

}
