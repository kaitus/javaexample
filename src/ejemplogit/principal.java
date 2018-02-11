package ejemplogit;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wolcome");
		int valorA = 5,  valorB = 5, resultadoSuma = 0, resultadoResta = 0;
		calculadora cal = new calculadora();
		resultadoSuma = cal.suma(valorA, valorB);
		resultadoResta = cal.resta(valorA, valorB);
		System.out.println(resultadoSuma);
		System.out.println(resultadoResta);
	}

}
