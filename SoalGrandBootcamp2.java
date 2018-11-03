/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalgrandbootcamp;

/**
 *
 * @author BOT
 */
public class SoalGrandBootcamp2 {

    private void btnCekMouseClicked(java.awt.event.MouseEvent evt) {
        Pattern ptn = Pattern.compile("[a-zA-Z]*{5}\\_([\\d]*{2})$");
        Matcher matcher = ptn.matcher(jFormattedTextField1.getText());
        if (matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Penulisan username " + jFormattedTextField1.getText() + " benar");
        } else {
            JOptionPane.showMessageDialog(null, "Penulisan username " + jFormattedTextField1.getText() + " salah");
        }
    }

    public static void main(String[] args) {

    }
}
