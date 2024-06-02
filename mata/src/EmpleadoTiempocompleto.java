public class EmpleadoTiempocompleto extends Empleados {
    private double salarioAnual;
    
    public EmpleadoTiempocompleto(String nombre, String numeroIdentificacion, double salarioAnual){
        super(nombre, numeroIdentificacion);
        this.salarioAnual=salarioAnual;
    }
    @Override
    public double calcularSalario(){
        return salarioAnual;
    }

}
