package controller;

public class Threads extends Thread {
	
	private int a;
	private int b;
	private int opc;
	
	public Threads(int opc, int a, int b) {
		this.a = a;
		this.b = b;
		this.opc = opc;
	}
	
	public void run() {
		switch (opc) {
		
		case 1:
			System.out.println("Resultado: " + (a+b));
			System.out.println("Thread ID#" + getId() + "\n");
			break;
		
		case 2: 
			System.out.println("Resultado: " + (a-b));
			System.out.println("Thread ID#" + getId() + "\n");
			break;
		
		case 3:
			System.out.println("Resultado: " + (a*b));
			System.out.println("Thread ID#" + getId() + "\n");
			break;
			
		case 4:
			System.out.println("Resultado: " + (a/b));
			System.out.println("Thread ID#" + getId() + "\n");
			break;
			
		default:
			System.out.println("OPÇÃO INVÁLIDA!!!");
			System.out.println("Thread ID#" + getId() + "\n");
			break;
		}
	}
	
}
