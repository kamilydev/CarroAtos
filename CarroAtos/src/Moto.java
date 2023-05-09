
public class Moto {
	public String marca;
	public String modelo;
	public int cilindradas;
	
	public void getDadosMoto() {;
		System.out.println("Dados da moto: " + marca + " " + modelo + " " + cilindradas);
	}
	
	public void setDadosMoto(String marcaMoto, String modeloMoto, int cilindradasMoto) {;
		marca = marcaMoto;
		modelo = modeloMoto;
		cilindradas = cilindradasMoto;
	}
}
