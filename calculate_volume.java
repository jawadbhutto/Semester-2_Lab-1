import java.util.*;
class calculate_volume {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int height = sc.nextInt();
int radius = sc.nextInt();
double volume = 3.14 * (radius*radius) * height ;
System.out.println("Volume  -->  "+ volume);
}
}