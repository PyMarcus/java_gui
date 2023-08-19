package calculator;

import javax.swing.*;

public class App {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
