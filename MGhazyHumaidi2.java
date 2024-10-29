import java.util.Scanner;

public class MGhazyHumaidi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input, banyak = 0, start = 0;
        String[] jenisPesanan = new String[100];
        int[] jlm = new int[100];
        int[] harga = new int[100];

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
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Ekonomi", "50000", "2%", "Tidak Ada", "Tidak Ada");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Bisnis", "100000", "5%", "Ada", "Tidak Ada");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Eksekutif", "200000", "7%", "Ada", "Tidak Ada");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Pariwisata", "300000", "10%", "Ada", "Ada");
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                }
                case 2 -> {
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Bisnis", "100000", "5%", "Ada", "Tidak Ada");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Eksekutif", "200000", "7%", "Ada", "Tidak Ada");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Pariwisata", "300000", "10%", "Ada", "Ada");
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                }
                case 3 -> {
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("| %-12s| %-12s| %-12s| %-12s| %-12s|\n", "Pariwisata", "300000", "10%", "Ada", "Ada");
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                }
                case 4 -> {
                    while (true) {
                        System.out.print("Jenis (ketik '-' untuk selesai): ");
                        String jenis = sc.next();
                        if (jenis.equals("-")) break;
                        
                        if(jenis.equalsIgnoreCase("ekonomi")){
                            harga[banyak] = 50000 * 98 / 100;
                        }else if(jenis.equalsIgnoreCase("bisnis")){
                            harga[banyak] = 100000 * 95 / 100;
                        }else if(jenis.equalsIgnoreCase("pariwisata")){
                            harga[banyak] = 200000 * 93 / 100;
                        }else if(jenis.equalsIgnoreCase("pariwisata")){
                            harga[banyak] = 300000 * 90 / 100;
                        }

                        System.out.print("Jumlah: ");
                        int jumlah = sc.nextInt();
                        
                        jenisPesanan[banyak] = jenis;
                        jlm[banyak] = jumlah;
                        banyak++;
                    }
                }
                case 5 -> {
                    System.out.println("List Pesanan:");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.printf("| %-20s| %-16s| %-24s|\n", "Jenis Kereta", "Jumlah Tiket", "Harga Total");
                    System.out.println("-------------------------------------------------------------------");
                    for (int i = 0; i < banyak; i++) {
                        System.out.printf("| %-20s| %-16s| Rp. %-20s|\n", jenisPesanan[i], jlm[i], (harga[i] * jlm[i]));
                    }
                    System.out.println("-------------------------------------------------------------------");
                }
                case 0 -> System.out.println("Anda memilih untuk keluar.");
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (input != 0);
    }
}
