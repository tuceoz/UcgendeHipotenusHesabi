import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c, ilkKenarKaresi, ikinciKenarKaresi, hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("İkinci kenarı giriniz: ");
        b = input.nextDouble();

        ilkKenarKaresi = a * a;
        ikinciKenarKaresi = b * b;
        hipotenus = Math.sqrt(ilkKenarKaresi + ikinciKenarKaresi);

        System.out.println("Üçgenin hipotenüsü " + hipotenus);

    }
}