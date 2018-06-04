package com.example.annis.crudmhs.network;

/**
 * Created by annis on 28/05/2018.
 */
import com.example.annis.crudmhs.modal.Mahasiswa;
import com.example.annis.crudmhs.modal.MahasiswiResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MahasiswaService {
    @GET("mahasiswi")
    Call<MahasiswiResult> getMahasiswi();

    @GET("mahasiswi/{id}")
    Call<MahasiswiResult> getMahasiswi (@Path("id") int id);

    @POST("mahasiswi")
    Call<String> setMahasiswi (@Body Mahasiswa mahasiswa);

    //put nanti

    @DELETE("mahasiswi/{id}")
    Call<String> hapusMahasiswa(@Path("id") int id);

    Call<MahasiswiResult> getMahasiswa();
}
