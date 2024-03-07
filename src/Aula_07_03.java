import java.util.Scanner;

public class Aula_07_03 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte a;
        byte b;

        a = Byte.parseByte(scan.next());
        b = Byte.parseByte(scan.next());

        int meubyte = a << 4;
        meubyte = b | meubyte;

        System.out.println(meubyte);

    }
}
