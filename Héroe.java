package com.mycompany.endgame;

public class Heroe extends Personaje {
   protected String arma;
   
   public Heroe(String nombre, String poder,String arma){
   super(nombre,poder);
   this.arma=arma;
}
   @Override
   public void atacar(){
     System.out.println(nombre +  "  realiza ataque con el arma: " + arma);
   }
}
