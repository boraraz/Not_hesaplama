
import java.util.Scanner;

public class Not {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, toplam;
        double ortalama;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scan.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        ortalama = toplam / 6;

        System.out.println("Ortalamanız: " + ortalama);

        System.out.println(ortalama >= 60 ? "Sınıf geçildi" : "Sınıf geçilemedi");

    }

}
