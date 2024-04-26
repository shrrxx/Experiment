import java.math.*; 
import java.util.*; 
public class RSA   
{  
static Scanner sc = new Scanner(System.in); 
public static void main(String[] args)   
{  
System.out.println("Enter a Prime number:");  
BigInteger p=sc.nextBigInteger();  
System.out.println("Enter another prime number: ");  
BigInteger q=sc.nextBigInteger();  
BigInteger n=p.multiply(q);  
BigInteger n2=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));  
BigInteger e = generateE(n2);  
BigInteger d = e.modInverse (n2);  
System.out.println("Encryption keys are: " + e + "," + n);  
System.out.println("Decryption keys are:" + d + "," + n);  
 }  
private static BigInteger generateE(BigInteger fiofn)  
{  
int y,GCD;  
Random x = new Random();  
BigInteger e; do  
 {  
 y= x.nextInt(fiofn.intValue()-1);   
String z = Integer.toString(y); 
 e = new BigInteger(z);  
 BigInteger gcd = fiofn.gcd(e);   
 GCD = gcd.intValue();  
 }  
while(y<=2 || GCD!=1); 
return e;  
   } 
}  
