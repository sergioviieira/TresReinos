
public class Governante {
// atributos
	private String nome;

	private int ouro;
	private int agua;
	private int madeira;
	public int getOuro() {
		return ouro;
	}
	public void setOuro(int ouro) {
		this.ouro = ouro;
	}
	public int getAgua() {
		return agua;
	}
	public void setAgua(int agua) {
		this.agua = agua;
	}
	public int getMadeira() {
		return madeira;
	}
	public void setMadeira(int madeira) {
		this.madeira = madeira;
	}	
    public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
	
// construtor	
	public Governante(String nome, int ouro, int agua, int madeira) {
		this.ouro = ouro;
		this.agua = agua;
		this.madeira = madeira;
		this.nome = nome;
	}
  }

	