package model;

public class Kamar {
    private String namaKamar;
    private String idKamar;
    private int hargaSewaKamar;
    private int waktuSewa;
    private boolean isAvailable;

    
    public Kamar setWaktuSewa(int waktuSewa){
        this.waktuSewa = waktuSewa;
        return this;
    }
    public int getWaktuSewa(){
        return this.waktuSewa;
    }
    
    public Kamar setNamaKamar(String namaKamar){
        this.namaKamar = namaKamar;
        return this;
    }
    public String getNamaKamar(){
        return this.namaKamar;
    }

    public Kamar setidKamar(String idKamar){
        this.idKamar = idKamar;
        return this;
    }
    public String getidKamar(){
        return this.idKamar;
    }

    public Kamar sethargaSewaKamar(int hargaSewaKamar){
        this.hargaSewaKamar = hargaSewaKamar;
        return this;
    }
    public int gethargaSewaKamar(){
        return this.hargaSewaKamar;
    }

    public Kamar setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
        return this;
    }
    public boolean isIsAvailable(){
        return this.isAvailable;
    }


}
