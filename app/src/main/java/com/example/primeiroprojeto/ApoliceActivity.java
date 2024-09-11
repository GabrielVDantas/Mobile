package com.example.primeiroprojeto;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ApoliceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_apolice);

        Apolice apolice = new Apolice();

        EditText inputNome = findViewById(R.id.apNomeInput);
        EditText inputNumero = findViewById(R.id.apNumeroInput);
        EditText inputIdade = findViewById(R.id.apIdadeInput);

        RadioGroup radioSexoGroup = findViewById(R.id.apSexoRadioGroup);

        EditText inputValorAutomovel = findViewById(R.id.apValorAutomovelInput);

        Button btnCalculaApolice = findViewById(R.id.btnCalculaApolice);
        EditText apResultado = findViewById(R.id.apResultado);

        Integer apNum = Integer.parseInt(String.valueOf(inputNumero.getText()));
        Integer idade = Integer.parseInt(String.valueOf(inputIdade.getText()));
        Double valorAutomovel = Double.parseDouble(String.valueOf(inputValorAutomovel.getText()));

        String sexo = radioSexoGroup.getCheckedRadioButtonId() == R.id.apRadioF ? "F" : "M";


        btnCalculaApolice.setOnClickListener(c -> {
            Double calculoApolice = apolice.calculaValor(sexo, idade, valorAutomovel);
            apResultado.setText(String.valueOf(calculoApolice));
        });
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}