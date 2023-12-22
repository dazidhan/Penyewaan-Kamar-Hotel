package model;

public class Akun {
    private String nama;
    private String alamat;
    private String telepon;
    
    public Akun setAlamat(String alamat){
        this.alamat = alamat;
        return this;
    }
    public String getAlamat(){
        return this.alamat;
    }

    public Akun setNama(String nama){
        this.nama = nama;
        return this;
    }
    public String getNama(){
        return this.nama;
    }

    public Akun setTelepon(String telepon){
        this.telepon = telepon;
        return this;
    }
    public String getTelepon(){
        return this.telepon;
    }
}

