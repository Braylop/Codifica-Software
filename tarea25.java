import javax.swing.JOptionPane;

public class tarea25{
    public static void main(String[] args){
        int n,f=0,t1=1,t2,contador=1;
        String valores = " ";
            n = Integer.parseInt(JOptionPane.showInputDialog("cuantos valores de la serie quiere?"));
            
        do{
            
            t2=f;
            f=t1+f;
            t1=t2;
            valores = valores + t1 + " , ";
            contador++;
        }while(contador<= n);
        
        JOptionPane.showMessageDialog(null,"la serie es : " + valores +"  ") ;  
    }
}
