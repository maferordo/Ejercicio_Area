/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area;
import java.util.Scanner;
/**
 *
 * @author mafer
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nombrar las variables como tipo flotante
        double lados, area;
        
        // Pedirle informacion al usuario 
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese lados de un cuadrado: ");
        lados = in.nextDouble();
        
        // Encontrar el area y elevarlo al cuadrado
        area = Math.pow(lados,2);
        
        //resultado
        System.out.println("El area es: " + area);
        
    }
    
}
