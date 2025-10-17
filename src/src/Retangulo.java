/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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