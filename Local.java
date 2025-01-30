package Inmuebles;
public class Local extends Inmueble {

    

    protected tipo tipoLocal;

    public Local(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal) {

        super(identificadorInmobiliario, area, direccion);

        this.tipoLocal = tipoLocal;
    }
 
    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Tipo de local = "+ tipoLocal);
    }
}
