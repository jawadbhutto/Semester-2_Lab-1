import java.util.*;
class even_or_odd {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Integer: ");
int integer = sc.nextInt();

if(integer>0){
if(integer%2==0){
System.out.println(integer + " is Even ");
}
else {
System.out.println(integer + " is Odd ");
}
}
else{
if(integer==0){
System.out.println(integer+" is Zero ");
}
else{
System.out.println(integer +" is Invalid");
}
}
}
}