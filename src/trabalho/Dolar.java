package trabalho;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		// cambio do dolar foi considerado como 4
		double total = valor * 4;
		return total;
	}
	@Override
	public String toString() {
		return "Dólar---Valor = " + valor + ", Valor convertido = " + converter() + "";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}




