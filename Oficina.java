package Inmuebles;

public class Oficina extends Local {

    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    public Oficina(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno){

        super(identificadorInmobiliario, area, null, tipoLocal);

        this.esGobierno = esGobierno;
    }

    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Es oficina gubernamental = "+ esGobierno);
        System.out.println();
    }
    
}
