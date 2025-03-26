import java.util.Scanner;

public class nking {  
    public static int []x;  
    public static boolean place(int k,int i){ 
        for(int j=1;j<k;j++){ 
            if(x[j]==i||Math.abs(x[j]-i)==Math.abs(j-k)){ 
                return false;
            }
        } 
        return true;
    } 

    public static void nkings(int k,int n){ 
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
                    nkings(k+1, n);
                }
            }
        }

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n =sc.nextInt(); 
        sc.close();  
        x= new int[n+1];  
        nkings(1,n);


    }
    
}
