
public class Sofa {
	
	public String descricao;
	public String cor;
	public boolean retratil;
	public double pre�o;
	
	public Sofa(String descricao, String cor, boolean retratil, double pre�o){

		this.descricao = descricao;
		this.cor = cor;
		this.pre�o = pre�o;
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
		return pre�o;
	}

	public void setValor(double valor) {
		this.pre�o = valor;
	}

	public static void main(String[] args) {
	
	}
	
	public void Informacao(){
	
	System.out.println("Modelo: " + descricao + "\n" + "Cor: " + cor + "\n" +
			"Formato: " + retratil + "\n" + "Preco: " + pre�o + "\n");
	}
}
