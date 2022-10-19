import java.util.Scanner;
class Test {
    static boolean isAutomorphic(int N)
    {
        int sq = N * N;
        while (N > 0) {
            if (N % 10 != sq % 10)
                return false;
  
            N /= 10;
            sq /= 10;
        }
  
        return true;
    }
  
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        System.out.println(isAutomorphic(n) ? "Automorphic" : "Not Automorphic");
    }
}



/*Output:
I: Enter Numbeer: 76
O: Automorphic

I: Enter Numbeer: 75
O: Not Automorphic
*/
