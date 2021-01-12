public class MVCCalculator {
   
    public static void main(String[] args) {
    	CalculatorView theView = new CalculatorView();
        theView.setVisible(true);
    	CalculatorModel theModel = new CalculatorModel();
        new CalculatorController(theView,theModel);
    }
}