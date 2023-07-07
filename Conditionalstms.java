//conditional statements
import java.util.*;
class Conditionalstms{
	public static void main(String args[]){
	
	int x;
	Scanner obj=new Scanner(System.in);
	System.out.print("enter no.:");
	x=obj.nextInt();
	
//if--just checking the entered no. is even or not
	//if(x%2==0){ System.out.println("even");}

//if-else-checking the number is even or odd
	/*if(x%2==0){ System.out.println("even");}
	else{ System.out.println("odd");}*/

//if-else if checking positive,negative,0
	/*if(x>0){System.out.println("positive");}
	else if(x<0){System.out.println("positive");}
	else {System.out.println("zero");}*/
	


//nested if--checking the greatest number from 5 numbers
	/*int a=4,b=8,c=14,d=4,e=0;
	int p=0,q=0,r=0;
	if(a>b){p=a;}
	else{p=b;}

	if(c>d){q=c;}
	else{q=d;}
	
	if(p>q){r=p;}
	else{r=q;}

	if(r>e){System.out.println("greatest number of a=4,b=8,c=14,d=4,e=0 is:"+r);}
	else{System.out.println("greatest number of a=4,b=8,c=14,d=4,e=0 is:"+e);}*/

//conditional operator
	/*int a=4,b=8,c=14;
	int r=0;
	r=a>b?(a>c?a:c):(b>c?b:c);
	System.out.println(r);*/

//switch case statement
/*switch (x){
	case 1:
	System.out.println("sunday");
	break;
	
	case 2 : System.out.println("monday");break;
	case 3: System.out.println("tuesday");break;
	case 4: System.out.println("wednesday");break;
	case 5: System.out.println("thursday");break;
	case 6: System.out.println("friday");break;
	case 7: System.out.println("saturday");break;
	default:
		System.out.println("out of range enter 1 -7:");
	

}*/
	//swtch case intense
/*switch (x){
	case 1->{System.out.println("sunday");break;}
	case 2->{System.out.println("monday");break;}
	case 3->{ System.out.println("tuesday");break;}
	case 4->{System.out.println("wednesday");break;}
	case 5->{System.out.println("thursday");break;}
	case 6->{System.out.println("friday");break;}
	case 7->{System.out.println("saturday");break;}
	default->{System.out.println("out of range enter 1 -7:");}
	

}*/
 

	
	
			

}}
