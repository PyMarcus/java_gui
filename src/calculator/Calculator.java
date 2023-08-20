package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Calculator extends CalculatorForm {


    @Override
    protected void btnClose(ActionEvent ev) {
        if(this.confirmToClose()){
            this.setVisible(false);
            this.dispose();
        }
    }

    @Override
    protected void btnClear(ActionEvent ev) {
        textCapital.setText("");
        textAmount.setText("");
        textRate.setText("");
        textPeriod.setText("");
    }

    @Override
    protected void btnSolve(ActionEvent ev) {
        double capital = Double.parseDouble(textCapital.getText());
        double rate = Double.parseDouble(textRate.getText());
        double period = Double.parseDouble(textPeriod.getText());

        double amount = capital * Math.pow((1 + rate), period);
        textAmount.setText(Double.toString(amount));
    }

    private boolean confirmToClose(){
        int choise = JOptionPane.showConfirmDialog(
                this,
                "Are u sure?",
                "Close",
                JOptionPane.YES_NO_OPTION
        );

        if(choise == JOptionPane.YES_NO_OPTION){
            return true;
        }
        return false;
    }
}
