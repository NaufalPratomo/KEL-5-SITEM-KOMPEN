import java.util.Scanner;

public class sistem_kompen {
    public static void main (String [] hady){

        String nama , nim ;
        final double kompen_s1 , kompen_s2, poin_akhir;

        try (Scanner input = new Scanner (System.in)) {
            System.out.println("===== Menghitung Nilai Kompen Mahasiswa=====\n");
                    System.out.print("Masukan nama : ");
                    nama = input.nextLine();
                    System.out.print("Masukan NIM : ");
                    nim = input.nextLine();
                    System.out.print("Kompen Semester 1 : ");
                    kompen_s1 = input.nextInt();
                    System.out.print("Kompen semester 2 : ");
                    kompen_s2 = input.nextInt();
        }

  poin_akhir = (4 * kompen_s1 + 2 * kompen_s2);

        System.out.println(nama+" dengan NIM "+nim+" memiliki nilai kompen akhir "+poin_akhir);
    }
}
