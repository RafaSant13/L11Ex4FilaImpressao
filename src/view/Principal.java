package view;

import javax.swing.JOptionPane;

import controller.ImpressoraControle;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila<String> fila = new Fila<>();
		ImpressoraControle i = new ImpressoraControle();
		int x = 0;
		while(x!=9) {
			x = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Inserir documento\n2 - Imprimir\n9 - Fim"));
			switch (x) {
			case 1: 
				int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do Computador: "));
				String nome  = JOptionPane.showInputDialog("Insira o nome do arquivo: ");
				String documento = id+";"+nome;
				i.insereDocumento(fila, documento);
				break;
			case 2:
				i.imprime(fila);
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor Inválido");
				break;
			}
		}

	}

}
