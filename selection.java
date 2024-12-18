 
 public class selection { 
public void sortty(int a[],int n){  
    int temp;
    for(int i=0;i<n;i++){ 
        int mid = i;
            for(int j=i+1;j<n;j++){ 
             if(a[mid]>a[j]){ 
                mid=j;
             }
            }  
            temp=a[i]; 
            a[i]=a[mid]; 
            a[mid]=temp;
        }  
    }

    
    public void show(int a[],int n){ 
        for(int i=0;i<n;i++){ 
            System.out.println(a[i]); 
        }
} 
public static void main(String[] args) { 
    int b[]={3,10,4,2,8,1,14,24,87,69,14,2,-8,-2};
    int k=b.length;  
    selection k1 = new selection(); 
    k1.sortty(b,k); 
    k1.show(b,k); 


    
}
    
} 
