package day7training;

public class binary4 {

	public static void main(String[] args) {
		String[] arr = {"rahul","rahul","ravi","ravi","vikash","vikash","yashwanth","vikash"};
		String target="vikash";
		int last=-1;
		int  first=-1;
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
				if(arr[mid]==target) {
					first=mid;
					end=mid-1;
				}
				else if(arr[mid].compareTo(target)<0) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
				
			}
		start=0;
		end=arr.length-1;
		while(start<=end) {
		int mid=(start+end)/2;
			if(arr[mid]==target) {
				last=mid;
				start=mid+1;
			}
		
		else if(arr[mid].compareTo(target)<0) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}
	  }
		System.out.println("first= "+first);
		System.out.println("last= "+last);
	}
	
}
