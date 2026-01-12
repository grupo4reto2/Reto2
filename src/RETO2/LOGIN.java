package RETO2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class LOGIN {

    // ENUM para la elección del usuario
    enum OpcionPelicula {
        HULK, HANDIA, VIDA_DE_BRIAN
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- CREACIÓN DE OBJETOS ----------

        // Películas
        Pelicula hulk = new Pelicula(1, 120, "Acción", 7.50);
        Pelicula handia = new Pelicula(2, 130, "Drama", 8.00);
        Pelicula vidaDeBrian = new Pelicula(3, 95, "Comedia", 6.50);

        // Sala
        Sala sala = new Sala("Sala principal", 1);

        // Sesiones
        Sesion sesionHulk = new Sesion(1001, LocalDateTime.of(2026, 10, 12, 18, 0),
                LocalDateTime.of(2026, 10, 12, 20, 0), sala, hulk.getPrecio(), "Hulk");

        Sesion sesionHandia = new Sesion(1002, LocalDateTime.of(2026, 10, 12, 19, 0),
                LocalDateTime.of(2026, 10, 12, 21, 10), sala, handia.getPrecio(), "Handia");

        Sesion sesionVidaDeBrian = new Sesion(1003, LocalDateTime.of(2026, 10, 12, 20, 30),
                LocalDateTime.of(2026, 10, 12, 22, 5), sala, vidaDeBrian.getPrecio(), "La vida de Brian");

        // ---------- MOSTRAR OPCIONES AL USUARIO ----------
        System.out.println("Bienvenido al cine. Elige una película:");
        System.out.println("1 - Hulk");
        System.out.println("2 - Handia");
        System.out.println("3 - La vida de Brian");

        int opcion = sc.nextInt(); // lee la elección del usuario

        // Convertimos la opción a enum
        OpcionPelicula eleccion;
        switch (opcion) {
            case 1:
                eleccion = OpcionPelicula.HULK;
                break;
            case 2:
                eleccion = OpcionPelicula.HANDIA;
                break;
            case 3:
                eleccion = OpcionPelicula.VIDA_DE_BRIAN;
                break;
            default:
                System.out.println("Opción no válida");
                sc.close();
                return;
        }

        // ---------- SWITCH DE ELECCIÓN ----------
        switch (eleccion) {
            case HULK:
                mostrarSesion(sesionHulk, hulk);
                break;
            case HANDIA:
                mostrarSesion(sesionHandia, handia);
                break;
            case VIDA_DE_BRIAN:
                mostrarSesion(sesionVidaDeBrian, vidaDeBrian);
                break;
        }

        sc.close();
    }

    // ---------- MÉTODO AUXILIAR PARA MOSTRAR SESIÓN ----------
    private static void mostrarSesion(Sesion sesion, Pelicula pelicula) {
        System.out.println("Seleccionada: " + sesion.getPelicula());
        System.out.println("ID sesión: " + sesion.getIdSesion());
        System.out.println("Hora inicio: " + sesion.getFechaInicio().toLocalTime());
        System.out.println("Hora fin: " + sesion.getFechaFin().toLocalTime());
        System.out.println("Sala: " + sesion.getSala().getNombre());
        System.out.println("Precio sesión: " + sesion.getPrecio() + " €");
        System.out.println("Duración película: " + pelicula.getDuracion() + " min");
        System.out.println("Género película: " + pelicula.getGenero());
        System.out.println("Precio película: " + pelicula.getPrecio() + " €");
    }
}
