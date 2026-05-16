package matrizes.app.service;

import javax.swing.JOptionPane;

public class MatrizServise {

        public void exercutarmatriz(){
            int[][] matrizA = new int[2][2];        
            int[][] matrizB = new int[2][2];
            int[][] resultado = new int[2][2];

            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++){
                    matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da matriz A: "));
                    matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da matriz B: "));
                }   
            for (int i = 0; i <2; i++){
                for (int j = 0; j < 2; j++){
                    resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Resultado da soma das matrizes:\n");
            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 2; j++){
                    sb.append(resultado[i][j]).append(" ");
                }
                sb.append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
}