/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endgame;

/**
 *
 * @author josed
 */
public class EndGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("Black Panter grrr", "Ser el rey de todo Wakanda", "Garras de Vibranium");
        Villano galactus=new Villano("Galactus", "Devorar mundos", "usa de chalán a Silver Sufer");
        Avenger ironMan=new Avenger("Tony Stark", "Genio, Filantropo, multimillonario, playboy", "Mark 42", "Prime");
        Thanos thanos=new Thanos("Thanos", "El titán loco", "Ejercito Chitaury", "Guantelete del infinito");
        
        //Aplicando Polimorfismo
        
        Personaje[]personajes={blackPanter, galactus, ironMan, thanos};
        for(Personaje personaje:personajes){
            personaje.atacar();
        }
        
        //Método especifico de avenger
        ((Avenger)ironMan).reunirse();
        
        //Ejemplo método especifico de thanos
        thanos.chasquearDedos();
     
    }
    
}
