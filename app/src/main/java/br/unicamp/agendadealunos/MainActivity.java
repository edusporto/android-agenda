package br.unicamp.agendadealunos;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAlunos;
    FloatingActionButton fabAdicionarAluno;
    ArrayList<Aluno> alunos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAlunos = findViewById(R.id.lvAlunos);

        alunos = new ArrayList<>();

        ListaAlunosAdapter alunosAdapter = new ListaAlunosAdapter(this, alunos);
        lvAlunos.setAdapter(alunosAdapter);

        fabAdicionarAluno = findViewById(R.id.fabAdicionarAluno);
        fabAdicionarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAdicionarAlunos = new Intent(MainActivity.this, AdicionarAlunosActivity.class);
                startActivityForResult(intentAdicionarAlunos, 1);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        //  nao e necessario settar o adapter de novo, pois a MainActivity quando
        // volta ao foco atualiza o lvAlunos sozinha.

        //ListaAlunosAdapter alunosAdapter = new ListaAlunosAdapter(this, alunos);
        //lvAlunos.setAdapter(alunosAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                Aluno novoAluno = new Aluno();
                novoAluno.setNome(data.getStringExtra("nome"));
                novoAluno.setTelefone(data.getStringExtra("telefone"));
                novoAluno.setEmail(data.getStringExtra("email"));

                alunos.add(novoAluno);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "O aluno não foi adicionado.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
