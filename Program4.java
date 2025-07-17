import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter seat number");
        int b=a.nextInt();
        int c =b%8;
        switch(c){
            case 0:
                    System.out.println("side upper berth");
                    break;
            case 1:
                    System.out.println(" lower berth");
                    break;
            case 2:
                    System.out.println(" middle berth");
                    break;
            case 3:
                    System.out.println("upper  berth");
                    break;
            case 4:
                    System.out.println("lower berth");
                    break;
            case 5:
                    System.out.println("middle berth");
                    break;
            case 6:
                    System.out.println(" upper berth"); 
                    break;
            case 7:
                    System.out.println("side lower berth");   
                    break;
            default:
                    System.out.println("thank you");            



                }

       
               

       }
    }