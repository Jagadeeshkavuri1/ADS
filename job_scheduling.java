 import java.util.*;
 public class job_scheduling{  
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number of jobs"); 
        int n = sc.nextInt(); 
        int profits[] = new int[n]; 
        int id[] = new int[n]; 
        int temp,deadlines[] = new int[n]; 
        for (int i=0;i<n;i++){ 
           System.out.println("enter job "+i+"id"); 
           id[i] = sc.nextInt();  
            System.out.println("enter job "+i+"profit"); 
           profits[i] = sc.nextInt();  
            System.out.println("enter job "+i+"deadline"); 
           deadlines[i] = sc.nextInt(); 
        } 
        // arrage profits with the descending order  
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=n;j++){ 
                if(profits[i]<profits[j]){ 
                   temp = profits[j]; 
                   profits[j] = profits[i];  
                   profits[i] = temp; 
                   temp = id[j]; 
                   id[j] = id[i];  
                   id[i] = temp; 
                   temp = deadlines[j]; 
                   deadlines[j] = deadlines[i];  
                   deadlines[i] = temp;  
                }
            }
        }  

        sc.close();
        
    }

}