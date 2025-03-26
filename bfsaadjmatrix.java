import java.util.*;
public class bfsaadjmatrix{ 
    private int v; 
    private int [][] adj; 
    bfsaadjmatrix(int v){ 
        this.v=v; 
        adj= new int[v][v];
    }  
    public void bfs(int source){  
        boolean [] s = new boolean[v]; 
        Arrays.fill(s, false); 
        Queue <Integer> queue = new LinkedList<>();  
        queue.add(source); 
        s[source]=true; 
        while(!queue.isEmpty()){ 
            int vis =queue.poll(); 
            System.out.println("visted is "+vis); 
            for(int i=0;i<v;i++)
                if(!s[i]&&adj[vis][i]==1){ 
                    queue.add(i); 
                    s[i]=true;
                }
            
        } 


    }  
    public static void main(String[] args) { 
        System.out.println("enter th the number of vertexes ");  
        Scanner sc = new Scanner(System.in); 
        int v =sc.nextInt();   
        bfsaadjmatrix a = new bfsaadjmatrix(v);
        System.out.println("enter adjency matrix ");  
        for(int i=0;i<v;i++){ 
            for(int j=0;j<v;j++){  
                a.adj[i][j]= sc.nextInt();
            }
        } 
        System.out.println("enter source vertex ");  
        int start =sc.nextInt(); 
        a.bfs(start);


        sc.close(); 

    }

}