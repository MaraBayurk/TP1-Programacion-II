
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author marabayurk
 */
public class EjerciciosJava {

    public static void main(String[] args) {
   
        holaMundo(args);
        presentacion(args);
        tryScanner(args);
        operacionesMatematicas(args);
        juanPerez(args);
        divisionInt(args);
        divisionDouble(args);
        errorEjemplo(args);

    }
    
    public static void holaMundo(String[] args) {
        System.out.println("Hola Java!");
    }   
    
    public static void presentacion(String[] args) {
            String nombre =  "Mara";
        int edad = 26;
        double altura = 1.63;
        boolean estudiante = true;

        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi edad es: " + edad);
        System.out.println("Mi altura es: " + altura);
        System.out.println("Soy estudiante: " + estudiante);     
    }
    
    public static void tryScanner(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingresa tu nombre:");
        nombre = input.nextLine();
        System.out.println("Ingresa tu edad:");
        edad = input.nextInt();
        
        System.out.println("Mi nombre es " + nombre + " y mi edad " + edad);
        
      
        System.out.println(""); // sout
    }
    
    public static void operacionesMatematicas(String[] args) {
       Scanner input = new Scanner(System.in);

       double numero1;
       double numero2;
       
        System.out.println("Ingresa el primer número:");
        numero1 = input.nextInt();
        System.out.println("Ingresa el segundo número:");
        numero2 = input.nextInt();
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        
        
        System.out.println("La suma es: " + suma );
        System.out.println("La resta es: " + resta );
        System.out.println("La multiplicacion es: " + multiplicacion );
        System.out.println("La division es: " + division );
        
    }
    
    public static void juanPerez(String[] args) {
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
    }
    
    
    public static void divisionInt(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1;
    int num2;

    System.out.print("Ingresa el primer número entero: ");
    num1 = input.nextInt();
    System.out.print("Ingresa el segundo número entero: ");
    num2 = input.nextInt();

    int resultado = num1 / num2;
    System.out.println("Resultado de la división entera: " + resultado);
    
    }
    
    
        
    public static void divisionDouble(String[] args) {
    Scanner input = new Scanner(System.in);
    double num1;
    double num2;

    System.out.print("Ingresa el primer número entero: ");
    num1 = input.nextInt();
    System.out.print("Ingresa el segundo número entero: ");
    num2 = input.nextInt();

    double resultado = num1 / num2;
    System.out.println("Resultado de la división entera: " + resultado);
    
    }
    
    
    public static void errorEjemplo(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);
    }

}
