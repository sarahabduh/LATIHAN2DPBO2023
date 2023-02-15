package Latihan.Latihan2java.Program;

public class SivitasAkademik extends Mahasiswa{ // kelas SivitasAkademik turunan dari kelas Mahasiswa
    private String asal_universitas;
    private String email_edu;
    private String status;

    public SivitasAkademik(){
        this.asal_universitas = "";
        this.email_edu = "";
        this.status = "";
    }

    public SivitasAkademik(String asal_universitas, String email_edu, String status){
        this.asal_universitas = asal_universitas;
        this.email_edu = email_edu;
        this.status = status;
    }

    // Get-set Asal Universitas
    public String getAsalUniversitas(){
        return this.asal_universitas;
    }

    public void setAsalUniversitas(String asal_universitas){
        this.asal_universitas = asal_universitas;
    }
    
    // Get-set Email Edu
    public String getEmail(){
        return this.email_edu;
    }

    public void setEmail(String email_edu){
        this.email_edu = email_edu;
    }

    // Get-set Status
    public String getStatus(){
        return this.status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
