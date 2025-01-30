package Inmuebles;

public class Casa extends Inmueble_vivienda {

    protected int numeroPisos;
    public Casa (int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños , int numeroPisos) {
        
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);

        this.numeroPisos = numeroPisos;
    }
    @Override
    public void imprimir() {
        
        super.imprimir();
        
        System.out.println("Número de pisos =" + numeroPisos);

    }
}
