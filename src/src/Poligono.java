
// 1. DECLARAÇÃO DO PACOTE
package src;  // Define que esta classe pertence ao pacote "src"

// 2. DECLARAÇÃO DA CLASSE
//public abstract class Poligono {
public class Poligono {  // Cria uma classe pública chamada "Poligono"
    
    // 3. ATRIBUTOS PRIVADOS (ENCAPSULAMENTO)
    private int altura;    // Armazena a altura do polígono (acessível apenas dentro da classe)
    private int largura;   // Armazena a largura do polígono (acessível apenas dentro da classe)

    // 4. CONSTRUTOR DA CLASSE
    public Poligono(int altura, int largura) {  // Método especial chamado ao criar um objeto
        this.altura = altura;   // "this.altura" refere-se ao atributo da classe, "altura" é o parâmetro
        this.largura = largura; // Atribui o valor do parâmetro "largura" ao atributo "largura" da classe
    }
    
    // 5. MÉTODO GETTER PARA ALTURA
    public int getAltura() {  // Método público que retorna o valor da altura
        return altura;        // Retorna o valor do atributo "altura"
    }
    
    // 6. MÉTODO GETTER PARA LARGURA  
    public int getLargura() { // Método público que retorna o valor da largura
        return largura;       // Retorna o valor do atributo "largura"
    }
    
    // 7. MÉTODO PARA CALCULAR ÁREA (MÉTODO GENÉRICO)
    public float getArea() {  // Método que calcula e retorna a área como float
        return 0;             // Retorna 0 pois é uma implementação genérica para polígonos
    }
    //public abstract float getArea();
}