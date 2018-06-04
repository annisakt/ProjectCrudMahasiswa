package com.example.annis.crudmhs.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by annis on 28/05/2018.
 */

public class MahasiswiResult {
    @SerializedName("mahasiswi")
    @Expose
    private List<Mahasiswa> mahasiswi = null;
//
//    private Mahasiswa mahasiswi;

    public List<Mahasiswa> getMahasiswi() {
        return mahasiswi;
    }

    public void setMahasiswi(List<Mahasiswa> mahasiswi) {
        this.mahasiswi = mahasiswi;
    }

}