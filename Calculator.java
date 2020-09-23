
import java.util.Scanner;
public class Calculator {
     public static void main(String[] args){
       char conf;
       int result;
       Scanner input = new Scanner(System.in);
       do{
        Menu();
        
        System.out.println("Please Select one of the Below choice:");
        int c= input.nextInt();
        System.out.println("Please Enter your first number :");
        int x=input.nextInt();
        System.out.println("Please Enter your second number :");
        int y=input.nextInt();
        
        switch (c){
            case 1:
              result= Add(x,y);
              System.out.println(x+" + "+y+" ="+result);break;
            case 2:
                System.out.println(x+" - "+y+" ="+Subtract(x,y));break;
            case 3:
                System.out.println(x+" * "+y+" ="+Multiply(x,y));break;
            case 4:
                System.out.println(x+" / "+y+" ="+Divide(x,y)); break;
            case 5:
                System.out.println(x+" % "+y+" ="+Modulas(x,y));break;
            case 6:
                System.out.println(x+" ^ "+y+" ="+Power(x,y));break; 
             
            default:
                System.out.println("nothing to be done");
                
            
        }
        System.out.println("do you want to continue(Y/N):");
        conf=input.next().charAt(0);
       }while(conf=='Y'|| conf=='N');
         
     }
     static void Menu(){
         System.out.println("================================================================");
         System.out.println("                        Calculator Menu                         ");
         System.out.println("================================================================");
         System.out.println("        1.Add");
         System.out.println("        2.Subtract");
         System.out.println("        3.Multiply");
         System.out.println("        4.Divide");
         System.out.println("        5.Modulas");
         System.out.println("        5.Power");         

         
         
     }
     static int Add(int x, int y){
       return x+y;
     }
     static int Subtract(int x, int y){
         return x-y;
     }
     static int Multiply(int x, int y){
       return x*y;
     }
     static int Divide(int x, int y){
         return x/y;
     }
     static int Modulas(int x , int y){
         return x%y;
         
     }
     static double Power(int x , int y){
         return  Math.pow(x,y);
         
     }

