package ejemplogit;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wolcome");
		int valorA = 5,  valorB = 5, resultado = 0;
		calculadora cal = new calculadora();
		resultado = cal.suma(valorA, valorB);
		System.out.println(resultado);
	}

}
