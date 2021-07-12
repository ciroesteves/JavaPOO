package projeto7;

public class usina {
String nome;
long potencia_max;
long geracao_atual;

usina(){
	this.nome = "Itaipu";
	this.potencia_max = 14000;
	this.geracao_atual = 10800;
	System.out.println("Nome: " + nome);
	System.out.println("Potência Máxima: " + potencia_max);
	System.out.println("Geração Atual: " + geracao_atual);
}
}
