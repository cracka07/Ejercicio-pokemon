
package logica;

public class Poke {
    public static void main(String[] args) {
        Squirtle squirtle=new Squirtle();
        Charmander charmander=new Charmander();
        Bulbasaur bulba=new Bulbasaur();
        Pikachu pika=new Pikachu();
        
        
        squirtle.atacarBurbuja();
        charmander.atacarMordisco();
        bulba.atacarParalizar();
        pika.atacarAraniazo();
    }
}
