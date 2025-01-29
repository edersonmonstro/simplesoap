package simplesoap;

import jakarta.jws.WebService;

@WebService
public interface CalculatorWebService {
	public int add(int num1, int num2);

}
