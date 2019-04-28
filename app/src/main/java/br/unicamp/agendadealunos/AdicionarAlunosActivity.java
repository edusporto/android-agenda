package br.unicamp.agendadealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdicionarAlunosActivity extends AppCompatActivity {

    EditText edNome;
    EditText edTelefone;
    EditText edEmail;
    Button btnAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_alunos);

        edNome = findViewById(R.id.edNome);
        edTelefone = findViewById(R.id.edTelefone);
        edEmail = findViewById(R.id.edEmail);

        btnAdicionar = findViewById(R.id.btnAdicionar);
        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edNome.getText().toString().isEmpty() ||
                    edTelefone.getText().toString().isEmpty() ||
                    edEmail.getText().toString().isEmpty())
                {
                    Toast.makeText(AdicionarAlunosActivity.this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();

                    return;
                }

                Intent returnIntent = getIntent();
                returnIntent.putExtra("nome", edNome.getText().toString());
                returnIntent.putExtra("telefone", edTelefone.getText().toString());
                returnIntent.putExtra("email", edEmail.getText().toString());
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
