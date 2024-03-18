package org.example;

import java.util.Scanner;

public class Main {
    class BookList {
        private static BookList[] BookList;
    }

    class userStudent {
        private static userStudent[] userStudent;
    }

    public void menu() {
        System.out.println("selamat datang di perpustakaan1");
        System.out.println("silakan pilih:");
        System.out.println("1. Login sebagai admin");
        System.out.println("2. Login sebagai student");
    }

    public String inputNim() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan NIM Anda: ");
        String nim = scanner.nextLine();
        scanner.close();
        return nim;
    }

    public void menuAdmin() {
    }

    private class Book {
        private int id;
        private String title;
        private String author;
        private int stock;

        public Book(int id, String title, String author, int stock) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.stock = stock;
        }
    }

    private static void main(String[] args) {
        Main main = new Main();
        main.menu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                main.menuAdmin();
                break;
            case 2:
                String nim = main.inputNim();
                if (main.checkNim()) {
                    main.menuStudent();
                } else {
                    System.out.println("NIM tidak valid!");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    private void menuStudent() {
        return;
    }

    private boolean checkNim() {
        return false;
    }

}    

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;


    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");

    }
}

public class Main {
    public static <ArrayList, ArrayList> void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    scanner.nextLine();
                    String nama = scanner.nextLine();

                    String nim;
                    do {
                        System.out.print("Masukkan NIM: ");
                        nim = scanner.next();
                        if (nim.length() != 15) {
                            System.out.println("Panjang NIM harus 15 Digit. Coba lagi.");
                        }
                    } while (nim.length() != 15);

                    System.out.print("Masukkan Jurusan: ");
                    scanner.nextLine();
                    String jurusan = scanner.nextLine();


                    daftarMahasiswa.add(new Mahasiswa(nim, nama, jurusan));
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("Data Mahasiswa:");
                    Mahasiswa.tampilUniversitas();
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        mahasiswa.tampilDataMahasiswa();
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("Sangkyu!");
                    scanner.close(); //
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valdi Silakan pilih kembali.");
            }
        }
    }
}