public class Main
{
	public static void main(String[] args) {
	     int[] array = {0,20,30,40} ;
         System.out.println(linearsearch(array, 30));
	}
	public static int linearsearch(int[] arr , int item ){
	    for( int i =0 ; i < arr.length ;i++){
	        if(arr[i] == item){
	                  return i;   }
	        
	    }

return -1;
	    
	}
}

