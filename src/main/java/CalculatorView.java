// This is the View
// It displays content to the user
// It does not perform any operation, it only passes input from the user to whoever want to use.
//It also puts output of operation to the view.

import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame{
	private JTextField firstNumber  = new JTextField(10);
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	private JComboBox mathematicalOperation = new JComboBox(new String[]{"+", "-", "*", "/"});

	CalculatorView(){
		// Sets up the view and adds the components
		JPanel calcPanel = new JPanel();
		calcSolution.setEditable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		mathematicalOperation.setSelectedIndex(0);
		
		calcPanel.add(firstNumber);
		calcPanel.add(mathematicalOperation);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		this.add(calcPanel);
		// End of setting up the components --------
	}

	public float getFirstNumber(){
		return Float.parseFloat(firstNumber.getText());
	}
	
	public float getSecondNumber(){
		return Float.parseFloat(secondNumber.getText());
	}

	public String getMathematicalOperation() {
		return String.valueOf(mathematicalOperation.getSelectedItem());
	}

	public void setCalcSolution(float solution){
		if((int)solution==solution)
			calcSolution.setText(Integer.toString((int)solution));
		else
			calcSolution.setText(Float.toString(solution));
	}

	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addCalculateListener(ActionListener listenForCalcButton){
		calculateButton.addActionListener(listenForCalcButton);
	}
	
	// Open a popup that contains the error message passed
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}