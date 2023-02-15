package Latihan.Latihan2java.Program;

    // Saya Sarah Muhammad Abduh 2002939 mengerjakan Latihan 2 dalam mata kuliah 
    // DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan 
    // seperti yang telah dispesifikasikan. Aamiin.
    
public class Main {
    public static void main(String[] args) {

        // Set atribut Human
        Human cHuman = new Human();
        cHuman.setNama("NamaHuman");
        cHuman.setGender('P');
        cHuman.setNIK("189088329211");

        // Set atribut Mahasiswa
        Mahasiswa cMahasiswa = new Mahasiswa();
        cMahasiswa.setNama("Sarah");
        cMahasiswa.setNIM("2002939");
        cMahasiswa.setGender('P');
        cMahasiswa.setProdi("Ilkom");
        cMahasiswa.setFakultas("FPMIPA");

        // Set atribut SivitasAkademik (dosen)
        SivitasAkademik cSivitas1 = new SivitasAkademik();
        cSivitas1.setNama("Sivitas1");
        cSivitas1.setGender('L');
        cSivitas1.setStatus("Dosen");
        cSivitas1.setNIK("189088329230");
        cSivitas1.setProdi("Prodi1");
        cSivitas1.setFakultas("Fakultas1");
        cSivitas1.setAsalUniversitas("UPI");
        cSivitas1.setEmail("sivitas1@upi.edu");

        // Set atribut SivitasAkademik (mahasiswa)
        SivitasAkademik cSivitas2 = new SivitasAkademik();
        cSivitas2.setNama("Sivitas2");
        cSivitas2.setGender('L');
        cSivitas2.setStatus("Mahasiswa");
        cSivitas2.setNIM("2001234");
        cSivitas2.setProdi("Prodi2");
        cSivitas2.setFakultas("Fakultas2");
        cSivitas2.setAsalUniversitas("UPI");
        cSivitas2.setEmail("sivitas2@upi.edu");
        
        // Print atribut Human
        System.out.println("<Human>");
        System.out.println("Nama              : " + cHuman.getNama());
        System.out.println("Jenis Kelamin     : " + cHuman.getGender());
        System.out.println("NIK               : " + cHuman.getNIK());
        System.out.print("\n");

        // Print atribut Mahasiswa
        System.out.println("<Mahasiswa>");
        System.out.println("Nama              : " + cMahasiswa.getNama());
        System.out.println("Jenis Kelamin     : " + cMahasiswa.getGender());
        System.out.println("NIM               : " + cMahasiswa.getNIM());
        System.out.println("Program Studi     : " + cMahasiswa.getProdi());
        System.out.println("Fakultas          : " + cMahasiswa.getFakultas());
        System.out.print("\n");

        // Print atribut Sivitas Akademik
        System.out.println("<Sivitas Akademik>");
        System.out.println("1. Dosen");
        System.out.println("- Nama             : " + cSivitas1.getNama());
        System.out.println("- Jenis Kelamin    : " + cSivitas1.getGender());
        System.out.println("- NIK              : " + cSivitas1.getNIK());
        System.out.println("- Program Studi    : " + cSivitas1.getProdi());
        System.out.println("- Fakultas         : " + cSivitas1.getFakultas());
        System.out.println("- Asal Universitas : " + cSivitas1.getAsalUniversitas());
        System.out.println("- Email            : " + cSivitas1.getEmail());
        System.out.print("\n");
        
        System.out.println("2. Mahasiswa");
        System.out.println("- Nama             : " + cSivitas2.getNama());
        System.out.println("- Jenis Kelamin    : " + cSivitas2.getGender());
        System.out.println("- NIM              : " + cSivitas2.getNIM());
        System.out.println("- Program Studi    : " + cSivitas2.getProdi());
        System.out.println("- Fakultas         : " + cSivitas2.getFakultas());
        System.out.println("- Asal Universitas : " + cSivitas2.getAsalUniversitas());
        System.out.println("- Email            : " + cSivitas2.getEmail());
    }    
}
