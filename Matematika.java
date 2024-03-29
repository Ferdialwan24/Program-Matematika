import java.util.Scanner;

public class Matematika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        while (menu != 5) {
            menu = tampilkanMenu(scanner);
            if (menu >= 1 && menu <= 4) {
                int angka1 = getInput("Masukkan Angka Pertama = ", scanner);
                int angka2 = getInput("Masukkan Angka Kedua = ", scanner);

                switch (menu) {
                    case 1:
                        System.out.println("Hasil Pertambahan antara " + angka1 + " dan " + angka2 + " adalah " + pertambahan(angka1, angka2));
                        break;
                    case 2:
                        System.out.println("Hasil Pengurangan antara " + angka1 + " dan " + angka2 + " adalah " + pengurangan(angka1, angka2));
                        break;
                    case 3:
                        System.out.println("Hasil Perkalian antara " + angka1 + " dan " + angka2 + " adalah " + perkalian(angka1, angka2));
                        break;
                    case 4:
                        if (angka2 == 0) {
                            System.out.println("Error: Tidak bisa melakukan pembagian dengan angka nol");
                        } else {
                            System.out.println("Hasil Pembagian antara " + angka1 + " dan " + angka2 + " adalah " + pembagian(angka1, angka2));
                        }
                        break;
                }
            } else if (menu != 5) {
                System.out.println("Error: Pilihan tidak valid");
            }
        }
    }

    public static int tampilkanMenu(Scanner scanner) {
        System.out.println("Menu Aplikasi Matematika:");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Keluar");
        System.out.print("Pilih Menu = ");
        return scanner.nextInt();
    }

    public static int getInput(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int pertambahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    public static int perkalian(int a, int b) {
        return a * b;
    }

    public static int pembagian(int a, int b) {
        return a / b;
    }
}
