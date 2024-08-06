import java.util.Scanner;
public class Dolares{
 public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);

  //Leemos los Quetzales
  System.out.print("Ingrese la cantidad de Quetzales:$ ");
  double Quetzales = scanner.nextDouble();

   //Usamos la formula de convercion
   double Dolares = Quetzales * 7.76;

    //Mostramos las pulgadas de tela requeridas
    System.out.println("La cantidad de dolares es: " + Dolares);
   
 }
}