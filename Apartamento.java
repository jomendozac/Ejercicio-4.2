package Inmuebles;

public class Apartamento extends Inmueble_vivienda {

    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {

        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }

    @Override

    public void imprimir() { 

        super.imprimir();
        
    }
    
}
