 import java.util.*;
 class quick{ 
    public static int  par(int[] a,int low,int high){    
        int pi=a[low]; 
        int i = low+1; 
        int j=high; 
        if(i<j){ 
            while(a[i]<=pi && i<j){  
                i++;
            } 
            while(a[j]>=pi && i<=j){ 
                j--;
            } 
            if(i<j){ 
                swap(a,i,j);
            }
        }  
        swap(a,j,low);
        return j;
    } 
    public static void swap(int [] a,int i,int j){ 
        int temp =a[i]; 
        a[i]=a[j]; 
        a[j]=temp;
    }
    public static void  quicksort(int[] a,int low,int high){ 
if(low<high){ 
    int j = par(a,low,high); 
    quicksort(a, low, j-1); 
    quicksort(a, j+1, high);
}
    } 
    public static void main(String[] args) {  
        Scanner sc =new Scanner(System.in); 
        System.out.println("enter the size of the array"); 
        int n=sc.nextInt();  
        int a[]=new int[n];
        System.out.println("enter the elements :"); 
        for(int i=0;i<n;i++){ 
            a[i]=sc.nextInt(); 
        }   
        quicksort(a,0,n-1);  
        System.out.println("output");
        for(int num :a){ 
            System.out.print(num+" ");
        } 
        System.out.println();
        sc.close();
        
    }

}