# Prova_Java

QUESTÃO 1• valor: 5,0 pontos
Considere a classe Livro em um sistema de uma livraria:

public class Livro {
private String titulo;
private String autor;
public Livro(String titulo, String autor) {
this.titulo = titulo;
this.autor = autor;
}
public void exibirDetalhes() {
System.out.println("Título: " + titulo);
System.out.println("Autor: " + autor);
}
}

Suponha que você queira adicionar duas nova classe chamada "LivroTecnico" e "LivroInfantil"
que herda da classe "Livro". A classe LivroTecnico deve ter um atributo adicional chamado
"area" para indicar a área de conhecimento do livro (por exemplo, "Programação", "Redes", etc.)
e LivroInfantil o atributo faixa Etária. Escreva o código para ambas as classes citadas, incluindo
construtor e o método exibirDetalhes que mostre todos os atributos do livro bem como os
atributos particulares de LivroInfantil e LivroTecnico. Lembrem-se que sets e gets devem ser
implementados.

Ao fim implemente apenas uma classe de teste para invocar LivroTecnico e LivroInfantil.


QUESTÃO 2 • valor: 5,0 pontos
FACULDADE DE TECNOLOGIA SENAC-DF
Considere um sistema de uma loja que vende produtos eletrônicos. Crie uma interface chamada
"Recarregavel" que define o comportamento de um produto que pode ser recarregado, com os
seguintes métodos:

public interface Recarregavel {
void recarregar();
boolean precisaRecarregar();
}

Suponha que você queira implementar a interface "Recarregavel" em duas classes: "Celular" e "Bateria".
A classe "Celular" representa um telefone celular que pode ser recarregado e a classe "Bateria"
representa uma bateria que pode ser recarregada.

Escreva o código para as classes "Celular" e "Bateria", implementando os métodos da interface e em
seguida a classe de teste.

Detalhes da classe Celular:

● Atributos: String modelo, int nivelBaterial;
● Métodos: além dos solicitados pela interface, implemente o construtor inicializando os atributos
e o toString.

Detalhes da classe Bateria:

● Atributos: int nivelCarga;
● Métodos: além dos solicitados pela interface, implemente o construtor inicializando o atributo e o
toString.

O nível de carga mínimo para carregar é escolhido pelo desenvolvedor. Ex: carga inferior a 10% emite
um comunicado para recarregar.
