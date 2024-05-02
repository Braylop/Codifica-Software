import javax.swing.JOptionPane;

public class tarea26{
    public static void main(String[] args){
      int n1=0;
      String n2=" ";
      while(n1<=51){
          n2+=(1+n1)+" "+(char)(1+n1) +"        "
          +(52+n1)+" "+(char)(52+n1)+"        "
          +(103+n1)+" "+(char)(103+n1)+"        "
          +(154+n1)+" "+(char)(154+n1)+"        "
          +(205+n1)+" "+(char)(205+n1)+"\n";
          n1++;
      }
      JOptionPane.showMessageDialog(null,n2);
    }
}
