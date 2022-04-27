
public class Sofa {
	
	public String descricao;
	public String cor;
	public boolean retratil;
	public double preço;
	
	public Sofa(String descricao, String cor, boolean retratil, double preço){

		this.descricao = descricao;
		this.cor = cor;
		this.preço = preço;
		this.retratil = retratil;
		}
		
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isRetratil() {
		return retratil;
	}

	public void setRetratil(boolean retratil) {
		this.retratil = retratil;
	}

	public double getValor() {
		return preço;
	}

	public void setValor(double valor) {
		this.preço = valor;
	}

	public static void main(String[] args) {
	
	}
	
	public void Informacao(){
	
	System.out.println("Modelo: " + descricao + "\n" + "Cor: " + cor + "\n" +
			"Formato: " + retratil + "\n" + "Preco: " + preço + "\n");
	}
}
