import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in); 
      System.out.println("PEDRA - PAPEL - TESOURA");
      System.out.println("*****************************************");

       System.out.println("1 - CPU x CPU");
       System.out.println("2 - Jogador x CPU");
      Player player = new Player();
       int escolha = scanner.nextInt();

        if (escolha == 1) {
           Jogar jogo = new Jogar(player);
            jogo.jogarCPU();
        } else{

           System.out.println("Digite seu nome");
           String nome = scanner.next();
           player.setNome(nome);

          Jogar jogo = new Jogar(player);
           jogo.jogarCPU();
        }

    }
}