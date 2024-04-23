package Main;

import Model.Produto;

import java.util.*;
//"Map" é um import do java, ele é um algoritimo/interface que vc atribui uma chave a uma determinado valor
//Ex: ||  MapExemplo.put(1, "aaa"); || Então o numero 1 é a chave para acessar o valor "aaa" sendo assim || System.out.println(MapExemplo.get(1)); || imprime o valor "aaa"


public class Mercado {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Produto> produtos; //Produdo da package "Model"
    private static Map <Produto, Integer> carrinho; //nessa situação o produto é a chave

    public static void main(String[] args) {
        produtos = new ArrayList<>();
        carrinho = new HashMap<>(); //HashMap é a classe que implementa o Map
        menu();
    }


    private static void menu () {
    try {
        System.out.println("____________________________________________");
        System.out.println("          Bem Vindos ao ArturMaket          ");
        System.out.println("--------------------------------------------");
        System.out.println("         Digite a opção que deseja          ");
        System.out.println("____________________________________________");
        System.out.println("|  Opção 1 - Cadastrar      |");
        System.out.println("|  Opção 2 - Listar         |");
        System.out.println("|  Opção 3 - Comprar        |");
        System.out.println("|  Opção 4 - Carrinho       |");
        System.out.println("|  Opção 5 - Sair           |");
        int option = sc.nextInt();
        }
    catch(InputMismatchException e){
        System.out.println("Não Digite Letras, apenas números!");
        }
    }


}
