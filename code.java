import java.util.*;

public class class1 {
	

	
	private static Scanner in;


	public static void main(String[] args) {

		
		in = new Scanner(System.in);
		//int Test=in.nextInt();
		int size=in.nextInt();
		int [] array1=new int[size];
		//int[] array3=new int[size];
		for(int i=0;i<size;i++){
			array1[i]=in.nextInt();
		}
		//array3=array1;
        class1 obj=new class1();
		int r=obj.check_sorted_array(array1);
		System.out.println(r);
		String ans=obj.rotate(array1);
		System.out.println(ans);

}


	int check_sorted_array(int [] array1){
		int flag=0;
		
		for(int i=0;i<array1.length-1;i++){
			for(int j=i+1;j<array1.length;j++){
				if(array1[i]>array1[j]){
					flag=1;
					break;
					
				}
				else{
					
				}
			}
			if(flag==1){
				break;
			}
		}
		return flag;
		
		
	}
	
	
	String rotate(int [] array1){
		
		int b=0,c=0,r3=0;
		for(int i=0;i<array1.length-2;i++){
			for(int j=i;j<array1.length-2;j++){
			
			b=array1[j];
			c=array1[j+1];
			array1[j+1]=array1[j+2];
			array1[j]=c;
			array1[j+2]=b;
			for(int x:array1){
				System.out.println(x);
			}
			r3=check_sorted_array(array1);
			
			if(r3==0){
				r3=3;
				break;
			}
			else{

			}
			
			
			}	
		}
		if(r3==3){
			return "YES";
		    
		}
		else{
			return "NO";
		}
		
	
		
	}
}
