import javax.swing.JOptionPane;

public class DiaSemana {
    public static void main(String[] args) {
       
    int dia = Integer.parseInt(JOptionPane.showInputDialog("digite um número inteiro de 1 a 7: "));
    
        switch(dia){
            case 1:
            JOptionPane.showMessageDialog(null, "domingo");
            break;
            
            case 2:
            JOptionPane.showMessageDialog(null, "segunda-feira");
            break;
            
            case 3:
            JOptionPane.showMessageDialog(null, "terça-feira");
            break;
            
            case 4:
            JOptionPane.showMessageDialog(null, "quarta-feira");
            break;
            
            case 5:
            JOptionPane.showMessageDialog(null, "quinta-feira");
            break;
            
            case 6:
            JOptionPane.showMessageDialog(null, "sexta-feira");
            break;
            
            case 7:
            JOptionPane.showMessageDialog(null, "sábado");
            break;
            
            default:
                break;
        }   
    }
}
