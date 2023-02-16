import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex_01_lista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		String cor;

		for (int contador = 0; contador <= 4; contador++) { 
			System.out.println("Digite a cor:  ");
			cor = sc.nextLine();
			cores.add(cor);

		}

		System.out.println("Listar todas as cores:  ");
		cores.forEach(System.out::println);

		Collections.sort(cores);
		System.out.println("Ordenar as cores:  ");
		cores.forEach(System.out::println);

	}

}
