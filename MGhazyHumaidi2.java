import java.util.Scanner;

public class MGhazyHumaidi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] jadwal = {
            {"Jenis", "Harga", "Diskon", "AC", "Colokan"},
            {"Ekonomi", "50000", "2%", "Tidak ada", "Tidak ada"},
            {"Bisnis", "100000", "5%", "Ada", "Tidak ada"},
            {"Eksekutif", "200000", "7%", "Ada", "Tidak ada"},
            {"Pariwisata", "300000", "10%", "Ada", "Ada"}
        };

        int input, std = 0, start = 0;
        String[] orderr = new String[100];
        int[] qty = new int[100];

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Kereta Api yang ada AC");
            System.out.println("3. Melihat Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            input = sc.nextInt();

            switch (input) {
                case 1 -> {
                    for (String[] row : jadwal) {
                        for (String cell : row) {
                            System.out.print(cell + "\t");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.println("Kereta yang ada AC:");
                    for (int i = 1; i < jadwal.length; i++) {
                        if (jadwal[i][3].equals("Ada")) {
                            for (String cell : jadwal[i]) {
                                System.out.print(cell + "\t");
                            }
                            System.out.println();
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Kereta yang ada Colokan:");
                    for (int i = 1; i < jadwal.length; i++) {
                        if (jadwal[i][4].equals("Ada")) {
                            for (String cell : jadwal[i]) {
                                System.out.print(cell + "\t");
                            }
                            System.out.println();
                        }
                    }
                }
                case 4 -> {
                    while (true) {
                        System.out.print("Jenis (ketik '-' untuk selesai): ");
                        String jenis = sc.next();
                        if (jenis.equals("-")) break;

                        System.out.print("Jumlah: ");
                        int jumlah = sc.nextInt();
                        
                        orderr[std] = jenis;
                        qty[std] = jumlah;
                        std++;
                    }
                }
                case 5 -> {
                    System.out.println("List Pesanan:");
                    for (int i = 0; i < std; i++) {
                        System.out.println(orderr[i] + "\t" + qty[i]);
                    }
                }
                case 0 -> System.out.println("Anda memilih untuk keluar.");
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (input != 0);
    }
}
