package com.example.primeiroprojeto;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ac1Parte1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ac1_parte1);

        RadioGroup opcoesPerguntaUm, opcoesPerguntaDois, opcoesPerguntaTres;
        int respostaCorretaUm, respostaCorretaDois, respostaCorretaTres;

        opcoesPerguntaUm = findViewById(R.id.opcoesp1);
        respostaCorretaUm = R.id.p1resp2;
        respostaCorretaDois = R.id.p2resp4;
        respostaCorretaTres = R.id.p3resp3;

        opcoesPerguntaDois = findViewById(R.id.opcoesp2);
        opcoesPerguntaTres = findViewById(R.id.opcoesp3);

        Button btnFimDeJogo = findViewById(R.id.btnFimDeJogo);

        btnFimDeJogo.setOnClickListener(a -> {
            int totalAcertos = 0;
            if (opcoesPerguntaUm.getCheckedRadioButtonId() == respostaCorretaUm) {
                totalAcertos++;
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Pergunta 1 respondida corretamente");
                alert.setMessage("Muito bem");
                alert.show();
            } else {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Pergunta 1 respondida incorretamente");
                alert.setMessage("A resposta correta é a 'B'");
                alert.show();
            }

            if (opcoesPerguntaDois.getCheckedRadioButtonId() == respostaCorretaDois) {
                totalAcertos++;
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Pergunta 2 respondida corretamente");
                alert.setMessage("Muito bem");
                alert.show();
            } else {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Pergunta 2 respondida incorretamente");
                alert.setMessage("A resposta correta é a 'D'");
                alert.show();
            }

            if (opcoesPerguntaTres.getCheckedRadioButtonId() == respostaCorretaTres) {
                totalAcertos++;
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Pergunta 3 respondida corretamente");
                alert.setMessage("Muito bem");
                alert.show();
            } else {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Pergunta 3 respondida incorretamente");
                alert.setMessage("A resposta correta é a 'C'");
                alert.show();
            }

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Resultado Final");
            alert.setMessage("Você acertou " + totalAcertos + " de 3 perguntas.");
            alert.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
            alert.show();

            opcoesPerguntaUm.clearCheck();
            opcoesPerguntaDois.clearCheck();
            opcoesPerguntaTres.clearCheck();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}