import java.util.Scanner;

public class sistem_kompen_main {

    // clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaration
        String nimMhs;
        String passMhs;
        String nama, kelas;
        int semester;
        double poin_akhir = 0;
        
        // Array for login data (NIM and password)
        String[] loginData = {
            "2341720075", "1", 
            "2341720212", "1", 
            "2341720218", "1", 
            "2341720016", "1"
        };

        System.out.println("===== Menghitung Nilai Kompen Mahasiswa =====\n");
        
        boolean loginSukses = false;
        while (!loginSukses) {
            System.out.print("Masukkan NIM: ");
            nimMhs = input.nextLine();
            System.out.print("Masukkan Password: ");
            passMhs = input.nextLine();
            
            boolean found = false;
            for (int i = 0; i < loginData.length; i += 2) {
                if (nimMhs.equals(loginData[i]) && passMhs.equals(loginData[i + 1])) {
                    found = true;
                    loginSukses = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("NIM atau Password salah. Coba lagi.");
            }
        }

        // Input data mahasiswa
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = input.nextLine();

        // Input kompen sesuai semester
                    double kompenSemester = 0;

                    for (int i = 1; i <= semester; i++) {
                        System.out.println("Anda memilih semester " + i + ".");
                        System.out.print("Masukkan Kompen Semester " + i + ": ");
                        double kompen = input.nextDouble() * 2;
                        kompenSemester += kompen;
                    }

                    poin_akhir = kompenSemester;

                    // Hasil akhir
                    System.out.println(nama + " kelas " + kelas + " semester " + semester
                        + " memiliki nilai kompen akhir " + poin_akhir);
    }
}
