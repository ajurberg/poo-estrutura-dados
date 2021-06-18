package br.com.letscode.java;

public class Queue implements EstruturaDados {

    private int capacidade = 1;
    private int contador = 0;
    private Pessoa[] pessoas = new Pessoa[this.capacidade];

    // Constructor
    public Queue(int capacidade) {
        this.capacidade = capacidade;
    }

    public int tamanho() {
        return this.capacidade;
    }

    public boolean estaVazia() {
        return (this.contador == 0);
    }

    public boolean estaCheia() {
        return (this.contador == capacidade);
    }

    @Override
    public void adicionar(Pessoa pessoa) {
        if (estaCheia()) {
            capacidade++;
        } else {
            // Adiciona pessoa no final da fila
            this.pessoas[contador] = pessoa;
            this.contador++;
            var temp = new Pessoa[this.capacidade];
            for (int i=0; i < this.pessoas.length; i++) {
                temp[i] = this.pessoas[i];
            }
            this.pessoas = temp;
        }
        System.out.println(pessoa + " entrou na fila. A capacidade da fila é " + contador + "/" + capacidade);
    }

    @Override
    public void buscar(String nome) {
        if (!estaVazia()) {
            for (Pessoa p : this.pessoas) {
                if (p.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(nome + " está na fila.");
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
            System.out.println(pessoas[0].getNome() + " saiu da fila.");
            var temp = new Pessoa[this.capacidade];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = this.pessoas[i+1];
            }
            this.pessoas = temp;
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        if (!estaVazia()) {
            // Remove pessoa se ela for a primeira pessoa da fila
            if (pessoas[0].equals(pessoa)) {
                this.remover();
            } else {
                System.out.println("Apenas a primeira pessoa da fila pode ser removida");
            }
        }
    }

    @Override
    public void remover(int indice) {
        if (indice != 0) {
            System.out.println("Não é possível remover a pessoa nessa posição");
        } else {
            this.remover();
        }
    }

    @Override
    public void listarTodos() {
        if (!estaVazia()) {
            System.out.println("-".repeat(60));
            System.out.println("Os integrantes da fila são: ");
            for (Pessoa p : this.pessoas) {
                System.out.println(p);
            }
            System.out.println("-".repeat(60));
        } else {
            System.out.println("A fila está vazia. ");
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