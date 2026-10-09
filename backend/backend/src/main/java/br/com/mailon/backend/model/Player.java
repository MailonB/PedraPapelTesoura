 package br.com.mailon.backend.model;

import java.util.Random;

public class Player {
    private String nome; 
    private int pontos;
    Player(String nome){
        this.nome = nome;
        this.pontos = 0;
    }
    Player(){
      this.pontos = 0;
      this.nome = "";
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Mao jogar(){
        Mao[] opcoes = Mao.values();
        return opcoes[new Random().nextInt(opcoes.length)];
    } 

  public void atualizarPontos (){
  this.pontos +=1;
  }

  public int getPontos() {
  return this.pontos;
  }
}


