import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        String str = s.next();
        String str2 = s.nextLine();
        System.out.print(str2+str+x);
        s.close();
    }
}
