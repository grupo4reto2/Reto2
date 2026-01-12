package RETO2;
import java.util.Scanner;
import java.time.LocalDateTime;

public class borrador {
	
	private static void mensajeBienvenida () {

		String negrita = "\033[1m";

		System.out.println("_______________________________ ");

		System.out.println(negrita + "\nBIENVENIDO A \"NOMBRE DEL CINE\" |");

		System.out.println("_______________________________|");

		

		System.out.println("\n Haga click para iniciar");
		
		

	}
	
	private 

    enum opcionesPelicula {
        Pulp_Fiction, Kung_Fu_Panda, IT
    }

    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	
    	Pelicula PulpFiction = new Pelicula(4549, 154, "Crimen/thriller/comedia negra", 7.50);
    	Pelicula KungFuPanda = new Pelicula(4570,92, "Infantil/comedia", 10.50);
    	Pelicula IT = new Pelicula(4578, 135, "Horror/suspense", 10.50);
    	
    	
    	Sala salaPulpFiction = new Sala("Sala 4", 343);
    	Sala salaKungFuPanda = new Sala("Sala 2", 321);
    	Sala salaIT = new Sala("Sala 1", 314);
    	
    	Sesion sesionPulpFiction = new Sesion(7877,LocalDateTime.of(2026,2,1,13,00,0), LocalDateTime.of(2026,2,1,15,30,0), salaPulpFiction, 7.50, "Pulp Fiction");
    	Sesion sesionKungFuPanda = new Sesion(7656,LocalDateTime.of(2026,2,1,18,00,0), LocalDateTime.of(2026,2,1,19,30,0), salaKungFuPanda, 10.50, "Kung Fu Panda");
    	Sesion sesionIT = new Sesion(7754,LocalDateTime.of(2026,2,1,18,30,0), LocalDateTime.of(2026,2,1,20,45,0), salaIT, 10.50, "IT");
    	
    	
    	mensajeBienvenida();
    	teclado.nextLine();
    	
    	System.out.println("Cartelera:");
    	System.out.println("\n 1. - Pulp Fiction");
    	System.out.println("\n 2. - Kung Fu Panda");
    	System.out.println("\n 3. - IT");

    	int opcion = teclado.nextInt();
    	
    	opcionesPelicula()
    	
    }
}
