package hipotenusHesapla.src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        int aKenar,bKenar;
        double cKenar;
        Scanner imp =new Scanner(System.in);
        System.out.print("A kenar uzunluğunu giriniz:");
        aKenar=imp.nextInt();
        System.out.print("B kenar uzunluğunu giriniz:");
        bKenar=imp.nextInt();
        cKenar= Math.sqrt((aKenar*aKenar)+(bKenar*bKenar));
        System.out.print("Girilen bilgilere gore Hipotenus uzunluğu: "+cKenar);

        imp.close();



    }
}
