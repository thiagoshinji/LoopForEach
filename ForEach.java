
package foreach;

import java.util.Random;

public class ForEach {

    public static void main(String[] args) {
      // Criando o array notas com 10 campos  
      int[] notas = new int[10];
      // Cria um número aleatório
      Random random = new Random();
      
      // Utilizando for
      for (int i=0; i<notas.length; i++){
          
        notas[i] = random.nextInt(9);   
      }
        System.out.println();
        
        System.out.println("Usando for each");
        System.out.println();
        
        // Utilizando for each
        for (int nota : notas){
            System.out.println(nota);
        }
        System.out.println();
        
        // Outro exemplo
        System.out.println("Exemplo com array matriz");
        System.out.println();
        double [][] notasAlunos = new double [3] [4];
        //Aluno 1:
        notasAlunos [0][0] = 10;
        notasAlunos [0][1] = 7;
        notasAlunos [0][2] = 9;
        notasAlunos [0][3] = 9.5;
        //Aluno 2:
        notasAlunos [1][0] = 9;
        notasAlunos [1][1] = 8;
        notasAlunos [1][2] = 7;
        notasAlunos [1][3] = 9;
        //Aluno 3:
        notasAlunos [2][0] = 8;
        notasAlunos [2][1] = 9;
        notasAlunos [2][2] = 10;
        notasAlunos [2][3] = 7;
        
        for (double[] notasAluno : notasAlunos){
            for (double nota : notasAluno){
                System.out.print(nota + " | ");
            }
            System.out.println();
        }
        
        /*
        // Atribuindo valores automaticamente ao array
        int [] notas = new int[10];
        
        for (int i=0; i<notas.length; i++){
          
            notas[i] = i + 1;
            System.out.println("A nota " + (i+1) + " is: " + notas[i]);
          } */
    }
}
