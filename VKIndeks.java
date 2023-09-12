import java.util.Scanner;
public class VKIndeks {
    public static void main(String[] args) {
        double boy, kilo , indeks;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble() ;
        System.out.print("Lütfen kilonuzu giriniz :") ;
        kilo = input.nextDouble();
        indeks = kilo/(boy*boy)*10000;
        System.out.println("Vücut Kitle İndeksiniz : "+ indeks);
    }
}