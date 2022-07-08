/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciojpane;

import javax.swing.JOptionPane;
/**
 *
 * @author Marco Tulio
 */
public class ExercioJPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int request = 0;
        String val_digits = "";
        int soma = 0;
        int loop = 0;
        int total_val = 0;
        int total_par = 0;
        int total_impar = 0;
        int above_100 = 0;
        int media = 0;
        
        do {
            request = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um número:"
                    + "<br>(0 interrompe)</html>"));
            val_digits += String.valueOf(request) + " ";
            soma += request;
            loop++;
            
            if (request % 2 == 0) {
                ++total_par;
            } else {++total_impar;}
            
            if (request > 100) {
                ++above_100;
            }
            
            ++total_val;
        } while (request != 0);
        
        media = soma / loop;
        JOptionPane.showMessageDialog(null, "<html>Resultado <hr>" + "<br>Valores Digitados: "
            + val_digits + "<br>Total de valores: "+ total_val + "<br>Total de pares: " + total_par +
            "<br>Total de Ímpares: " + total_impar + "<br>Acima de 100: " + above_100 +
            "<br>Média dos valores: " + media);
    }
    
}
