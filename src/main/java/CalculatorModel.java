// The Model performs all the calculations needed.
// It doesn't know about existence of the View

public class CalculatorModel {

//	hols the result of mathematical operation
	private float calculationValue;
	
	public void performOperation(float firstNumber, float secondNumber, String operation){
		switch (operation)
		{
			case "+":
				calculationValue = firstNumber + secondNumber;
				break;
			case "-":
				calculationValue = firstNumber - secondNumber;
				break;
			case "*":
				calculationValue = firstNumber * secondNumber;
				break;
			case "/":
				if(secondNumber==0){
					throw new ArithmeticException();
				}
				calculationValue = firstNumber / secondNumber;
		}
	}
	
	public float getCalculationValue(){
		return calculationValue;
	}
}