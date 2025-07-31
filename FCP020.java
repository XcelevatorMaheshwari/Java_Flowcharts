import java.util.Scanner;
public class FCP020{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int max,secondmax;
if(a > b){
max=a;
secondmax=b;
}
else{
max=b;
secondmax=a;
}
if(c > max){
    secondmax=max;
        max=c;
}else if (c > secondmax){
secondmax=c;
}
if(d > max){
max=d;
} else if(d > secondmax) {
secondmax=d;
}
System.out.println(secondmax);
}}