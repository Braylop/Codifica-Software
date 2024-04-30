import javax.swing.JOptionPane;

public class tarea24{
    public static void main(String[] args){
        int suma=0,contador;
        String numeros = "";
        
        do{

            contador = Integer.parseInt(JOptionPane.showInputDialog("escribe numeros enteros para ser sumados, para salir escriba cero "));
            numeros=numeros+contador + " ";
            suma = suma + contador;
            
        }while(contador != 0);
        
        JOptionPane.showMessageDialog(null,"los numeros son "+numeros+"\nSuma "+suma);
    }
}
