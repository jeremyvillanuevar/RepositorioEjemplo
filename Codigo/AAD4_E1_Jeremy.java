//Es para traer valores de consola
import java.util.Scanner;
public class AAD4_E1_Jeremy{

    public static void main (String[] args)
    {
        //Version 2.0

        //Se necesita siempre esta inicialización-
        //para obtener valores ingresados por usuario en consola
        Scanner sc = new Scanner(System.in);

		// Leer Número ingresado
        System.out.println("Ingrese Número");
        long numero;
        //Scanner obtiene el valor ingresado del usuario
        //se usa .nextLine para obtener un String
        //se usa .nextDouble para obtener un Double
        //se usa .nextLong para obtener un Long
        numero= sc.nextLong();

		// Leer Número a contabilizar
        System.out.println("Ingrese Número a Contabilizar");
        int numeroacontabilizar;
        //Scanner obtiene el valor ingresado del usuario
        //se usa .nextLine para obtener un String
        //se usa .nextDouble para obtener un Double
        numeroacontabilizar= sc.nextInt();
		
		// Contar la cantidad total de dígitos
        System.out.println("Se está ingresando al método ContarDigitos()");
		int temporalContarDigitos = ContarDigitos(numero);
		System.out.println("cantidad total de dígitos: "+temporalContarDigitos);
		// Contar la cantidad de números repetidos de acuerdo al dígito indicado.
        System.out.println("Se está ingresando al método ContarNumerosRepetidos()");
		int temporalContarNumerosRepetidos = ContarNumerosRepetidos(numero,numeroacontabilizar);
		System.out.println("cantidad de números repetidos de acuerdo al dígito indicado: "+temporalContarNumerosRepetidos);

    }
	
	// Contar la cantidad total de dígitos
	public static int ContarDigitos (long numero)
	{		
		// Variable Contador = 0
		int contador = 0;
		// Variable NúmeroTemp = Número ingresado
		long numerotemp = numero;
		// Mientras que haya el NúmeroTemp >0 
		while (numerotemp >0)
		{
			System.out.println("Se ha entrado al while");
			// NúmeroTemp  = NúmeroTemp  / 10
			numerotemp = numerotemp /10;
			// Contador = Contador + 1
			contador = contador +1;						
		}
		// Devolver Contador 
		return contador;
	}
		
	// Contar la cantidad de números repetidos de acuerdo al dígito indicado.
	public static int ContarNumerosRepetidos (long numero, int numeroacontabilizar)
	{		
		// Variable Contador = 0
		int contador = 0;
		// Variable Resto=0
		int resto = 0;
		// Variable Número a contabilizar		
		// Variable NúmeroTemp = Número ingresado
		long numerotemp = numero;
		
		// Mientras que el NúmeroTemp >0
		while (numerotemp >0)
		{
			System.out.println("Se ha entrado al while");
			// Resto = Obtener el Resto de la división NúmeroTemp  / 10
			resto = (int)(numerotemp % 10);
				// Si el Resto = Número a contabilizar
				if (resto == numeroacontabilizar)
				{
					// Contador = Contador + 1
					contador = contador +1;			
				}
			// NúmeroTemp  = NúmeroTemp  / 10
			numerotemp = numerotemp /10;
		}
		// Devolver Contador 
		return contador;
	}
}
