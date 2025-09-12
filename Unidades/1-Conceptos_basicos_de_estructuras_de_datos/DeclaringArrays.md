```java
package mx.edu.uttt.arreglos;

public class DeclaringArrays {
public static void main (String[] args){

    /*
    ****Sintaxis para declarar un arreglo****
     * datatype[] arrayName;
     *
     * double[] dailyTemps;
     *
     * datatype arrayName[]
     *
     * double dailyTemps[];
     *
     * datatype[] arrayName1,arrayName2;   tienen que ser del mismo tipo
     * */

    double [] arr1;
    String [] arr2, arr3;
    boolean [] arr4;
    char arr5 [];
    int [] arr6;

    arr1=new double[3];

    System.out.println(arr1[0]);

    arr1[1]=6.7;

    System.out.println(arr1[1]);

    String nombre []=new String[4];
    System.out.println(nombre[0]);

    double arr7[]={25.3,15.6,7.9,12.5};

}

}
```