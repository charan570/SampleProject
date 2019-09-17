package charan;
import java.util.ArrayList;
public class LoopForeach {

	

	public static void main(String[] args) {
		
   ArrayList<String> l=new ArrayList<String>();
   l.add("volume");
   l.add("base");
   l.add("height");
   l.add("width");
   System.out.println(l.size());
//   //for(int i=0;i<l.size();i++)
//   {
//	   System.out.println(l.get(i));
//	   
//   
//    
//   }
   for(String x:l){
	   System.out.println(x);
   }
	}

}
