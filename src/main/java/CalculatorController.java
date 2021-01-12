// The Controller coordinates interactions between the View and Model
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			float firstNumber, secondNumber = 0;
			String operation="";

			try{
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				operation = theView.getMathematicalOperation();
				
				theModel.performOperation(firstNumber, secondNumber, operation);
				theView.setCalcSolution(theModel.getCalculationValue());
			}

			catch(NumberFormatException ex){
				System.out.println(ex);
				theView.displayErrorMessage("You Need to Enter 2 Numbers");
			}

			catch (ArithmeticException ex){
				System.out.println(ex);
				theView.displayErrorMessage("We can not divide by 0");
			}
		}
	}
}