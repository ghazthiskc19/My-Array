import java.util.Scanner;

public class MGhazyHumaidi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] jadwal = {
            {"Jenis", "     Harga", "  Diskon", "       AC", "       Colokan"},
            {"Ekonomi", "   50000", "   2%", "       Tidak ada", "   Tidak ada"},
            {"Bisnis", "    100000", "  5%", "         Ada", "       Tidak ada"},
            {"Eksekutif", " 200000", "  7%", "         Ada", "       Tidak ada"},
            {"Pariwisata", "300000", "  10%", "        Ada", "       Ada"}
        };

        int input;
        int std = 0;
        String[] pesanan = new String[100];
        int[] qty = new int[100];
        int start = 0;

        do {
            System.out.println("\n1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Kereta Api yang ada AC");
            System.out.println("3. Melihat Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");
            input = sc.nextInt();

            switch (input) {
                case 1 -> {
                    printJadwal(jadwal);
                }
                case 2 -> {
                    printFilteredJadwal(jadwal, "Ada", 3); // Filter AC
                }
                case 3 -> {
                    printFilteredJadwal(jadwal, "Ada", 4); // Filter Colokan
                }
                case 4 -> {
                    std = buatPesanan(sc, pesanan, qty, start, std);
                    start += std;
                }
                case 5 -> {
                    lihatPesanan(pesanan, qty, std);
                }
                case 0 -> {
                    System.out.println("Anda memilih untuk keluar.\n");
                }
                default -> {
                    System.out.println("Pilihan tidak valid.");
                }
            }
        } while (input != 0);
    }

    private static void printJadwal(String[][] jadwal) {
        for (String[] row : jadwal) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static void printFilteredJadwal(String[][] jadwal, String filter, int colIndex) {
        for (int i = 0; i < jadwal.length; i++) {
            if (i == 0 || jadwal[i][colIndex].contains(filter)) {
                for (String cell : jadwal[i]) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        }
    }

    private static int buatPesanan(Scanner sc, String[] pesanan, int[] qty, int start, int std) {
        System.out.println("Masukkan jenis dan jumlah tiket (ketik '-' atau '0' untuk keluar): ");
        for (int i = start; i < pesanan.length; i++) {
            System.out.print("Jenis: ");
            String jenis = sc.next();
            System.out.print("Jumlah: ");
            int jumlah = sc.nextInt();

            if ("-".equals(jenis) || jumlah == 0) {
                break;
            }
            pesanan[i] = jenis;
            qty[i] = jumlah;
            std++;
        }
        return std;
    }

    private static void lihatPesanan(String[] pesanan, int[] qty, int std) {
        System.out.println("List Pesanan: ");
        for (int i = 0; i < std; i++) {
            System.out.println(pesanan[i] + "\t" + qty[i]);
        }
    }
}
