package br.com.letscode.java;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        // 1- demonstração LinkedList
//        System.out.println(">>> DEMONSTRAÇÃO COM LINKED LIST <<<");
//        main.demo(new LinkedList());
        // 2- Demonstração de Queue:
//        System.out.println(">>> DEMONSTRAÇÃO COM QUEUE <<<");
//        main.demo(new Queue(5));
        // 3- Demonstração de Stack:
//        System.out.println(">>> DEMONSTRAÇÃO COM STACK <<<");
//        main.demo(new Stack(1));
        // 4- Demonstração de SelectionSort:
//        System.out.println(">>> DEMONSTRAÇÃO COM SELECTION SORT <<<");
//        SelectionSort demo = new SelectionSort();
//        long start = System.currentTimeMillis();
//        demo.ordenar();
//        demo.visualizarArray();
//        long elapsedTime = System.currentTimeMillis() - start;
//        System.out.println("Tempo decorrido: " + elapsedTime/1000F + " segundos");
        // 5- Demonstração de SelectionSort:
//        System.out.println(">>> DEMONSTRAÇÃO COM BUBBLE SORT <<<");
//        BubbleSort demo = new BubbleSort();
//        long start = System.currentTimeMillis();
//        demo.ordenar();
//        demo.visualizarArray();
//        long elapsedTime = System.currentTimeMillis() - start;
//        System.out.println("Tempo decorrido: " + elapsedTime/1000F + " segundos");
        // 6- Demonstração de MergeSort:
        System.out.println(">>> DEMONSTRAÇÃO COM MERGE SORT <<<");
        MergeSort demo = new MergeSort();
        long start = System.currentTimeMillis();
        demo.ordenar(demo.array, 0, demo.array.length-1);
        demo.visualizarArray();
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Tempo decorrido: " + elapsedTime/1000F + " segundos");

    }

    private void demo(EstruturaDados estruturaDados){
        var pessoa1 = new Pessoa("Arnon", "arnon@mail.com", LocalDate.of(1984, 6, 19));
        var pessoa2 = new Pessoa("Maria", "maria@mail.com", LocalDate.of(1985, 2, 8));
        var pessoa3 = new Pessoa("Bruno", "bruno@mail.com", LocalDate.of(1985, 7, 4));
        var pessoa4 = new Pessoa("Zé", "ze@mail.com", LocalDate.of(1982, 1, 13));
        var pessoa5 = new Pessoa("Ana", "ana@mail.com", LocalDate.of(1990, 1, 11));

        estruturaDados.adicionar(pessoa1);
        estruturaDados.adicionar(pessoa2);
        estruturaDados.adicionar(pessoa3);
        estruturaDados.adicionar(pessoa4);
        estruturaDados.adicionar(pessoa5);

//        estruturaDados.buscar("Arnon");
//        estruturaDados.getPessoa(0);
//        estruturaDados.listarTodos();

//        estruturaDados.remover(4);
//        estruturaDados.listarTodos();

    }
}
