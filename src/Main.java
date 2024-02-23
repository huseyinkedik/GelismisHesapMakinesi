import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("ikinci sayı sıfırdan farklı olmalıdır");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs işlem sonucu: " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod işlem sonucu: " + result);
        return result;
    }

    static void calc(int a, int b) {
        System.out.println("Dikdörtgen Çevresi: " + (2 * a * b));
        System.out.println("Dikdörtgen Alanı: " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1-Toplama işlemi\n"
                + "2-Çıkarma işlemi\n"
                + "3-Çarpma işlemi\n"
                + "4-Bölme işlemi\n"
                + "5-Üslü Sayı Hesaplama \n"
                + "6-Mod Alma\n"
                + "7-Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0-Çıkış Yap\n";
        System.out.println(menu);
        while (true) {
            System.out.println("Bir işlem seçiniz: ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }

            System.out.println("İlk sayıyı giriniz: ");
            int a = input.nextInt();
            System.out.println("ikinci sayıyı giriniz: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;

                default:
                    System.out.print("Yanlış değer girdiniz");
            }
            break;
        }

    }
}