package br.unicamp.agendadealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAlunos = findViewById(R.id.lvAlunos);

        final ListaAlunosAdapter alunosAdapter = new ListaAlunosAdapter(this, gerarAlunos());
        lvAlunos.setAdapter(alunosAdapter);
    }

    private ArrayList<Aluno> gerarAlunos()
    {
        ArrayList<Aluno> ret = new ArrayList<>();

        ret.add(new Aluno("Jorge", "19999999", "jorge@jorge.jorge"));
        ret.add(new Aluno("Roberto Santos", "19999998", "robertosantos@jorge.jorge"));
        ret.add(new Aluno("Jorge", "19999999", "jorge@jorge.jorge"));
        ret.add(new Aluno("Roberto Santos", "19999998", "robertosantos@jorge.jorge"));
        ret.add(new Aluno("Jorge", "19999999", "jorge@jorge.jorge"));
        ret.add(new Aluno("Roberto Santos", "19999998", "robertosantos@jorge.jorge"));
        ret.add(new Aluno("Jorge", "19999999", "jorge@jorge.jorge"));
        ret.add(new Aluno("Roberto Santos", "19999998", "robertosantos@jorge.jorge"));
        ret.add(new Aluno("Jorge", "19999999", "jorge@jorge.jorge"));
        ret.add(new Aluno("Roberto Santos", "19999998", "robertosantos@jorge.jorge"));

        return ret;
    }
}
