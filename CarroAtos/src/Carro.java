
public class Carro {
	public String fabricante = "VW";
	public String modelo = "Jetta";
	
//	public void ligar() {
//		System.out.println("Carro ligado");
//	}
	
//	public void deligar() {
//		System.err.println("Carro desligado");
//	}
	public void setDados(String fabricanteCarro, String modeloCarro) {
		fabricante = fabricanteCarro;
		modelo = modeloCarro;
	}
	public void getDados() {
		System.out.println("Dados do carro: " + fabricante + " " + modelo);
	}
}