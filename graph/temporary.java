package graph;
import java.util.*;
public class temporary {
    public static void main(String[] args){
        ArrayList<int[]>a=new ArrayList<>();
        a.add(new int[]{0,1});
         a.add(new int[]{0,2});
          a.add(new int[]{1,2});
           a.add(new int[]{1,3});
            a.add(new int[]{2,3});
            ArrayList<ArrayList<Integer>>b=new ArrayList<>();
            for(int i=0;i<a.size();i++){
                b.add(new ArrayList<Integer>());
            }
            for(int i=0;i<a.size();i++){
                b.get(a.get(i)[0]).add(a.get(i)[1]);
                 b.get(a.get(i)[1]).add(a.get(i)[0]);
            }
            for(int i=0;i<b.size();i++){
                for(int j=0;j<b.get(i).size();j++){
                    System.out.print(b.get(i).get(j)+" ");
                }
                System.out.println();
            }
    }
}
