package problemarepaso01;

import java.util.Scanner;
import java.util.Locale;

public class Problemarepaso01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int cedula;
        double adicional = 0;
        int horasMat;
        int horasNoc;
        boolean bandera = true;
        double totalMat;
        double totalNoc;
        double total;
        double subTotal;
        double seguro = 18;
        double cuotaMat = 10;
        double cuotaNoc = 15;
        String mensaje = "";
        String opcion;
        String ciudad;
        int contador = 0;

        while (bandera) {

            System.out.println("Ingresa el nombre el empleado: ");
            nombre = entrada.nextLine();

            System.out.println("Ingresa la ciudad de la empresa: ");
            ciudad = entrada.nextLine();

            System.out.println("Ingresa la cédula del empleado: ");
            cedula = entrada.nextInt();

            System.out.println("Ingresa las horas trabajadas matutinas: ");
            horasMat = entrada.nextInt();

            System.out.println("Ingresa las horas trabajadas nocturnas: ");
            horasNoc = entrada.nextInt();
            
            entrada.nextLine();
                    
            totalMat = horasMat * cuotaMat;
            

            if (horasNoc >= 10) {

                adicional = (cuotaNoc * 10) / 100;
                cuotaNoc = cuotaNoc + adicional;
            }

            
            totalNoc = cuotaNoc * horasNoc;
            cuotaNoc = 15;
            subTotal = totalMat + totalNoc;

            seguro = (subTotal * 18) / 100;
            total = subTotal - seguro;

            mensaje = String.format("%sRol de trabajadores de nombre: %s y "
                    + "cédula "
                    + "%d.\n\t Horas matutinas trabajadas: %d"
                    + ".\n\t Horas nocturnas trabajadas: %d"
                    + ".\n\t Subtotal: $%.2f"
                    + ".\n\t Seguro Social: $%.2f"
                    + ".\n\t Total a cancelar: $%.2f\n",
                    mensaje,
                    nombre,
                    cedula,
                    horasMat,
                    horasNoc,
                    subTotal,
                    seguro,
                    total);

            contador = contador + 1;

            System.out.println("Desea parar de ingresar empleados, si desea "
                    + "parar, ingrese s");
            opcion = entrada.nextLine();

            if (opcion.equals("s")) {
                bandera = false;

            }

        }

        System.out.printf("Nómina de trabajadores\n%sNúmero de empleados: %d\n",
                 mensaje,
                 contador);

    }

}
