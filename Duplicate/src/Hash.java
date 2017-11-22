
import java.util.*;
public class Hash {

	public static void main(String[] args) {
		Map<String,Integer> s=new HashMap<>();
		s.put("seshu", 1234);
		s.put("sai", 3456);
		Set<String> str=s.keySet();
		for(String a:str) {
			System.out.println(a + s.get(a));
		}
	}

}
