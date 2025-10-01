package mx.edu.uttt.arreglos;

public class TestOperacionesArreglos {

  public static void main(String[]  args){
        OperacionesArreglos op1=new OperacionesArreglos();
        OperacionesArreglos op2=new OperacionesArreglos(6);

        double vector []={1.2,4.5,7.8};
        OperacionesArreglos op3=new OperacionesArreglos(vector);

        // Imprimir el arreglo
        op3.imprimir();

        // Probar operaciones
        System.out.println("Suma: " + op3.sumarValores());
        System.out.println("Máximo: " + op3.obtenerValorMaximo());
        System.out.println("Mínimo: " + op3.obtenerValorMinimo());

        // Comparar con otro arreglo
        double[] otroVector = {1.2, 4.5, 7.8};
        boolean iguales = op3.compararArreglos(otroVector);
        System.out.println("¿Son iguales los arreglos? " + iguales);

    }

    }

