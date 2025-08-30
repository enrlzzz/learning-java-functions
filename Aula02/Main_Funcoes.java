package Aula02;

public class Main_Funcoes {

    
    public static void main(String[] args) {
        
        soma(3, 5);
    }
    
    public static void enviaEmail(String assunto, String reme, String dest, String corp) {
        
        System.out.println("Assunto: " +assunto);
        System.out.println("Remetente: " +reme);
        System.out.println("Destinatário: " +dest);
        System.out.println("Corpo: " +corp);
    }
    
    public static void soma(double num1, double num2) {
        
        System.out.println(num1);
        System.out.println(num2);
        
        double soma = num1 + num2;
        
        System.out.println("A soma é igual a: " + soma);
    }
    
}
