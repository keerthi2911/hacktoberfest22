import java.util.Scanner;
class Palindrome
{  
    public static void main(String args[])
    {  
        int r,sum=0,temp;    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        
        temp=n;    
        while(n>0)
        {    
            r=n%10;
            sum=(sum*10)+r;    
            n=n/10;    
        }    
        if(temp==sum)    
            System.out.println("Palindrome Number ");    
        else    
            System.out.println("Not Palindrome Number");    
    }  
} 

/*OUTPUT:

I: Enter the Number: 121
O: Palindrome Number

I: Enter the Number: 123
O: Not Palindrome Number
*/
