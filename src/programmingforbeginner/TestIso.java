package programmingforbeginner;

import java.util.HashMap;
import java.util.Map;

public class TestIso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("BJK", 1);
		map.put("GS", 2);
		map.put("FB", 3);
		map.forEach((key, value) -> System.out.println(key +"=" + value));
	}

}
