package br.unicamp.agendadealunos;

public class Aluno
{
    protected String nome;
    protected String telefone;
    protected String email;

    public Aluno() {
        this.nome = null;
        this.telefone = null;
        this.email = null;
    }

    public Aluno (String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
