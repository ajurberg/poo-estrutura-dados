package br.com.letscode.java;

public class LinkedList implements EstruturaDados {

    private Node head;

    private class Node {
        private Pessoa data;
        private Node next;

        public Node(Pessoa pessoa){
            this.data = pessoa;
        }

        // Getters and Setters
        public Pessoa getData() { return data; }
        //public void setData(Pessoa data) { this.data = data; }
        public Node getNext() { return next; }
        public void setNext(Node next) { this.next = next; }
    }

    public void adicionarInicio(Pessoa pessoa) {
        Node node = new Node(pessoa);
        if(this.head != null) {
            node.setNext(this.head);
        }
        this.head = node; // node = new Node(pessoa);
        System.out.println(node.getData() + " foi adicionado no início da lista.");
    }

    public void adicionarFim(Pessoa pessoa) {
        Node node = this.head;
        Node newNode = new Node(pessoa);
        if (this.head == null) {
            this.head = newNode;
            this.head.setNext(null);
        } else {
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(newNode);
        }
        System.out.println(newNode.getData() + " foi adicionado no final da lista.");
    }

    public void removerPorNome(String nome){
        Node node = this.head;
        Node previous = null;
        while (node != null) {
            if (node.getData().getNome().equals(nome)) {
                if (previous == null) {
                    this.head = node.getNext();
                } else {
                    previous.setNext(node.getNext());
                }
                break;
            }
            previous = node;
            node = node.getNext();
        }
        System.out.println(node.getData().getNome() + " foi removido da lista.");
    }

    @Override
    public void adicionar(Pessoa pessoa) {
        Node node = new Node(pessoa);
        if(this.head == null ){ // 1- verifica se o head está vazio e adiona o node no head
            this.head = node;
        } else if (this.head.getNext() == null) { // 2- verifica se o node próximo ao head está vazio e adiciona no node
            this.head.setNext(node);
        } else { // 3- Se o head e o next não estão vazios
            // A - B - C
            // A - x - B - C
            node.setNext(this.head.getNext()); // node = x
            this.head.setNext(node); // o novo next do head é o novo node
        }
        System.out.println(node.getData() + " foi adicionado.");
    }

    @Override
    public void buscar(String nome) {
        Node node = this.head;
        while (node != null) {
            Pessoa pessoa = node.getData();
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println(pessoa + " foi encontrado na lista.");
            }
        node = node.getNext();
        }
    }

    @Override
    public void remover() {
        System.out.println("É necessário indicar o nó. Por favor, utilize outro método.");
    }

    @Override
    public void remover(Pessoa pessoa) {
        Node node = this.head;
        Node previous = null;
        while (node != null) {
            if (node.getData().equals(pessoa)) {
                if (previous == null) {
                    this.head = node.getNext();
                } else {
                    previous.setNext(node.getNext());
                }
                break;
            }
            previous = node;
            node = node.getNext();
        }
        System.out.println(node.getData() + " foi removido da lista.");
    }

    @Override
    public void remover(int indice) {
        Pessoa pessoa = this.getPessoa(indice);
        this.remover(pessoa);
    }

    @Override
    public void listarTodos() {
        Node node = this.head;
        System.out.println("-".repeat(60));
        System.out.println("Os integrantes da lista são: ");
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
        System.out.println("-".repeat(60));
    }

    @Override
    public Pessoa getPessoa(int indice){
        int count = 0;
        Node node = this.head;
        while (node != null) {
            if (count++ == indice) {
                return node.getData();
            }
            node = node.getNext();
        }
        return null;
    }

}
