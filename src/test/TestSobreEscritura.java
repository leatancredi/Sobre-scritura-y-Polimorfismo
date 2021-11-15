package test;

import domain. *;

public class TestSobreEscritura {
    public static void main(String[] args) {
//        polimorfismo: multiple comportamientos, solo se puede visualizar en tiempo de ejecucion.
        Empleado empleado = new Empleado("juan", 5000);
//        System.out.println("Empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        Gerente gerente = new Gerente("karla" , 10000, "Contabilidad");
//        System.out.println("Gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);
    }
    
    // aplicando el concepto de polimorfismo
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    //IMPORTANTE EL METODO HIJO NO PUEDE SER MAS RESTRICTIVO QUE EL METODO PADRE
    
}
