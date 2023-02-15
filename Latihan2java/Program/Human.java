package Latihan.Latihan2java.Program;

public class Human {
    private String nama;
    private String nik;
    private char gender;

    public Human(){
        this.nama = "";
        this.nik = "";
        this.gender = ' ';
    }

    public Human(String nama, String nik, char gender){
        this.nama = nama;
        this.nik = nik;
        this.gender = gender;
    }

    // Get-set nama
    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    // Get-set nik
    public String getNIK(){
        return this.nik;
    }

    public void setNIK(String nik){
        this.nik = nik;
    }

    // Get-set Gender
    public char getGender(){
        return this.gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
}
