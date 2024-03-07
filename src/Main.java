import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, num4;
        DecimalFormat numberFormat = new DecimalFormat("#.0000");

        try {
            String x1 = scan.next();
            String y1 = scan.next();
            String x2 = scan.next();
            String y2 = scan.next();

            num1 = Integer.parseInt(x1);
            num2 = Integer.parseInt(y1);
            num3 = Integer.parseInt(x2);
            num4 = Integer.parseInt(y2);

            double valor = Math.sqrt(Math.pow((num3-num1), 2)+Math.pow((num4-num2), 2));

            System.out.print("A distância entre os dois pontos é: " );
            System.out.printf("%5.4f\n", valor);
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }
}
