package br.unicamp.agendadealunos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaAlunosAdapter extends ArrayAdapter<Aluno> {
    private Context context;
    private ArrayList<Aluno> alunos = null;

    public ListaAlunosAdapter(Context context, ArrayList<Aluno> alunos) {
        super(context, 0, alunos);
        this.alunos  = alunos;
        this.context = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Aluno aluno = alunos.get(position);

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.itens_lista_alunos, null);
        }

        TextView txtNomeAluno  = view.findViewById(R.id.txtNomeAluno);
        TextView txtTelefone   = view.findViewById(R.id.txtTelefoneAluno);
        TextView txtEmailAluno = view.findViewById(R.id.txtEmailAluno);

        txtNomeAluno.setText(aluno.getNome());
        txtTelefone.setText(aluno.getTelefone());
        txtEmailAluno.setText(aluno.getEmail());

        return view;
    }

}
