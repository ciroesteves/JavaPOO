package projeto7;

public class usina2 {
	String nome;
	long potencia_max;
	long geracao_atual;

	usina2(String name, long pot_max, long ger_atual){
		this.nome = name;
		this.potencia_max = pot_max;
		this.geracao_atual = ger_atual;
		System.out.println("Nome: " + this.nome);
		System.out.println("Pot�ncia M�xima: " + this.potencia_max);
		System.out.println("Gera��o Atual: " + this.geracao_atual);
	}
}
