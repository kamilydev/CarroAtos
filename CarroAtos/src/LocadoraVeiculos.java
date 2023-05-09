import java.util.Scanner;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leitura = new Scanner(System.in);
		System.out.println("Insira o fabricante do veículo: ");
		String fabricanteCarro1 = leitura.nextLine();
		System.out.println("Insira o modelo do veículo: ");
		String modeloCarro1 = leitura.nextLine();
		
		System.out.println("Insira o fabricante da 1º moto: ");
		String fabricanteMoto1 = leitura.nextLine();
		System.out.println("Insira o modelo da 1º moto: ");
		String modeloMoto1 = leitura.nextLine();
		System.out.println("Insira quantas cilindradas tem a 1º moto: ");
		int cilindradasMoto1 = leitura.nextInt();
		
		System.out.println("Insira o fabricante da 2º moto: ");
		String fabricanteMoto2 = leitura.nextLine();
		System.out.println("Insira o modelo da 2º moto: ");
		String modeloMoto2 = leitura.nextLine();
		System.out.println("Insira quantas cilindradas tem a 2º moto: ");
		int cilindradasMoto2 = leitura.nextInt();
		
		Carro carro = new Carro();
		carro.setDados(fabricanteCarro1, modeloCarro1 );
		carro.getDados();
		
		Moto moto1 = new Moto();
		moto1.setDadosMoto(fabricanteMoto1, modeloMoto1, cilindradasMoto1);
		moto1.getDadosMoto();
		
		Moto moto2 = new Moto();
		moto2.setDadosMoto(fabricanteMoto2, modeloMoto2, cilindradasMoto2);
		moto2.getDadosMoto();
	}
	

}
