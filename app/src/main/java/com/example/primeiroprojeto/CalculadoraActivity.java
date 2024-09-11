package com.example.primeiroprojeto;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);

        EditText num1 = findViewById(R.id.number1);
        EditText num2 = findViewById(R.id.number2);

        EditText result = findViewById(R.id.result);
        Button somar = findViewById(R.id.somaNumeros);

        Double v1 = Double.parseDouble(num1.getText().toString());
        Double v2 = Double.parseDouble(num2.getText().toString());

        somar.setOnClickListener(v -> {
            Double resultAsDouble = v1 + v2;
            result.setText(String.valueOf(resultAsDouble));
        });
        Button sub = findViewById(R.id.subtraiNumeros);
        sub.setOnClickListener(v -> {
            Double resultAsDouble = v1 - v2;
            result.setText(String.valueOf(resultAsDouble));
        });
        Button limpa = findViewById(R.id.limpar);
        limpa.setOnClickListener(v -> {
            num1.setText(null);
            num2.setText(null);
            result.setText(null);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}