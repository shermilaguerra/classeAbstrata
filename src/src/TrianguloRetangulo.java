/*
 * Classe TrianguloRetangulo herda da classe poligono porque tem as carateristica e metodos
 * mas eu sobreescrevo o metodo getArea da classe pai porque o o calculo da area é unico para cada classe filha TrianguloRetangulo
 */
package src;



public class TrianguloRetangulo extends Poligono {
    
    public TrianguloRetangulo(int altura, int largura) {
        super(altura, largura);
    }

    @Override
    public float getArea() {
        return getAltura() * getLargura() / 2.0f;
    }
}

