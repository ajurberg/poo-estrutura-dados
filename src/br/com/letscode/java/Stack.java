package br.com.letscode.java;

public class Stack implements EstruturaDados {

    private int capacidade = 1;
    private int topo;
    private Pessoa[] pessoas = new Pessoa[this.capacidade];

    // Constructor
    public Stack(int capacidade) {
        this.capacidade = capacidade;
    }

    public int tamanho() {
        return this.capacidade;
    }

    public boolean estaVazia() {
        return (this.pessoas.length == 0);
    }

    public boolean estaCheia() {
        return (this.topo == capacidade);
    }

    @Override
    public void adicionar(Pessoa pessoa) {
        if (estaCheia()) {
            this.capacidade++;
        } else {
            // Adiciona pessoa no topo da pilha
            int topo = this.capacidade - 1;
            this.pessoas[topo] = pessoa;
            this.capacidade++;
            var temp = new Pessoa[this.capacidade];
            for (int i = 0; i < pessoas.length; i++) {
                temp[i] = this.pessoas[i];
            }
            this.pessoas = temp;
        }
        System.out.println(pessoa + " entrou no topo da pilha.");
    }

    @Override
    public void buscar(String nome) {
        if (!estaVazia()) {
            for (Pessoa p : this.pessoas) {
                if (p.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(nome + " está na pilha.");
                    break;
                } else {
                    System.out.println(nome + " não foi encontrado.");
                    break;
                }
            }
        }
    }

    @Override
    public void remover() {
        if (!estaVazia()) {
            this.capacidade--;
            int topo = this.capacidade - 1;
            var temp = new Pessoa[this.capacidade];
            for (int i = 0; i < temp.length; i++) {
                if (i != topo) {
                    temp[i] = this.pessoas[i];
                }
            }
            System.out.println(pessoas[this.pessoas.length-2] + " foi removido do topo da pilha.");
            this.pessoas = temp;
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        if (!estaVazia()) {
            // Remove pessoa se ela for a pessoa no topo da pilha
            this.capacidade--;
            int topo = this.capacidade - 1;
            if (this.pessoas[topo].equals(pessoa)) {
                this.capacidade++; // Sei que não ficou legal, mas funcionou
                this.remover();
            } else {
                System.out.println("Não é possível remover a pessoa indicada da pilha.");
            }
        }
    }

    @Override
    public void remover(int indice) {
        if (!estaVazia()) {
            // Remove pessoa se ela o seu índice for o último da pilha
            this.capacidade--;
            int topo = this.capacidade - 1;
            if (indice == topo) {
                this.capacidade++; // Sei que não ficou legal, mas funcionou
                this.remover();
            } else {
                System.out.println("Não é possível remover a pessoa nessa posição da pilha.");
            }
        }
    }

    @Override
    public void listarTodos() {
        if (!estaVazia()) {
            System.out.println("-".repeat(60));
            System.out.println("Os integrantes da pilha são: ");
            for (Pessoa p : this.pessoas) {
                System.out.println(p);
            }
            System.out.println("-".repeat(60));
        } else {
            System.out.println("A pilha está vazia. ");
        }
    }

    @Override
    public Pessoa getPessoa(int indice) {
        if (!estaVazia()) {
            System.out.println("-".repeat(60));
            System.out.println(this.pessoas[indice] + " foi encontrado.");
        }
        return this.pessoas[indice];
    }

}
