package Arrays;
import javax.swing.*;

/*
 Switch e Case das opiçoes de colocar as notas saber a média do alunos
 e sair como a ultima opção !
*/
public class Alunos {
    public static void main(String[] args) {

        String menu = JOptionPane.showInputDialog("1-Quantidade de alunos.\n" +
                "2-Média do aluno/a.\n" +
                "3-Sair.\n");
        switch (menu) {
            case "1":
                int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos/a"));
                String[] nomes = new String[qtdAlunos];//Arrey para armezenar Nomes !
                for (int i = 0; i < qtdAlunos; i++) {
                    nomes[i] = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "° aluno/a");
                }
                JOptionPane.showMessageDialog(null, "A quantidade de alunos é " + qtdAlunos);
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Informe as notas !");
                double[] notas = new double[3];
                double inclemento = 0;
                for (int i = 0; i < notas.length; i++) {
                    notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "° nota"));
                    inclemento += notas[i];
                }

                double media = inclemento / 3;
                JOptionPane.showMessageDialog(null, "A média do aluno é " + media);
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Você saiu !");
                break;
        }
    }
}
