/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ni.uni.edu.programacion.views.panels.PnlCalculatorT;

/**
 *
 * @author Pablo
 */
public class TemperatureController implements ActionListener {
    private PnlCalculatorT pnlT;
    
    public TemperatureController(PnlCalculatorT pnlT)
    {
        this.pnlT = pnlT;
        initComponent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getActionCommand().equalsIgnoreCase("Celcius")){
            try
            {
                Double.parseDouble(pnlT.getTxtField().getText());
                boolean t = true;
                double n1;
                n1 = Double.parseDouble(pnlT.getTxtField().getText());
                pnlT.getTxtResult().setText(String.valueOf(convert(n1, t)) + " °C");
            }
            catch(NumberFormatException a)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un numero");
            }
            
        }else if(e.getActionCommand().equalsIgnoreCase("Fahrenheit")){
            try
            {
                Double.parseDouble(pnlT.getTxtField().getText());
                boolean t = false;
                double n1;
                n1 = Double.parseDouble(pnlT.getTxtField().getText());
                pnlT.getTxtResult().setText(String.valueOf(convert(n1, t)) + " °F");
            }
            catch(NumberFormatException a)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un numero");
            }
        }else if(e.getActionCommand().equalsIgnoreCase("Nuevo"))
                {
                    pnlT.getTxtField().setText("");
                    pnlT.getTxtResult().setText("");
                    pnlT.getTxtField().requestFocus();
                }
    }
    
    private void initComponent()
    {
        pnlT.getBtnFah().addActionListener(this);
        pnlT.getBtnCel().addActionListener(this);
        pnlT.getBtnNew().addActionListener(this);
    }
    private double convert(double n, boolean t)
    {
        double result;
        if (t)
        {
            result = (n - 32) * 0.5;
        }
        else
        {
            result = n * (0.5) + 32;
        }
        return result;
    }
}
