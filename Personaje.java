package com.mycompany.endgame;

public class Personaje {
  protected String nombre;
  protected String poder;

public Personaje(String nombre , String poder){
  this.nombre=nombre;
  this.poder=poder;
}  

public void atacar(){
  //metodo vacio porque sera sobre escrito
}
}
