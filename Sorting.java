import java.util.Arrays;
import java.io.IOException;
class Sorting{
	public static void main(String[] args) throws IOException {
		int arr[]={0,1,1,2,2,2,3,3,3,3};
		int len=arr.length;
		int j=0;

 for(int i=0;i<=arr.length;i++){
 	if(arr[i]!=arr[i+1]){
 		arr[j++]=arr[i];
 	}
 }
System.out.println("Sorting Array is : ");
 for(int elem:arr){
 	System.out.println(elem);
 }
	}

}