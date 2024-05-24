package trabalho;

public class Euro extends Moeda{
	

	public Euro(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		// cambio do euro considerado como 5
		double total=valor * 5;
		return total;
	}

	@Override
	public String toString() {
		return "Euro---Valor = " + valor + ", Valor convertido = " + converter() + "";
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
