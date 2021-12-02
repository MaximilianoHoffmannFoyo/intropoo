
package daw.poo;

public class PruebaCancion {

    public static void main(String[] args) {
        Cancion song1 = new Cancion();
        Cancion song2 = new Cancion("Paris", "Cyclo");
        
        System.out.println(song1.getAutor());
        song1.setAutor("PiterG");
        System.out.println(song1.getAutor());
        
        System.out.println(song2.getAutor());
        song2.setAutor("Brock");
        System.out.println(song2.getAutor());
        
        System.out.println(song1.toString());
        System.out.println(song2.toString());
        
    }
    
}
