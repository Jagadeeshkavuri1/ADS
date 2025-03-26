 import java.util.*;
 public class nque { 
    static int []x;  
    public static boolean place(int k,int i){ 
        for(int j=1;j<k;j++){ 
            if(x[j]==i||Math.abs(x[j]-i)== Math.abs(j-k)){ 
                return false; 
            }
        }  
        return true;
    }
    public static void nquen(int k,int n){ 
        if(k>n){ 
            for(int i=1;i<=n;i++){ 
                System.out.print(x[i]+" ");
           }  
           System.out.println(); 


        } 
            else{ 
                for(int i=1;i<=n;i++){ 
                    if(place(k,i)){ 
                        x[k]=i; 
                        nquen(k+1, n);
                    }
                } 

            }
        
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number of queens"); 
        int n = sc.nextInt(); 
        x=new int[n+1]; 
        nquen(1,n); 
    sc.close(); 
    }
    
}
