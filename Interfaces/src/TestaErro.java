import java.io.FileNotFoundException;


public class TestaErro {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			new  java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		metodo1();
		System.out.println("termino do main");
	}
	
	public static void metodo1 () {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("termino do metodo1");
	}
	
	public static void metodo2 () {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];
		for(int i = 0; i < 15; i++){
			try {
				array[i] = i * i;
				System.out.println(array[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("posicao invaliada " + e.getMessage());
			}	
		}
		System.out.println("termino do metodo2");
	}
}
