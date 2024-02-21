import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Değişkenler
        int distance, flight, age;
        double price;
        final double dis;
//Kullanıcı Girişleri
        System.out.println("Mesafeyi Km Olarak Giriniz: ");
        Scanner dist = new Scanner(System.in);
        distance = dist.nextInt();

        System.out.println("Yaşınızı Giriniz : ");
        Scanner ages = new Scanner(System.in);
        age = ages.nextInt();

        System.out.println("Yolculuk Tipini Giriniz (1-Tek Yön 2- Gidiş-Dönüş): ");
        Scanner type = new Scanner(System.in);
        flight = type.nextInt();
//Ücretlendirme planı
        price = (distance * 0.10);
//Swtich-Case Döngüsü

        if (distance < 0 || age < 0 || (flight != 1 && flight != 2)) {
            System.out.println("Hatalı Giriş Yaptınız!");
        } else
        {
            switch (flight) {

                case 1:
                    if (age >= 0 && age < 12) {
                        System.out.println("Bilet Fiyatı : " + (price * 0.5) + " TL ");
                    } else if (age >= 12 && age <= 24) {
                        System.out.println("Bilet Fiyatı : " + (price * 0.9) + " TL ");
                    } else if (age >= 65) {
                        System.out.println("Bilet Fiyatı : " + (price * 0.7) + " TL ");
                    } else {
                        System.out.println("Bilet Fiyatı : " + price + " TL");
                    }
                    break;

                case 2:
                    if (age >= 0 && age < 12) {
                        System.out.println("Bilet Fiyatı : " + (price * 0.5 * 2 * 0.8) + " TL ");
                    } else if (age >= 18 && age <= 24) {
                        System.out.println("Bilet Fiyatı : " + (price * 0.9 * 2 * 0.8) + " TL ");
                    } else if (age >= 65) {
                        System.out.println("Bilet Fiyatı :" + (price * 0.7 * 2 * 0.8) + " TL ");
                    } else {
                        System.out.println("Bilet Fiyatı :" + (price * 2 * 0.8) + " TL ");
                    }
                    break;
                }

            }
        }
    }

