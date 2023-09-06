/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author jainaldo
 */
public class Calcular {
    
    private static Calcular calcular;

    private Calcular() {
    }
    
    public static Calcular getCalcular() {
        if (calcular == null) {
            calcular = new Calcular();
        }
        return calcular;
    }
    
    
    public int somar(int valor1, int valor2) throws NegaException {
        int resultado = valor1 + valor2;
        
        if (resultado < 0) {
            throw new NegaException();
        }
        
        return resultado;
    }
    
    public int subtrair(int valor1, int valor2) throws NegaException {
        int resultado = valor2 - valor1;
        
        if (resultado < 0) {
            throw new NegaException();
        }
        
        return resultado;
    }
    
    public float dividir(int valor1, int valor2) throws NegaException, ArithmeticException{
        float resultado = valor1 / valor2;
        
        if (resultado < 0) {
            throw new NegaException();
        }
        
        return resultado;
    }
    
    public int mutiplicar(int valor1, int valor2) throws NegaException {
        int resultado = valor1 * valor2;
        
        if (resultado < 0) {
            throw new NegaException();
        }
        
        return resultado;
    }
    
}
