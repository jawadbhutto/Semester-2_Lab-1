import java.util.*;
class celsius_to_farhenheit{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter temperature in Celsius --> ");
int celsius = sc.nextInt();
float farhenheit = celsius * 9/5 + 32;
System.out.println("Celsius into Farhenheit -->  "+farhenheit);
}
}