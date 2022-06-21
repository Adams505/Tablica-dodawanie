import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int[] tab = new int[5];
    int n = tab.length;
    Scanner scan = new Scanner(System.in);
    for(int i=0;i<n;i++)
     tab[i] = scan.nextInt();
    
     for(int i=0; i<n;i++)
       System.out.println("Liczba: "+ tab[i]);
    
  }
}