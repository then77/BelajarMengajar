package com.example.belajarmengajarreal.models;

public class Materi {
    public String judul;
    public String deskripsi;
    public String kategori;
    public String vidio;

    public Materi(String judul, String deskripsi, String kategori, String vidio) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.vidio = vidio;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getKategori() {
        return kategori;
    }

    public String getVidio() {
        return vidio;
    }
}
