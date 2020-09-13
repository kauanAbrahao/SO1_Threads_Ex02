package viewer;

import javax.swing.JOptionPane;

import controller.Threads;

public class Principal {
	public static void main(String[] args) {
		for (int i = 0; i<4; i++) {
			
			int opc = Integer.parseInt(JOptionPane.showInputDialog("Você terá que fazer 4 contas. Escolha: " + "\n" + "1 - Soma \n" + "2 - Substração \n" + 
					"3 - Multiplacação \n" + "4 - Divisão" ));
			int a = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro número: " ));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Escolha o segundo número: " ));
		
		Threads calc = new Threads(opc, a, b);
		calc.run();
		}
	}

}
