package br.com.mailon.backend.model;
import java.util.Scanner;
public class Jogar {

    private Mao mao1;
    private Mao mao2;
    private boolean temVencedor;
    private Player player;
    private Player playerCPU2 = new Player();
    private String resultado;
   Scanner scanner = new Scanner(System.in); 
    Jogar(Player player){
        this.player = player;
        if (player.getNome().equals("")){
            player.setNome("CPU1");
            playerCPU2.setNome("CPU2");
        }
        else{
             playerCPU2.setNome("CPU");
        }
    }

    public void jogarCPU() {

      temVencedor = false;
      while (!temVencedor) {

                              if (player.getNome().equals("CPU1")){
        mao1 = player.jogar();
         }else{
             pedeJogada();
         }
        mao2 =  playerCPU2.jogar();
        System.out.println(player.getNome() + " Jogou: " + mao1);
        System.out.println(playerCPU2.getNome() + " Jogou: " + mao2);

        verificaJogada();
        verificaVencedor();
      }
     
    }

    public void pedeJogada(){

      
       System.out.println( "Jogue sua Mão");
       System.out.println( "1 → PEDRA");
       System.out.println( "2 → PAPEL");
       System.out.println( "3 → TESOURA");


       int resposta = scanner.nextInt();

      switch(resposta){
        case 1:
          mao1 = Mao.PEDRA;
        break;
        case 2:
          mao1 = Mao.PAPEL;
        break;
        case 3: 
          mao1 = Mao.TESOURA;
        break;
        default: 
        System.out.println( "Opção inválida!");
        break;
      }
       
       if (mao1 == null){
       pedeJogada();
       }
    }

     public void  verificaJogada(){
// dava para fazer um case
        resultado = "";
        
        if (mao1.equals(mao2)){

          System.out.println("Empate");

        }
        else if (mao1.equals(Mao.PEDRA) && mao2.equals(Mao.TESOURA)){

           System.out.println(player.getNome() + " Venceu!");
            resultado = "PLAYER";
        }
         else  if (mao1.equals(Mao.PAPEL) && mao2.equals(Mao.PEDRA)) {

              System.out.println(player.getNome() + " Venceu!");
              resultado = "PLAYER";
            }
            else if (mao1.equals(Mao.TESOURA) && mao2.equals(Mao.PAPEL)){
                 System.out.println(player.getNome() + " Venceu!");
                 resultado = "PLAYER";
            }
            else {
              System.out.println("CPU2 Venceu!");
              resultado = "CPU";
            }

            // Esse resultado tbm poderia ser um Enum
            if (resultado.equals("PLAYER")){
                  player.atualizarPontos();
            } else if (resultado.equals("CPU")){
                playerCPU2.atualizarPontos();
            }
     }

  public void    verificaVencedor(){

      if (player.getPontos() == 2){
           System.out.println( player.getNome() +" Ganhou a Partida!");
            temVencedor = true;
      } 

      if (playerCPU2.getPontos() == 2){
           System.out.println( playerCPU2.getNome() +" Ganhou a Partida!");
            temVencedor = true;
      }

     }

}
