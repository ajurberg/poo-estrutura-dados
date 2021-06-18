package br.com.letscode.java;

public interface EstruturaDados {

    void adicionar(Pessoa pessoa);
    void buscar(String nome);
    void remover();
    void remover(Pessoa pessoa);
    void remover(int indice);
    void listarTodos();
    Pessoa getPessoa(int indice);

}
