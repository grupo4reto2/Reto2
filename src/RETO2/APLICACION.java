package RETO2;

public class APLICACION
{

	private static void mensajeBienvenida () {
		String negrita = "\033[1m";
		System.out.println("______________________________");
		System.out.println(negrita + "\nBIENVENIDO A ELORRIETA CINESA |");
		System.out.println("______________________________|");
	}

	public static void main(String[] args) {
	mensajeBienvenida();
		
	}

}
