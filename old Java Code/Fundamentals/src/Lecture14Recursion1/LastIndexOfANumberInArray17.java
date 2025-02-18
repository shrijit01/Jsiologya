package Lecture14Recursion1;

public class LastIndexOfANumberInArray17 {
	
	public static int lastIndex(int a[],int x){
        if(a.length==0){
            return -1;
        }
        int smallArray[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        int k=lastIndex(smallArray,x);
        if(k!=-1){
            return k+1;
        }else{
            if(a[0]==x){
                return 0;
            }else{
                return -1;
            }
        }
    }
	
	public static int lastIndexBetter(int a[],int x,int si){
		if(si == a.length) {
			return -1;
		}
		
		int k = lastIndexBetter(a, x, si+1);
		if(k!=-1) {
			return k;
		}
		else {
			if(a[si]==x) {
				return si;
			}
			else {
				return -1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9 ,8 ,10 ,8,4,9,8};
		int res = lastIndexBetter(arr,8,0);
		System.out.println(res);
	}

}
