package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class CalculatorForm extends JFrame {

    private static final int LABEL_SIZE = 12;

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
        this.events();
    }

    private void run(){
        this.setTitle("Simple Calculator");
        //this.setSize(640, 480);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // main layout
        this.setResizable(false);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(getForm(), BorderLayout.CENTER);
        this.getContentPane().add(getRodape(), BorderLayout.PAGE_END);

        // resize automatically
        this.pack();
    }

    public JPanel getRodape(){
        if(rodape == null){
            rodape = new JPanel(new FlowLayout(FlowLayout.CENTER));
        }

        solve = new JButton("Solve");
        clear = new JButton("Clear");
        close = new JButton("Close");
        this.customizeButton();

        rodape.add(solve);
        rodape.add(clear);
        rodape.add(close);
        return rodape;
    }

    public JPanel getForm(){
        if(form == null){
            form = new JPanel(new GridLayout(4, 2));
            lblCapital = new JLabel("Capital");
            textCapital = new JTextField(LABEL_SIZE);

            lblRate = new JLabel("Rate");
            textRate = new JTextField(LABEL_SIZE);

            lblPeriod = new JLabel("Period");
            textPeriod = new JTextField(LABEL_SIZE);

            lblAmount = new JLabel("Amount");
            textAmount = new JTextField(LABEL_SIZE);
            textAmount.setEditable(false);

            form.add(lblCapital);
            form.add(textCapital);
            form.add(lblRate);
            form.add(textRate);
            form.add(lblPeriod);
            form.add(textPeriod);
            form.add(lblAmount);
            form.add(textAmount);
        }

        return form;
    }

    private void customizeButton(){
        //color
        close.setBackground(Color.RED);
        close.setForeground(Color.WHITE);
    }

    protected abstract void btnClose(ActionEvent ev);

    protected abstract void btnClear(ActionEvent ev);

    protected abstract void btnSolve(ActionEvent ev);

    private void events(){
        close.addActionListener(this::btnClose);
        clear.addActionListener(this::btnClear);
        solve.addActionListener(this::btnSolve);
    }

}
