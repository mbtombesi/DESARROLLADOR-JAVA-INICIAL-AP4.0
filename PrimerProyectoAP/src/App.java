public class App {
    public static void main(String[] args) throws Exception {
     
        /*int num1, num2, num3, resultado1, resultado2, resultado3;

        num1=20;
        num2=10;
        num3=5;
        resultado1=0;
        resultado2=0;
        resultado3=0;

        double num4, num5, resultado4;

        num4=0;
        num5=2.5;
        resultado4=0;

        String caracter1="a";

        boolean continuar=true;

        resultado1=num1 + num2;
        resultado2=num2 - num1;
        resultado3=num2/num3 + num1*num3; //2 + 100 = 102
        resultado4=num5*num3;

        System.out.println (" -El resultado1 es: "+ resultado1 + " -El resultado2 es: " + resultado2 + " -El resutlado3 es: " + resultado3 + " -El resultado4 es: " + resultado4); */
        

        //Estructura de un ciclo "while" (mientras)

        //System.out.println("El resultado del while es:");

		int numA, numB, numC;
        numA=5;
        numB=14;
        numC=55;

        //Punto 1-a)

        /*System.out.println("Los numeros entre numA y numB son:");
        

        while (numA <= numB) {

			System.out.print(numA + ",");
            

            numA++; 
        }

        //Punto 1-b

        System.out.println("Los numeros pares entre numA y numB son:");

        while (numA <= numB) {
            if (numA%2==0){
                System.out.print(numA + ",");
                }
            numA++;

        }

        //Punto 1-c

        System.out.println("Los numeros impares entre numA y numC son:");

        while (numA <= numC) {
            if (numA%2 != 0){
                System.out.print(numA + ",");
            }
            numA++;
        }*/

        //la profe uso if else pero en la consigna no especifica que tengamos que usar if else:

        /*como lo hizo la profe para ver solo los impares:
        boolean pares = false; <------IMPORTANTE PUSO "PARES = FALSE" PARA QUE NO MUESTRE A LOS PARES

		System.out.println("El resultado del while es:");

		while (numB >=  numA) {

			if (pares == true) {

			

				if (numB %2 == 0) {

			

					System.out.print(numB + "-");

				}   

			}else {

				if (numB %2 != 0) {

					

					System.out.print(numB + "-");

				}

			}	

 

			numB--;

	     	

		}
         */

        System.out.println("Los numeros pares comenzando desde numB son:");
        
        for (int i=numB; i>=numA ; i--) {

            if (i%2==0) {
            
            System.out.print(i + ",");
        }
            

        }

        //Seria una mala practica usar el operador if en este ejemplo?? (yo lo use para que me muestre solo los numeros pares)

            

		
        
		

		
    }






}
