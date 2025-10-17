/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

