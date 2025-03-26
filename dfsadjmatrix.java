import java.util.*;
public class dfsadjmatrix {   
   private int v; 
   int [][] adj; 
   boolean [] s; 
    dfsadjmatrix(int v){ 
        this.v=v; 
        adj=new int[v][v]; 
       s = new boolean[v]; 
        Arrays.fill(s,false); 

    } 
    public void dfs(int source){  
        s[source]=true; 
        System.out.println("node"+source); 
        for(int i=0;i<v;i++){ 
            if(!s[i]&&adj[source][i]==1){ 
                dfs(i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter number of vertex"); 
        int v = sc.nextInt(); 
        dfsadjmatrix h = new dfsadjmatrix(v);
        System.out.println("enter the adjency matrix"); 
        for(int i=0;i<v;i++){ 
            for(int j=0;j<v;j++){ 
                h.adj[i][j]=sc.nextInt();
            }
        } 
        System.out.println("enter the source vertex"); 
        int source = sc.nextInt(); 
        h.dfs(source);
    sc.close();
    }
    
}
