![Deploy badge](https://github.com/alvarocgm/gcst1/actions/workflows/codeql.yml/badge.svg)
![Deploy badge](https://github.com/alvarocgm/gcst1/actions/workflows/maven.yml/badge.svg)

# Trabalho 1 Gerenciamento e Configuração de Software
Alunos: Álvaro Machado e Pedro Soares

Problema: https://www.beecrowd.com.br/judge/en/problems/view/1099

Sum of Consecutive Odd Numbers II


Read an integer N that is the number of test cases. Each test case is a line containing two integer numbers X and Y. Print the sum of all odd values between them, not including X and Y.

Input
The first line of input is an integer N that is the number of test cases that follow. Each test case is a line containing two integer X and Y.

Output
Print the sum of all odd numbers between X and Y.

<p>Input Sample	
<p>7
<p>4 5
<p>13 10
<p>6 4
<p>3 3
<p>3 5
<p>3 4
<p>3 8
<p>Output Sample
<p>0
<p>11
<p>5
<p>0
<p>0
<p>0
<p>12
  
Para clonar o repositório com os testes e fazendo o programa rodar automaticamente: (dessa forma o N escolhido como mostrado acima é 7 e segue também os imputs e os resultados que vão ocorrer, para fazer manualmente escolhendo outros valores olhar mais abaixo)
<p>git clone -b bee --single-branch https://github.com/alvarocgm/gcst1.git
 <p> e os seguintes comandos:
   <p>// muda para o diretorio criado
  <p>cd gcst1
 
// faz os testes também
<p>mvn package
  
// roda o programa
<p>java -cp target\GCSTrab1Bee-1.0-BeeCrowd.jar T1.MainApp
  
<p>
  ------------
 <p> (MANUALMENTE)
<p>Para fazer o programa rodar manualmente:
<p>Para clonar o repositório:
<p>git clone https://github.com/pds-pucrs/GCS-Trab1.git
 <p> e os seguintes comandos:
   <p>// Entrando no diretorio
  <p>cd GCS-Trab1
    <p> // compilando/fazendo testes e criando o arquivo.jar
<p>mvn package
  <p> // executando o programa via o .jar
<p>java -cp target\my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
 
<p> Depois disso o primeiro digito na primeira linha a ser digitado vai ser quantas vezes o programa vai rodar.
  Depois de digitar e dar enter no primeiro número, é necessário digitar os 2 numeros inteiros que vão somar todos os impares entre eles, por tantas vezes que foi digitado durante o início do programa.
