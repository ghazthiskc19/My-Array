import java.util.Scanner;
public class praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        int arr[] = new int[100];
        int banyakDataAwal = 0;
        int banyakDataAkhir = 0;

        while(num != 7 && num != 0){
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");
            num = input.nextInt();

            switch (num) {
                case 1:
                    System.out.print("Masukkan banyak data : ");
                    banyakDataAkhir = input.nextInt();
                    banyakDataAkhir = banyakDataAkhir + banyakDataAwal;
                    for(int j = banyakDataAwal; j < banyakDataAkhir; j++){
                        arr[j] = input.nextInt();
                    }
                    banyakDataAwal = banyakDataAkhir;
                    break;
                case 2:
                    for(int i = 0; i < arr.length; i++){
                        if(arr[i] != 0) System.out.print(arr[i]+" ");
                    }
                    System.out.println("");
                    break;
                case 3:
                    int sum = 0;
                    for(int i = 0; i < banyakDataAkhir; i++){
                        sum += arr[i];
                    }
                    System.out.println("Average : "+(double)sum/banyakDataAkhir);
                    break;
                case 4:
                    int sumEl = 0;
                    for(int i = 0; i < banyakDataAkhir; i++){
                        sumEl += arr[i];
                    }
                    System.out.println("Sum : "+sumEl);
                    break;
                case 5:
                    int max = arr[0];
                    for(int i = 1; i < banyakDataAkhir; i++){
                        if(arr[i] > max){
                            max = arr[i];
                        }
                    }
                    System.out.println("Max : "+max);
                    break;
                case 6:
                    int min = arr[0];
                    for(int i = 1; i < banyakDataAkhir; i++){
                        if(arr[i] < min){
                            min = arr[i];
                        }
                    }
                    System.out.println("Min : "+min);
                    break;
                case 7:
                case 0:
                    System.out.println("Keluar");
                    break;
            }
        }
    }
}
