/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;

public class Main_ClasseAstrata {

    public static void main(String[] args) {
        //Poligono p = new Poligono(2, 5); // apos ter declarado a Classe abstrata chamada "Poligono"(pai das clases)
        //System.out.println("Área de um poligono: " + p.getArea());// Não consigo mais instanciar a classe poligono
        TrianguloRetangulo TR = new TrianguloRetangulo(2, 5);
        System.out.println("Área do TrianguloRetangulo: " + TR.getArea());
    }
    
}
