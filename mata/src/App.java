public class App {
    public static void main(String[] args) throws Exception {

        Empleados[] empleados = new Empleados[2];
        empleados[0]=new EmpleadoTiempocompleto("juan ", "353 ", 480000);
        empleados[1]=new EmpleadosMediotiempo("Luis ", "0512", 34, 67 );

       for (int i= 0; i < empleados.length; i++) {
        System.out.println("Empleado:"+empleados[i].getnombre()+"salario mensual: $"+empleados[i].calcularSalario());
       }
        
        
       }
        
    }

