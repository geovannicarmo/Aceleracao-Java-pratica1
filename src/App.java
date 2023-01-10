import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);  
            int number = sc.nextInt();  
           System.out.println(sc);

            for(int i = 0; i<=10; i++){
                System.out.println(number*i);
            }
    }    
}


