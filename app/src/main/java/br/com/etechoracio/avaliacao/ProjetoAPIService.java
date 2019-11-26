package br.com.etechoracio.avaliacao;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProjetoAPIService {
    @GET(".")
    Call<String> Projeto (@Query("Num1") String Num1,@Query("Num2") String Num2);

}
