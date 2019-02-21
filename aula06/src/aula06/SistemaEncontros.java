package aula06;

import java.util.ArrayList;
import java.util.List;

public class SistemaEncontros {
	private List<Encontro> encontros = new ArrayList<Encontro>();

	public void adicionar(Encontro e) {
		encontros.add(e);
	}

	public void remover(Encontro e) {
		encontros.remove(e);
	}

	public List<Encontro> listarEncontros() {
		return encontros;
	}
}
