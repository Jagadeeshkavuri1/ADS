class buuble{  
    public void sortty(int a[],int n){ 
        int i,j,temp; 
        boolean swap=false;
        for(i=0;i<n;i++){  
            swap=false;
            for(j=0;j<n-i-1;j++){ 
                if(a[j]>a[j+1]){ 
                    temp=a[j]; 
                    a[j]=a[j+1]; 
                    a[j+1]=temp; 
                    swap=true;
                } 
             
                }
       if(swap==false){  
                    break;
            }  
            
        } 

    } 
    public void show(int a[],int n){ 
        for(int i=0;i<n;i++){ 
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) { 
        int b[]={3,10,4,2,8,1,14};
        int k=b.length;  
        buuble k1 = new buuble(); 
        k1.sortty(b,k); 
        k1.show(b,k); 


        
    }
}