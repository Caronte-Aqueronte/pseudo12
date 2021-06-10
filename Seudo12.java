import java.util.Scanner;

public class Seudo12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = 0;
        int sumaalturamujer = 0;
        int sumaalturahombre = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int edad;
        int sumaedades = 0;
        double promedio1;
        double promedio2;
        double promedio3;
        String sexo;
        while (altura >= 0) {
            System.out.println("Ingrese la altura en cm");
            altura = scanner.nextInt();
            if (altura >= 0) {
                System.out.println("Ingrese la edad");
                edad = scanner.nextInt();
                System.out.println("Ingrese el sexo F/M");
                sexo = scanner.nextLine();
                while (!sexo.equals("F") && !sexo.equals("M")) {
                    System.out.println("Ingrese el sexo valido F/M");
                    sexo = scanner.nextLine();
                }
                switch (sexo) {
                    case "F":
                        sumaalturamujer = sumaalturamujer + altura;
                        contador1++;
                        break;
                    case "M":
                        sumaalturahombre = sumaalturahombre + altura;
                        contador2++;
                        break;
                }
                contador3++;
                sumaedades = sumaedades + edad;
            }
        }
        if (contador1 == 0) {
            contador1 = 1;
        }
        if (contador2 == 0) {
            contador2 = 1;
        }
        if (contador3 == 0) {
            contador3 = 1;
        }
        promedio1 = sumaalturamujer / (double) contador1;
        promedio2 = sumaalturahombre / (double) contador2;
        promedio3 = sumaedades / (double) contador3;
        System.out.println("El promedio de altura en mujeres es de " + promedio1 + " cm");
        System.out.println("El promedio de altura en hombres es de " + promedio2 + " cm");
        System.out.println("El promedio de edades es de " + promedio3 + " años");
    }
}