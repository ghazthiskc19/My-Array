import java.util.Scanner;
public class MGhazyHumaidi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] jadwal = new String[5][5];
        jadwal[0][0] = "Jenis";
        jadwal[0][1] = "     Harga";
        jadwal[0][2] = "  Diskon";
        jadwal[0][3] = "       AC";
        jadwal[0][4] = "       Colokan";
        jadwal[1][0] = "Ekonomi";
        jadwal[1][1] = "   50000";
        jadwal[1][2] = "   2% ";
        jadwal[1][3] = "       Tidak ada";
        jadwal[1][4] = "   Tidak ada";
        jadwal[2][0] = "Bisnis";
        jadwal[2][1] = "    100000";
        jadwal[2][2] = "  5% ";
        jadwal[2][3] = "         Ada";
        jadwal[2][4] = "       Tidak ada";
        jadwal[3][0] = "Eksekutif";
        jadwal[3][1] = " 200000";
        jadwal[3][2] = "  7% ";
        jadwal[3][3] = "         Ada";
        jadwal[3][4] = "       Tidak ada";
        jadwal[4][0] = "Pariwisata";
        jadwal[4][1] = "300000";
        jadwal[4][2] = "  10% ";
        jadwal[4][3] = "        Ada";
        jadwal[4][4] = "       Ada";
        int input = 0;
        int std = 0;
        String[] orderr = new String[100];
        int[] qty = new int[100];
        
        int start = 0;
        int end = 0;
        do {
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Kereta Api yang ada AC");
            System.out.println("3. Melihat Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    for (int i = 0; i < jadwal.length; i++) {
                        for (int j = 0; j < jadwal.length; j++) {
                            System.out.print(jadwal[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i < jadwal.length; i++) {
                        for (int j = 0; j < jadwal.length; j++) {
                            if (i == 1) {
                                continue;
                            } else System.out.print(jadwal[i][j] + " ");
                        }
                        if (i == 1) {
                            continue;
                        } else System.out.println();

                    }
                    break;
                case 3:
                    for (int i = 0; i < jadwal.length; i++) {
                        for (int j = 0; j < jadwal.length; j++) {
                            if (i == 1 || i == 2 || i == 3) {
                                continue;
                            } else System.out.print(jadwal[i][j] + " ");
                        }
                        if (i == 1 || i == 2 || i == 3) {
                            continue;
                        } else System.out.println();
                    }
                    System.out.println();
                    break;
                case 4:
                    for (int i = start; i < orderr.length; i++) {
                        System.out.print("Jenis: ");
                        String jenis = sc.next();
                        
                        System.out.print("Jumlah: ");
                        int jumlah = sc.nextInt();
                        std++;
                        if (jenis.equals("-") || jumlah == 0) {
                            std--;
                            start = i;
                            break;
                        }
                        orderr[i] = jenis;
                        qty[i] = jumlah;
                    }
                    System.out.println(std);
                    break;
                case 5:
                    System.out.println("List Pesanan: ");
                    for (int i = 0; i < std; i++) {
                        System.out.print(orderr[i] + "\t" + qty[i] + "\n");
                    }
                    break;
                case 0:
                    System.out.println("Anda memilih untuk keluar.\n");
                    return;
            }
        } while (input != 0);
    }
}
