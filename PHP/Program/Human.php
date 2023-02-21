<?php

class Human
{
    private $nama = "";
    private $nik = "";
    private $gender = '';

    public function __construct($nama = "", $nik = "", $gender = ''){
        $this->nama = $nama;
        $this->nik = $nik;
        $this->gender = $gender;
    }

    // Get-set Nama
    public function setNama($nama){
        $this->nama = $nama;
    }

    public function getNama(){
        return $this->nama;
    }

    // Get-set NIK
    public function setNIK($nik){
        $this->nik = $nik;
    }

    public function getNIK(){
        return $this->nik;
    }

    // Get-set Gender
    public function setGender($gender){
        $this->gender = $gender;
    }

    public function getGender(){
        return $this->gender;
    }
}

?>