class Array{
	public static void main(String[] args) {
		int arr[]={2,7,11,13};
		int target, sum;
		for (int i=0; i<=arr.length;i++){
			target=arr[0]+arr[i];
			if (target ==9){
				System.out.println(arr[i]);
            }
            else{
            	System.out.println("failed");
            }
		}
		
	}
}