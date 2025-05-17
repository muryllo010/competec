import java.util.Scanner;


 public class main
{      

   public static void main(String[] args); {
   System.out.println("hello word");
             

    Scanner entrada = new Scanner(System.in);
     System.out.println("selecione o seu pedido");
  int pedidos = entrada.nextInt();
   
   
   double pizza = 27.99;
   double refrigerante = 8.50;
   double sobremesa = 12.99;
   double suco_de_frutas = 9.99;
   double coxinha = 5.49; 
   
    int cupom_da_loja = 15;  
   
    double saldo_do_cliente = 40.99;   
    
   
   
   System.out.println("total:"+ saldo_do_cliente);
   
