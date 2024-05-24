package trabalho;

public class Real extends Moeda{


	public Real(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		double total = valor * 1;
		return total;
	}
	@Override
	public String toString() {
		return "Real---Valor = " + valor;
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
