import javax.swing.JOptionPane;

public class tarea27{
    public static void main(String[] args){
        int n,i=1;
        String tabla=" ";
            n = Integer.parseInt(JOptionPane.showInputDialog("cual tabla de multiplicar quiere? "));
        while(i<=10){
            tabla += n
            + " x " + i + " = " 
            + ( n * i ) + "\n";    
            i++;
        }
        JOptionPane.showMessageDialog(null, tabla);
    }
}
