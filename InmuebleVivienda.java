package Inmuebles;

public class InmuebleVivienda extends Inmueble {

    protected int numeroHabitaciones;
    protected int numeroBaños;

    public Inmueble_vivienda(int identificadorInmobiliario, int area, String direccion, int numeroBaños, int numeroHabitaciones) {

        super(identificadorInmobiliario, area, direccion);
        
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    @Override
    public void imprimir() {

        super.imprimir();

        System.out.println("Número de habitaciones = " + numeroHabitaciones);
        System.out.println("Número de baños = " + numeroBaños);
    }
}
