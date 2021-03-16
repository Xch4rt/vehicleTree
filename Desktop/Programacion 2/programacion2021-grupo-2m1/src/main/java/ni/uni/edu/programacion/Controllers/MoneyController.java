/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ni.uni.edu.programacion.views.panels.PnlMoney;
/**
 *
 * @author Pablo
 */
public class MoneyController implements ActionListener{
    private PnlMoney pnlMoney;
    
    public MoneyController(PnlMoney pnlMoney)
    {
        this.pnlMoney = pnlMoney;
        initComponents();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getActionCommand().equals("Dolares"))
        {
            try
            {
                double num;
                boolean f = true;
                num = Double.parseDouble(pnlMoney.getjTextField1().getText());
                pnlMoney.getjTextField2().setText("$ "+String.valueOf(convert(num, f)));
            }catch(NumberFormatException a)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un numero");
            }
        }else if (e.getActionCommand().equals("Córdobas"))
        {
            try
            {
                double num;
                boolean f = false;
                num = Double.parseDouble(pnlMoney.getjTextField1().getText());
                pnlMoney.getjTextField2().setText("C$ "+String.valueOf(convert(num, f)));
            }catch(NumberFormatException a)
            {
                JOptionPane.showMessageDialog(null, "Ingrese un numero");
            }
        }else if(e.getActionCommand().equalsIgnoreCase("Nuevo"))
        {
            pnlMoney.getjTextField1().setText("");
            pnlMoney.getjTextField2().setText("");
            pnlMoney.getjTextField1().requestFocus();
        }
    }
    
    private void initComponents()
    {
        pnlMoney.getBtnNew().addActionListener(this);
        pnlMoney.getBtnCordoba().addActionListener(this);
        pnlMoney.getBtnDollar().addActionListener(this);
    }
    private double convert(double n, boolean f)
    {
        if (f)
        {
            return n * 35.10;
        }
        else
        {
            return n / 35.10;
        }
    }
}
