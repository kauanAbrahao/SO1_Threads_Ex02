package viewer;

import javax.swing.JOptionPane;

import controller.Threads;

public class Principal {
	public static void main(String[] args) {
		for (int i = 0; i<4; i++) {
			
			int opc = Integer.parseInt(JOptionPane.showInputDialog("Voc� ter� que fazer 4 contas. Escolha: " + "\n" + "1 - Soma \n" + "2 - Substra��o \n" + 
					"3 - Multiplaca��o \n" + "4 - Divis�o" ));
			int a = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro n�mero: " ));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Escolha o segundo n�mero: " ));
		
		Threads calc = new Threads(opc, a, b);
		calc.run();
		}
	}

}
