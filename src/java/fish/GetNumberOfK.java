package fish;
/**
 * 统计一个数字在排序数组中出现的次数
 * @author fish
 *
 */
public class GetNumberOfK {
	
	 public static int getNumberOfK(int [] array , int k) {
		 if(array==null&&array.length==0){
			 return 0;
		 }
		 int first = getFisrtK(array,k,0,array.length-1);
		 int last = getLastK(array,k,0,array.length-1);
		 if(first==-1||last==-1){
			 return 0;
		 }else{
			 return last-first+1;
		 }
	 }
	 
	 private static int getFisrtK(int[] array, int k, int start, int end) {
		 while(start<=end){
			 int mid = (start+end)/2;
			 if(array[mid]<k){
				 start = mid + 1;
			 }else if(array[mid]>k){
				 end = mid - 1;
			 }else{
				 if((mid>0&&array[mid-1]!=k)||mid==0){
					 return mid;
				 }else{
					 end=mid-1;
				 }
			 }
			 
		 }
		 return -1;
	}

	 private static int getLastK(int[] array, int k, int start, int end) {
		while(start<=end){
			int mid = (start+end)/2;
			if(array[mid]<k){
				start = mid+1;
			}else if(array[mid]>k){
				end = mid-1;
			}else{
				if((mid<array.length-1&&array[mid+1]!=k)||mid==array.length-1){
					return mid;
				}else{
					start = mid+1;
				}
			}
		}
		return -1;
	 }	

	 public static void main(String[] args) {
			int[] nums = {1,2,3,3,3,3,4,5};
			System.out.println(getNumberOfK(nums, 3));
			
		}

}
