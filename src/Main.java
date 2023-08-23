/*
    4-) Um algoritmo genético é técnica de inteligência artificial que se inspira na forma como a
    natureza funciona e na teoria da evolução para resolver problemas complexos. Os  algoritmos genéticos
    funcionando mantendo uma população de estruturas que evoluem  de forma semelhante à evolução das espécies.
     A recombinação e a mutação são os operadores básicos de um algoritmo genético.
     Considerando que os indivíduos da população são codificados através de strings, o  operador de
     recombinação recebe duas strings S1 e S2, sorteia aleatoriamente um ponto  de corte em S1 e S2.
     Em seguida, realizada a troca de informações genéticas de S1 e S2, de  forma a gerar dois novos indivíduos
     filhos. A figura abaixo ilustra o processo de  recombinação.

     <img1>

     O operador de mutação consiste em sortear aleatoriamente uma posição em um dos  indivíduos filhos, e então
     modificar aleatoriamente o conteúdo daquela posição. A figura  abaixo ilustra o processo de mutação.

     <img2>

     Construa um programa em Java que implemente e utilize os métodos recombinacao e  mutacao:

      1 - o metodo recombinação recebe duas Strings e retorna um Array com 2 Strings sendo s0 e s1 os filhos
      recombinados.
      2 - o metodo mutacao recebe uma string e retorna uma string com a a string mutada.

      Requisitos:
      - Crie uma classe chamada CadeiaDeDna com um método gerarCadeiaDeDna(int tamanho) que gera uma cadeia de DNA
      aleatório com o tamanho fornecido.
      - Crie uma Classe chamada AlgoritmosGeneticos com os métodos recombinacao e mutacao;


      -  Crie uma classe com um método main que deverá perguntar ao usuário o tamanho das cadeias de dna a serem
      geradas.
      - Chame os métodos recombinacao e mutacao e imprima o resultado segundo o exemplo;
      <img3>

      OBS - Considere as seguintes proteínas para compor cadeias de DNA.
      A,C,G T.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadeiaDeDna cadeiaDeDna = new CadeiaDeDna();
        AlgoritmosGeneticos algoritmosGeneticos = new AlgoritmosGeneticos();
        String cadeiaMutacao, cadeiaMutada, cadeia1Recombinacao, cadeia2Recombinacao;
        String[] cadeiasRecombinadas;
        int tamanho;

        System.out.print("Digite o tamanho da cadeia: ");
        tamanho = sc.nextInt();
        cadeiaMutacao = cadeiaDeDna.gerarCadeiaDeDna(tamanho);

        System.out.println("\n====================\n");

        // Recombinação
        cadeia1Recombinacao = cadeiaDeDna.gerarCadeiaDeDna(tamanho);
        cadeia2Recombinacao = cadeiaDeDna.gerarCadeiaDeDna(tamanho);
        cadeiasRecombinadas = algoritmosGeneticos.recombinacao(cadeia1Recombinacao, cadeia2Recombinacao);

        System.out.println("Fator de corte na recombinação: " + algoritmosGeneticos.getIndiceAleatorio());
        System.out.println("Resultado da recombinação:");
        System.out.println(cadeia1Recombinacao);
        System.out.println(cadeia2Recombinacao);
        for (String cadeia : cadeiasRecombinadas) {
            System.out.println(cadeia);
        }

        System.out.println("\n====================\n");

        // Mutação
        System.out.println("Resultado da mutação:");
        cadeiaMutada = algoritmosGeneticos.mutacao(cadeiaMutacao);

        System.out.println("Índice aleatório na mutação: " + algoritmosGeneticos.getIndiceAleatorio());
        System.out.println(cadeiaMutacao);
        System.out.println(cadeiaMutada);
    }
}
