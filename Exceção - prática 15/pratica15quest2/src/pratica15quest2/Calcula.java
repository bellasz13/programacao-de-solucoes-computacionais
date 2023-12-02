package pratica15quest2;

import java.util.Scanner;

public class Calcula {

	Scanner input = new Scanner(System.in);
	
	public int divide(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        if (dividendo < 0) {
            throw new ArithmeticException("Dividendo menor que zero não é permitido.");
        }

        return dividendo / divisor;
    }
}
