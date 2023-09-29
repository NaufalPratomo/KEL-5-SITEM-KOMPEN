import java.util.Scanner;

public class sistem_kompen {
    public static void main (String [] hady){
        Scanner input = new Scanner (System.in);
        
        String nama , nim ;
        double kompen_s1 , kompen_s2, kompen_s3, kompen_s4, kompen_s5, kompen_s6, kompen_s7, kompen_s8, poin_akhir;

            System.out.println("===== Menghitung Nilai Kompen Mahasiswa=====\n");
                    System.out.print("Masukan nama : ");
                    nama = input.nextLine();
                    System.out.print("Masukan NIM : ");
                    nim = input.nextLine();
                    System.out.print("Kompen Semester 1 : ");
                    kompen_s1 = input.nextDouble();
                    System.out.print("Kompen semester 2 : ");
                    kompen_s2 = input.nextDouble();
                    System.out.print("Kompen semester 3 : ");
                    kompen_s3 = input.nextDouble();
                    System.out.print("Kompen semester 4 : ");
                    kompen_s4 = input.nextDouble();
                    System.out.print("Kompen semester 5 : ");
                    kompen_s5 = input.nextDouble();
                    System.out.print("Kompen semester 6 : ");
                    kompen_s6 = input.nextDouble();
                    System.out.print("Kompen semester 7 : ");
                    kompen_s7 = input.nextDouble();
                    System.out.print("Kompen semester 8 : ");
                    kompen_s8 = input.nextDouble();

                    if (kompen_s1 > 0 && kompen_s2 > 0 && kompen_s3 > 0 && kompen_s4 > 0 && kompen_s5 > 0 && kompen_s6 > 0 && kompen_s7 > 0 && kompen_s8 > 0) {
                        System.out.println(kompen_s1 + kompen_s2 + kompen_s3 + kompen_s4 + kompen_s5 + kompen_s6 + kompen_s7 + kompen_s8 * 2);
                    } else {
                        System.out.println(kompen_s1 + kompen_s2 + kompen_s3 + kompen_s4 + kompen_s5 + kompen_s6 + kompen_s7 + kompen_s8 * 0);
                    }

                    kompen_s1 = kompen_s1 * 2;
                    kompen_s2 = kompen_s2 * 2;
                    kompen_s3 = kompen_s3 * 2;
                    kompen_s4 = kompen_s4 * 2;
                    kompen_s5 = kompen_s5 * 2;
                    kompen_s6 = kompen_s6 * 2;
                    kompen_s7 = kompen_s7 * 2;
                    kompen_s8 = kompen_s8 * 2;

        poin_akhir = (kompen_s1 + kompen_s2 + kompen_s3 + kompen_s4 + kompen_s5 + kompen_s6 + kompen_s7 + kompen_s8) * 2;

        System.out.println(nama+" dengan NIM "+nim+" memiliki nilai kompen akhir " + poin_akhir);
    }
}
