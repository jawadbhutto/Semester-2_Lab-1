import java.util.Scanner;
class mile_speed_in_km {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter speed in miles --> ");
float mile = sc.nextFloat();

System.out.println("Mile in Km --> "+ (mile + (mile * 0.6)));

} 
}