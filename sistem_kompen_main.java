import java.util.Scanner;

public class sistem_kompen_main {
    static Scanner input = new Scanner(System.in);

    // Deklarasi
    static String nimMhs;
    static String passMhs;
    static String nama, kelas;
    static int semester;
    static double poin_akhir = 0;
    static int baris = 5, kolom = 9, kerja = 0, duplicate;

    // Fungsi Clear the screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Fungsi pilih semester
    public static int pilihSemester() {
        // Input semester (pilih semester)
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║       Perhitungan Kompen Mahasiswa         ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.print("Masukkan Semester (1-8): ");
        semester = input.nextInt();
        if (semester > 8 || semester < 1) {
            System.out.println("Semester tidak valid.");
            pilihSemester();
        }
        return semester;
    }

    // Fungsi konfirmasi Semester
    public static int konfirmasiSemester(int kompen) {
        // Rekursif
        System.out.print("Apakah Kompen sudah dikerjakan (y/t) : ");
        String jawabKonfirmasi = input.next().toLowerCase();
        switch (jawabKonfirmasi) {
            case "y":
                kompen *= 0;
                break;
            case "t":
                kompen *= 2;
                break;
            default:
                System.out.println("Pilihan anda salah");
                konfirmasiSemester(kompen);
                break;
        }
        return kompen;
    }

    // Fungsi Headline menu Admin
    public static void hlAdmin() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("           Selamat datang Admin               ");
        System.out.println("║          Silahkan Pilih Menu :             ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    // Fungsi Headline menu Mahasiswa
    public static void hlMhs() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("           Selamat datang " + nama + "            ");
        System.out.println("║          Silahkan Pilih Menu :             ║");
        System.out.println("╚════════════════════════════════════════════╝");
    }

    public static void main(String[] args) {

        System.out.println(
                "  ███████╗███████╗██╗      █████╗ ███╗   ███╗ █████╗ ████████╗    ██████╗  █████╗ ████████╗ █████╗ ███╗   ██╗ ██████╗ ");
        System.out.println(
                "  ██╔════╝██╔════╝██║     ██╔══██╗████╗ ████║██╔══██╗╚══██╔══╝    ██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗████╗  ██║██╔════╝ ");
        System.out.println(
                "  ███████╗█████╗  ██║     ███████║██╔████╔██║███████║   ██║       ██║  ██║███████║   ██║   ███████║██╔██╗ ██║██║  ███╗");
        System.out.println(
                "  ╚════██║██╔══╝  ██║     ██╔══██║██║╚██╔╝██║██╔══██║   ██║       ██║  ██║██╔══██║   ██║   ██╔══██║██║╚██╗██║██║   ██║");
        System.out.println(
                "  ███████║███████╗███████╗██║  ██║██║ ╚═╝ ██║██║  ██║   ██║       ██████╔╝██║  ██║   ██║   ██║  ██║██║ ╚████║╚██████╔╝");
        System.out.println(
                "  ╚══════╝╚══════╝╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝   ╚═╝       ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ");

        System.out.println(
                "██████╗ ██╗    ███████╗██╗███████╗████████╗███████╗███╗   ███╗    ██╗  ██╗ ██████╗ ███╗   ███╗██████╗ ███████╗███╗   ██╗");
        System.out.println(
                "██╔══██╗██║    ██╔════╝██║██╔════╝╚══██╔══╝██╔════╝████╗ ████║    ██║ ██╔╝██╔═══██╗████╗ ████║██╔══██╗██╔════╝████╗  ██║");
        System.out.println(
                "██║  ██║██║    ███████╗██║███████╗   ██║   █████╗  ██╔████╔██║    █████╔╝ ██║   ██║██╔████╔██║██████╔╝█████╗  ██╔██╗ ██║");
        System.out.println(
                "██║  ██║██║    ╚════██║██║╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║    ██╔═██╗ ██║   ██║██║╚██╔╝██║██╔═══╝ ██╔══╝  ██║╚██╗██║");
        System.out.println(
                "██████╔╝██║    ███████║██║███████║   ██║   ███████╗██║ ╚═╝ ██║    ██║  ██╗╚██████╔╝██║ ╚═╝ ██║██║     ███████╗██║ ╚████║");
        System.out.println(
                "╚═════╝ ╚═╝    ╚══════╝╚═╝╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝    ╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚══════╝╚═╝  ╚═══╝");

        System.out.println(
                "                    ███╗   ███╗ █████╗ ██╗  ██╗ █████╗ ███████╗██╗███████╗██╗    ██╗ █████╗ ");
        System.out.println(
                "                    ████╗ ████║██╔══██╗██║  ██║██╔══██╗██╔════╝██║██╔════╝██║    ██║██╔══██╗");
        System.out.println(
                "                    ██╔████╔██║███████║███████║███████║███████╗██║███████╗██║ █╗ ██║███████║");
        System.out.println(
                "                    ██║╚██╔╝██║██╔══██║██╔══██║██╔══██║╚════██║██║╚════██║██║███╗██║██╔══██║");
        System.out.println(
                "                    ██║ ╚═╝ ██║██║  ██║██║  ██║██║  ██║███████║██║███████║╚███╔███╔╝██║  ██║");
        System.out.println(
                "                    ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝╚══════╝ ╚══╝╚══╝ ╚═╝  ╚═╝");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        // Array 2D List Kompen Setiap Mahasiswa Pada Kelas yang Diinputkan
        String[][] kompenMhs = {
                { "Nama", "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8" },
                { "Naufal", "2", "0", "1" },
                { "Faishal", "2", "1", "3" },
                { "Dhanisa", "2", "2", "3" },
                { "Valen", "2", "1", "0" },
        };

        // Array untuk login data (NIM and password) for Admin
        String[] loginDataAdmin = {
                "admin", "adminpass",
                "1", "1"
        };

        // Array untuk login data (NIM and password) for Mahasiswa
        String[] loginDataMhs = {
                "2341720075", "1",
                "2341720212", "1",
                "2341720218", "1",
                "2341720016", "1"
        };

        // Dekorasi
        System.out.println("█▀ █ █▀ ▀█▀ █▀▀ █▀▄▀█  █▄▀ █▀█ █▀▄▀█ █▀█ █▀▀ █▄░█  █▀▄▀█ ▄▀█ █░█ ▄▀█ █▀ █ █▀ █░█░█ ▄▀█");
        System.out.println("▄█ █ ▄█ ░█░ ██▄ █░▀░█  █░█ █▄█ █░▀░█ █▀▀ ██▄ █░▀█  █░▀░█ █▀█ █▀█ █▀█ ▄█ █ ▄█ ▀▄▀▄▀ █▀█");
        System.out.println("");
        System.out.println("");

        // login
        System.out.println("===== Sistem Kompen Mahasiswa =====\n");
        boolean loginSukses = false;
        int pilihan = 0;
        while (!loginSukses) {
            System.out.print("Login sebagai (1. Admin, 2. Mahasiswa): ");
            pilihan = input.nextInt();
            input.nextLine();

            System.out.print("Masukkan Username: ");
            nimMhs = input.nextLine();
            System.out.print("Masukkan Password: ");
            passMhs = input.nextLine();

            switch (pilihan) {
                case 1:
                    // Cek login admin
                    for (int i = 0; i < loginDataAdmin.length; i += 2) {
                        if (nimMhs.equals(loginDataAdmin[i]) && passMhs.equals(loginDataAdmin[i + 1])) {
                            loginSukses = true;
                            nama = "Admin";
                            break;
                        }
                    }
                    break;

                case 2:
                    // Cek login mahasiswa
                    for (int i = 0; i < loginDataMhs.length; i += 2) {
                        if (nimMhs.equals(loginDataMhs[i]) && passMhs.equals(loginDataMhs[i + 1])) {
                            loginSukses = true;
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Pilihan anda salah");
                    break;
            }

            if (!loginSukses) {
                System.out.println("Username atau Password salah. Coba lagi.");
            }
        }
        clearScreen(); // Clear the screen

        // Input data mahasiswa
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║          Menginput Nama Mahasiswa          ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println("               ");
        System.out.println("               ");
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = input.nextLine();
        for (int i = 1; i < kompenMhs.length; i++) {
            if (kompenMhs[i][0].equalsIgnoreCase(nama)) {
                duplicate = i;
                break;
            }
        }
        if (kompenMhs[duplicate][0].equalsIgnoreCase(nama)) {
            System.out.println(" ");
            ;
        } else {
            clearScreen(); // Clear the screen

            // Fungsi untuk memasukkan input kompen kedalam array 2D list kompen
            String[][] newMhs = new String[baris + 1][kolom];
            for (int i = 0; i < kompenMhs.length; i++) {
                for (int j = 0; j < kompenMhs[i].length; j++) {
                    newMhs[i][j] = kompenMhs[i][j];
                }
            }
            kompenMhs = newMhs;
            kompenMhs[baris][0] = nama;
        }

        // Menu Sistem Kompen
        boolean sistemKompen = true;
        int menu;
        do {
            if (pilihan == 1) {
                hlAdmin();
            } else {
                hlMhs();
            }
            System.out.println("0. Keluar Program");

            if (pilihan == 2) {
                System.out.println("1. List Kompen anda");
            } else if (pilihan == 1) {
                System.out.println("1. Perhitungan Kompen Mahasiswa");
                System.out.println("2. List Kompen Pada Kelas " + kelas);
            }

            System.out.print("\nPilih menu: ");
            menu = input.nextInt();
            input.nextLine();
            clearScreen(); // Clear the screen

            switch (menu) {
                case 0:
                    sistemKompen = false;
                    break;
                case 1:
                    if (pilihan == 2) {
                        for (int i = 1; i < kompenMhs.length; i++) {
                            if (kompenMhs[i][0].equalsIgnoreCase(nama)) {
                                System.out.println(" +-------------------------------------+");
                                for (int j = 0; j < kompenMhs[i].length; j++) {
                                    if (kompenMhs[i][j] == null) {
                                        System.out.print(" | " + " ");
                                    } else {
                                        System.out.print(" | " + kompenMhs[i][j]);
                                    }
                                }
                            }
                        }
                        System.out.print(" | ");
                        System.out.println("\n +-------------------------------------+\n");
                    }
                    // Memanggil fungsi pilihSemester
                    else if (pilihan == 1) {
                        int simpanSemester = pilihSemester();
                        // Input kompen sesuai semester
                        int kompenSemester = 0;
                        for (int i = 1; i <= simpanSemester; i++) {
                            System.out.println(" semester " + i );
                            System.out.print("Masukkan alpha pada Semester ini (jam) " + i + ": ");
                            int kompen = input.nextInt();
                            input.nextLine();
                            // memanggil fungsi untuk menanyakan apakah kompen sudah dikerjakan
                            int simpanKompen = konfirmasiSemester(kompen);
                            String kompenString = Integer.toString(simpanKompen);
                            kompenMhs[baris][i] = kompenString;
                            for (int j = 0; j < semester - i; j++) {
                                simpanKompen *= 2;
                            }
                            kerja = simpanKompen;
                            kompenSemester += kerja;
                        }
                        poin_akhir = kompenSemester;
                    }
                    break;
                case 2:
                    // Cetak array 2D list kompen
                    for (int i = 0; i < kompenMhs.length; i++) {
                        for (int j = 0; j < kompenMhs[i].length; j++) {
                            if (kompenMhs[i][j] == null) {
                                kompenMhs[i][j] = "";
                            }
                            System.out.print(kompenMhs[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    // Hasil akhir
                    System.out.println(nama + " kelas " + kelas + " semester " + semester
                            + " memiliki nilai kompen akhir " + poin_akhir);

                    if (poin_akhir > 112) {
                        System.out.println("Anda PS (Putus Studi) !!!!!!!");
                    } else if (poin_akhir > 94) {
                        System.out.println("Anda mendapatkan SP 3 !!!");
                    } else if (poin_akhir > 72) {
                        System.out.println("Anda mendapatkan SP 2 !!");
                    } else if (poin_akhir > 36) {
                        System.out.println("Anda mendapatkan SP 1 !");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (sistemKompen);
        System.out.println("\n\nTerima kasih :D");

        // Close the Scanner
        input.close();
    }
}