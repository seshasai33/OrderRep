
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		String s=new String("Hello! How are you? How about meeting tomorrow?");
		String[] words=s.split(" ");
		Map<String,Integer> s1=new LinkedHashMap<String,Integer>();
		for(String s2:words) {
			if(s1.get(s2)!=null) {
				s1.put(s2, s1.get(s2)+1);
			}
			else {
				s1.put(s2, 1);
			}
		}
		Set<String> str=s1.keySet();
		for(String s3:str) {
			if(s1.get(s3)>1)
				System.out.println("word : "+s3+ " repeated "+s1.get(s3)+"  times");
		}
	}
}
