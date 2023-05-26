/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooej04.entidades;

import java.util.Scanner;

/**
 *
 * @author cristian
 *
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 */
public class Rectangulo {

    private int base;
    private int altura;

    Scanner leer = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {

        System.out.println("Ingrese base");
        base = leer.nextInt();
        System.out.println("Ingrese altura");
        altura = leer.nextInt();

    }

    public int superficie() {

        int superficie = base * altura;

        return superficie;
    }

    public int perimetro() {

        int perimetro = (base + altura) * 2;

        return perimetro;
    }

    public void dibujo() {

        for (int i=0;i<altura;i++){
            System.out.print("* ");
            
            for (int j=0;j<base-1;j++){
               
                if ((i>0)&&(i<altura-1)&&(j<base-2))
                    System.out.print("  ");
                else
                    System.out.print("* ");
    }
            System.out.println("");
}
    }
}
