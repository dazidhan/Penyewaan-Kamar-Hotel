package model;

public class Penyedia extends Akun{
    private String idPenyedia;

    public Penyedia setIdPenyedia(String idPenyedia){
        this.idPenyedia = idPenyedia;
        return this;
    }
    public String getIdPenyedia(){
        return idPenyedia;
    }
}
