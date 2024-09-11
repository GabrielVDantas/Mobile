package com.example.primeiroprojeto;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Aula3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_aula3);
        Spinner sCidade = findViewById(R.id.spinnerCity);
        AutoCompleteTextView acUf = findViewById(R.id.completeUf);
        carregaUf(acUf);
        carregaCidade(sCidade);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void carregaUf(AutoCompleteTextView completeUf) {
        // Acessa a pasta res e busca o array de strings com base no nome
        String[] ufs = getResources().getStringArray(R.array.uf_array);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ufs);
        completeUf.setAdapter(adapter);
    }

    private void carregaCidade(Spinner spinnerCity) {
        // Acessa a pasta res e busca o array de strings com base no nome
        String[] cidades = getResources().getStringArray(R.array.cidades_array);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cidades);
        spinnerCity.setAdapter(adapter);
    }
}