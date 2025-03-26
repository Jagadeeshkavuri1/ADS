import java.util.*;
public class bfsadjmatlist {  
    private int  v; 
    private LinkedList<Integer>[]adj; 
    bfsadjmatlist(int v){  
        this.v = v;  
        adj = new LinkedList[v]; 
        for(int i =0;i<v;i++){ 
            adj[i]= new LinkedList<>(); 
        }


    }   
    public void addedge(int src,int des){ 
        adj[src].add(des); 
        adj[des].add(src);
    }  
public void bfs(int source){ 
    boolean [] s = new boolean[v]; 
    Arrays.fill(s,false); 
    Queue<Integer> queue = new LinkedList<>(); 
    queue.add(source); 
    s[source]= true; 
    while(!queue.isEmpty()){ 
        int vis = queue.poll(); 
        System.out.println("visted is "+vis); 
        for(int i:adj[vis]){ 
            if(!s[i]){ 
                queue.add(i); 
                s[i]=true; 

            }
        }
    }  
}


    public static void main(String[] args) { 
        System.out.println("enter number of vertex"); 
        Scanner sc = new Scanner(System.in); 
        int v = sc.nextInt(); 
    bfsadjmatlist h = new bfsadjmatlist(v); 
        System.out.println("enter the number of edges "); 
        int e = sc.nextInt();    
        System.out.println("enter edge source and destination ");
        for(int i =0;i<e;i++){ 
            int src =sc.nextInt(); 
            int des = sc.nextInt(); 
            h.addedge(src,des);
        } 
        System.out.println("enter the source vertex"); 
        int sou = sc.nextInt();   
        h.bfs(sou);

        sc.close();
    }
    
}
