
import java.util.*;

public class Knapsack_Greedy{
        public static void main(String[] args) {
            double temp;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Bag Size :: ");
                int m=sc.nextInt();
                System.out.println("Enter no of weights/profits :: ");
                int n=sc.nextInt();
                int w[]=new int[n];
                int p[]=new int[n];
                for(int i=0;i<n;i++){
                    System.out.println("Enter "+(i+1)+" weight : ");
                    w[i]=sc.nextInt();
                    System.out.println("Enter "+(i+1)+" profit : ");
                    p[i]=sc.nextInt();
                }
                double pw[]=new double[n];
                double fw[]=new double[n];
                Arrays.fill(fw,0);
                for(int i=0;i<n;i++){
                    pw[i]=(double)p[i]/w[i];
                }
                for(int i=0;i<n-1;i++){
                    for(int j=i+1;j<n;j++){
                        if(pw[i]<pw[j]){
                            temp=pw[i];
                            pw[i]=pw[j];
                            pw[j]=temp;
                            temp=p[i];
                            p[i]=p[j];
                            p[j]=(int)temp;
                            temp=w[i];
                            w[i]=w[j];
                            w[j]=(int)temp;
                        }
                    }
                }
                double maxprofit=0;
                for(int i=0;i<n;i++){
                    if(m==0){
                         break;   
                    }
                    else if(m>=w[i]){
                           fw[i]=1;
                           m-=w[i];
                           maxprofit+=p[i]; 
                           System.out.println("Item Weight "+w[i]+" with profit "+p[i]+" placed fully in the bag");
                    }
                    else {
                        fw[i]=(double)m/w[i];
                        m=0;
                        maxprofit+=fw[i]*p[i];
                        System.out.println("Item Weight "+w[i]+" with profit "+p[i]+" placed "+fw[i]+" part of the item in the bag");
                    }
                }
                        System.out.println("Max Profit : "+maxprofit); 
                        sc.close();
            }
        }