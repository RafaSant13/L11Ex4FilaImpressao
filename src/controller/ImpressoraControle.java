package controller;

import model.Fila;

public class ImpressoraControle {

	public ImpressoraControle() {
		super();
	}
	
	public void insereDocumento(Fila<String> fila, String documento) {
		fila.insert(documento);
	}
	
	public void imprime(Fila<String> fila) {
		try {
			String documento = fila.remove();
			String[] partes = documento.split(";");
			long tempo = (long)((Math.random()*1001)+1000);
			Thread.sleep(tempo);
			System.out.println("#PC: "+partes[0]+" - Arquivo: "+partes[1]);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}


}
