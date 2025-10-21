/*
 *Cálculo de area de poligonos
* Crie um programa que calcule a area de diferentes figuras geométricas:
*  Retângulo, TriânguloRetangulo.
* Use herança para definir uma classe base Poligono e classes filhas para cada figura(Retângulo, TriânguloRetangulo).
* Use polimorfismo para que o método calcularArea() funcione de forma genérica para todas.
 */
package src;

public class Main_ClasseAstrata {

    public static void main(String[] args) {
        //Poligono p = new Poligono(2, 5); // apos ter declarado a Classe "Poligono"(pai das clases)como abstrata eu Não consigo mais instanciar a classe poligono
        //System.out.println("Área de um poligono: " + p.getArea());// 
        TrianguloRetangulo TR = new TrianguloRetangulo(2, 5);
        System.out.println("Área do TrianguloRetangulo: " + TR.getArea());
        Retangulo R = new Retangulo(5, 10);
        System.out.println("Área do Retangulo: " + R.getArea());
    }
    
}
