public class SY_2022bit037{
	public static void main(String[] args){
		 int arr[]={1,2,3,4,5,6,7,8,9,10};
		 
		 int x= firstele(arr);
		System.out.println(x);
		int y=lastele(arr);
		System.out.println(y);
		 int z=lassecele(arr);
		 System.out.println(z);
		 int w=sumele(arr);
		 System.out.println(w);
		 
		}
	      //Printing the first element of Array	
		public static int firstele(int[] args){
			return args[0];
			}
		//Printing the last element of Array	
		public static int lastele(int[] args){
			return args[args.length-1];
			}
		//Printing the Last Second Element of Array	
		public static int lassecele(int[] args){
		       return args[args.length-2];
		       }
		//Printing the Sum of Elements of Array       
		public static int sumele(int[] args){
			int sum=0;
			for(int i=0;i<args.length;i++){
			  	sum=sum+args[i];
			  }
			  return sum;
		}
		       
		      
			
		
	}

