<?php

    include "Human.php";
    include "SivitasAkademik.php";
    include "Mahasiswa.php";

    // Set atribut Mahasiswa
    $mhs = new Mahasiswa();
    $mhs->setNama("Sarah");
    $mhs->setGender('P');
    $mhs->setNIK("189088329230");
    $mhs->setNIM("2002939");
    $mhs->setProdi("Ilkom");
    $mhs->setFakultas("FPMIPA");
    $mhs->setAsalUni("UPI");
    $mhs->setEmail("sarah21@upi.edu");

    // menampilkan isi Mahasiswa
    echo "<b> [Data Mahasiswa] </b>". "<br>";
    echo "Nama : ". $mhs->getNama(). "<br>";
    echo "Jenis Kelamin : ". $mhs->getGender(). "<br>";
    echo "NIK : ". $mhs->getNIK(). "<br>";
    echo "NIM : ". $mhs->getNIM(). "<br>";
    echo "Program Studi : ". $mhs->getProdi(). "<br>";
    echo "Fakultas : ". $mhs->getFakultas(). "<br>";
    echo "Asal Universitas : ". $mhs->getAsalUni(). "<br>";
    echo "Email : ". $mhs->getEmail(). "<br>";
?>