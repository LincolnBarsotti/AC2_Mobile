package com.example.ac2_mobileapi.api;

import com.example.ac2_mobileapi.services.AlunoService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AlunoApi {
    private static final String BASE_URL = "https://672ab8cf976a834dd0242f91.mockapi.io/";
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit == null) retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }

    public static AlunoService getAlunoService() {
        return getClient().create(AlunoService.class);
    }
}
