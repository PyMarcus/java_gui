package calculator;

import javax.swing.*;

public abstract class CalculatorForm extends JFrame {

    protected JPanel rodape;
    protected JPanel form;
    protected JButton solve;
    protected JButton clear;
    protected JButton close;

    protected JLabel lblCapital;
    protected JTextField textCapital;
    protected JLabel lblRate;
    protected JTextField textRate;
    protected JLabel lblPeriod;
    protected JTextField textPeriod;
    protected JLabel lblAmount;
    protected JTextField textAmount;

    public CalculatorForm(){
        this.run();
    }

    private void run(){
        this.setTitle("Simple Calculator");
        this.setSize(640, 480);
    }

    public JPanel getRodape(){
        if(rodape == null){
            rodape = new JPanel();
        }

        return rodape;
    }

    public JPanel getForm(){
        if(form == null){
            form = new JPanel();
        }

        return form;
    }
}
