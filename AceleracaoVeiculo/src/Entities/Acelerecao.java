package Entities; //pacote da classe

public class Acelerecao { //nome da classe
    public  double velocidade; // "public" indica que o atributo ou metodo pode ser usado em outros arquivos
                                //double velocidade e  double tempo sao atributos da classe
    public  double tempo;

    public double acelerecao() {      // aqui é uma funçao: 'double' significa o tipo de dado que o metodo retorna. Se o metodo
                                      // nao retorna nada, usa 'void'. 'aceleracao' é o nome do metodo. Dentro de () sao parametros.
         return velocidade/tempo;
    }

}
