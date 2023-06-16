/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlselectivo;

/**
 *
 * @author xaxbe
 */
public class ControlSelectivo {
    //primer ejemplo de control selectivo
    public static void main(String[] args) {
    int edad = 18;
if (edad >= 18) {
  System.out.println("Eres mayor de edad");
} else {
  System.out.println("Eres menor de edad");
}
    }
    
    
    
    //segundo ejemplo de control selectivo
    char operacion = '+';
int num1 = 5;
int num2 = 7;
int resultado;

switch (operacion) {
  case '+':
    resultado = num1 + num2;
    break;
  case '-':
    resultado = num1 - num2;
    break;
  case '*':
    resultado = num1 * num2;
    break;
  case '/':
    resultado = num1 / num2;
    break;
  default:
    System.out.println("Operación no válida");
    return;
}

System.out.println("El resultado de la operación es: " + resultado);
}
