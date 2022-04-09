package agenda.pkg9.ex.pkg1;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class Agenda9Ex1 {
    public static void main(String args[]) {
        // TODO code application logic here
//    declaração de variaveis
    int cont;
    double [] atv = new double [5];
    String nomealuno;
    double mediaaluno = 0;

//  inicio
    nomealuno = JOptionPane.showInputDialog("Escreva o nome do aluno");
    
// ENTRADA DE DADOS COM LAÇO for
 
    for (cont = 0; cont < 5; cont++){
     atv[cont] = Double.parseDouble (JOptionPane.showInputDialog("Digite a nota da "+ (cont + 1) + "ª atividade."));
     mediaaluno += atv[cont];
}
// cálculo da média

    mediaaluno = mediaaluno/5;

// saída
    if (mediaaluno >= 5){
     JOptionPane.showMessageDialog(null, nomealuno + " aprovado");
} else{
    JOptionPane.showMessageDialog(null, nomealuno + " reprovado");
       }
 
   }
}
