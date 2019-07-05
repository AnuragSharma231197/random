import java.util.*;

public class ReverseString{

public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	String str1[]=str.split(" ");
	String str2="";
	for(int i=str1.length-1;i>=0;i--){
		str2=str2+" "+str1[i];
		}
		System.out.println(str2);
	}
}