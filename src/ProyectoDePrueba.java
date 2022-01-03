import entidad.Muñeco;

import java.util.Random;

public class ProyectoDePrueba {

    public static void main(String[] args) {

//        System.out.println(prueba());
        System.out.println(creacionMuñeco());

        bingo();

    }

    private static String creacionMuñeco(){

        // Creamos la entidad Muñeco
        Muñeco muñeco = new Muñeco();

        // Añadimos los valores
        muñeco.setBrazos("Me han amputado un brazo");
        muñeco.setPiernas("No tengo piernas, gracias Paula");
        muñeco.setCabeza("");
        muñeco.setVivo(true);

        // Comprobamos si el muñeco está vivo con un variable true o false
        if(muñeco.isVivo())
            // Si está vivo mostrará este texto
            return "Cuidado está poseído";
        else
            // Si no lo está, esto
            return "Es un muñeco normal";

    }

    private static void bingo() {
        Random r = new Random();

        int vueltas = 50;

        int casilla[] = {27, 22, 18};

        for (int i = 0; i < vueltas; i++) {

            /*TODO Falta cantar bingo, descartar números que salgan, hacer el tablero, cantar línea, añadir valores al
            ** tablero aleatoriamente
            */

            int valor = r.nextInt(50)+1;

            System.out.println("La bola tiene el valor:" + valor);

            if(casilla[0] == valor)
                System.out.println("Tengo ese número");
            else if(casilla[1] == valor)
                System.out.println("Tengo ese número");
            else if(casilla[2] == valor)
                System.out.println("Tengo ese número");
            else
                System.out.println("No ha tocado");

        }
    }
}
