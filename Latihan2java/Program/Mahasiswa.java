package Latihan.Latihan2java.Program;

public class Mahasiswa extends Human { // kelas Mahasiswa turunan dari kelas Human
    private String nim;
    private String prodi;
    private String fakultas;

    public Mahasiswa(){
        this.nim = "";
        this.prodi = "";
        this.fakultas = "";
    }

    public Mahasiswa(String nim, String prodi, String fakultas){
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }
    
    // Get-set nim
    public String getNIM(){
        return this.nim;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }

    // Get-set prodi
    public String getProdi(){
        return this.prodi;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    // Get-set fakultas
    public String getFakultas(){
        return this.fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
}
