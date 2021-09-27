package practice_class08;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;

public class Q1 {
	//1.Write a method that can remove duplicated values from an Integer ArrayList.EX : ArrayList<Integer>(List.of(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5) ---> [1,2,3,4,5]
	
	static ArrayList<Integer> remover(ArrayList<Integer> list){
      for(int i = 0; i < list.size(); i++){
          int count = 0;
          for(int j = 0; j < list.size(); j++){
              if(list.get(i).equals(list.get(j)))
                  count++;
          }
          if(count > 1){
              list.remove(list.get(i));
              i--;
          }
      }
      return list;
//       return new ArrayList<>(new HashSet<>(list));
  }

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,5,64,2,64,3,2,9));
		System.out.println(remover(list1));
	}
}
