package tasks;

import javax.swing.*;

/**
 * Created by Anna on 23.01.2017.
 */

    public class TemperatureDemo{
        public static void main(String[] args){
            char convertToF =  JOptionPane.showInputDialog("Enter 'C' for converting to 'F'").charAt(0);
            int temperature1 = Integer.parseInt(JOptionPane.showInputDialog("Введите значение градусов"));
            char convertToC =  JOptionPane.showInputDialog("Enter 'F' for converting to 'C'").charAt(0);
            int temperature2 = Integer.parseInt(JOptionPane.showInputDialog("Введите значение градусов"));

            TemperatureConverter tC = new TemperatureConverter();
            TemperatureConverter tF = new TemperatureConverter();

            JOptionPane.showMessageDialog(null, tC.convertTemp(temperature1,temperature2, convertToC, convertToF));
            JOptionPane.showMessageDialog(null, tF.convertTemp(temperature1,temperature2, convertToC, convertToF));

        }
    }

