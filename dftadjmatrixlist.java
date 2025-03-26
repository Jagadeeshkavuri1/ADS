import java.util.*; 
public class dftadjmatrixlist {  
    private int v; 
    LinkedList<Integer>[]adj;  
    @SuppressWarnings("unchecked") 
   public dftadjmatrixlist(int v){ 
        this.v=v;  
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){ 
            adj[i] = new LinkedList<>(); 
        } 
    }   
    void addgraph(int src,int des){ 
        adj[src].add(des); 
        adj[des].add(src); 
    } 
    void dfs(int sou){ 
        boolean [] s =  new boolean[v]; 
        Arrays.fill(s,false);  
        Stack <Integer> sat = new Stack<>(); 
        sat.push(sou);
        s[sou]=true; 
        while(!sat.isEmpty()){ 
             int vis = sat.pop(); 
             System.out.println("visted is "+vis); 
             for(int i :adj[vis]){ 
                if(!s[i]){ 
                    sat.push(i); 
                    s[i]=true;
                }
             }
        } 

    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter number of vertexes"); 
        int v = sc.nextInt();  
        dftadjmatrixlist h = new dftadjmatrixlist(v);
        System.out.println("enter the number of edges "); 
        int e = sc.nextInt(); 
        for(int i=0;i<e;i++){ 
            int src = sc.nextInt(); 
            int des = sc.nextInt(); 
            h.addgraph(src,des); 
        } 
        System.out.println("enter the source vertex"); 
        int sou = sc.nextInt(); 
        h.dfs(sou);
        sc.close();
    }
    
}
