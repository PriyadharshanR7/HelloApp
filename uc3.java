import java.util.Scanner;

public class uc3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();
        if(name == null){
            System.out.println("Hello World");
        }
        else{
            System.out.println("Hello" + name);
        }

    }
}
