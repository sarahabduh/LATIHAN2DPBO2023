<?php

class Mahasiswa extends SivitasAkademik
{
    private $nim = "";
    private $prodi = "";
    private $fakultas = "";

    public function __construct($nim = "", $prodi = "", $fakultas = ""){
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }

    // Get-set NIM
    public function setNIM($nim){
        $this->nim = $nim;
    }

    public function getNIM(){
        return $this->nim;
    }

    // Get-set Prodi
    public function setProdi($prodi){
        $this->prodi = $prodi;
    }

    public function getProdi(){
        return $this->prodi;
    }

    // Get-set Fakultas
    public function setFakultas($fakultas){
        $this->fakultas = $fakultas;
    }

    public function getFakultas(){
        return $this->fakultas;
    }
}

?>