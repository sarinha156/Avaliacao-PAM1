package br.com.etechoracio.avaliacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.Query;

public class MainActivity extends AppCompatActivity {
    EditText editNum1;
    EditText editNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);

        this.service = new Retrofit.Builder().baseUrl("http://172.16.58.22:8001/api/funcoes/adicao")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(ProjetoAPIService.class);
    }

    private ProjetoAPIService service;

    public void onProcessar(View v) {
        String Num1 = (editNum1.getText().toString());
        String Num2 = (editNum2.getText().toString());
        Call<String> Projeto (@Query("Num1") String Num1,@Query("Num2") String Num2);
    }
}
