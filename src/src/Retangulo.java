/*
 * Classe Retangulo herda da classe poligono porque tem as carateristica e metodos
 *  mas eu sobreescrevo o metodo getArea da classe pai porque o o calculo da area é unico para cada classe filha Retangulo
 *
 */
package src;

public class Retangulo extends Poligono {
    
    public Retangulo(int altura, int largura) {
        super(altura, largura);
    }

    @Override
    public float getArea() {
        return getAltura() * getLargura(); // Área diferente do triângulo
    }
}    