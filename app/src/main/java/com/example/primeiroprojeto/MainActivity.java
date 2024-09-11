package com.example.primeiroprojeto;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
//    MainActivity é o controller e o view é o xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
//        setContentView chama o layout activity_main na classe Resource 'R'
//        A classe R cria instancias de componentes da tela
//        Só se pode programar abaixo do setContentView();
        setContentView(R.layout.activity_main);

        Button btnSave = findViewById(R.id.somaNumeros);
        Button btnRemove = findViewById(R.id.subtraiNumeros);

        btnRemove.setOnClickListener(v -> {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Atenção");
            alert.setMessage("Deseja remover esse registro?");
            alert.setIcon(R.mipmap.ic_launcher);
            alert.setNegativeButton("Não", null);
            alert.setPositiveButton("Sim", (dialog, which) -> {
                Toast.makeText(this, "Removeu!!!", Toast.LENGTH_SHORT).show();
            });
            alert.show();
        });
        btnSave.setOnClickListener(v -> {
            Toast.makeText(this, "Salvou!!!", Toast.LENGTH_SHORT).show();
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}