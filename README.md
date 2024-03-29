# strings04Java
#### Exercício para faculdade lidando com a classe String e seus métodos em JAVA

#### Enunciado:

Um algoritmo genético é técnica de inteligência artificial que se inspira na forma como a  natureza funciona e na teoria da evolução para resolver problemas complexos. Os  algoritmos genéticos funcionando mantendo uma população de estruturas que evoluem  de forma semelhante à evolução das espécies. A recombinação e a mutação são os operadores básicos de um algoritmo genético. Considerando que os indivíduos da população são codificados através de strings, o  operador de recombinação recebe duas strings S1 e S2, sorteia aleatoriamente um ponto  de corte em S1 e S2. Em seguida, realizada a troca de informações genéticas de S1 e S2, de  forma a gerar dois novos indivíduos filhos. A figura abaixo ilustra o processo de  recombinação.

![](https://i.imgur.com/IC5X4Ma.png)

 O operador de mutação consiste em sortear aleatoriamente uma posição em um dos  indivíduos filhos, e então modificar aleatoriamente o conteúdo daquela posição. A figura  abaixo ilustra o processo de mutação.

![](https://i.imgur.com/ojWb6B7.png)

 Construa um programa em Java que implemente e utilize os métodos recombinacao e  mutacao:

  1 - o metodo recombinação recebe duas Strings e retorna um Array com 2 Strings sendo s0 e s1 os filhos recombinados.
  2 - o metodo mutacao recebe uma string e retorna uma string com a a string mutada.

  Requisitos:
  - Crie uma classe chamada CadeiaDeDna com um método gerarCadeiaDeDna(int tamanho) que gera uma cadeia de DNA aleatório com o tamanho fornecido.
  - Crie uma Classe chamada AlgoritmosGeneticos com os métodos recombinacao e mutacao;


  - Crie uma classe com um método main que deverá perguntar ao usuário o tamanho das cadeias de dna a serem geradas;
  - Chame os métodos recombinacao e mutacao e imprima o resultado segundo o exemplo abaixo:
  
  ![](https://i.imgur.com/b3Sk8HK.png)

  #### OBS - Considere as seguintes proteínas para compor cadeias de DNA: A,C,G T. 
