package collectiondemo;
import java.util.*;

import equalshash.Trainee;



public class MapExGen {
	public static void main(String[] args) {
		Trainee trainee1 = new Trainee(10, "prathyusha");
		Trainee trainee2 = new Trainee(11, "sai");
		Trainee trainee3 = new Trainee(4, "priya");
		Trainee trainee4 = new Trainee(13, "ankit");
		

		//Map<Integer,Trainee> map = new LinkedHashMap<>();
		Comparator<Integer>comparator=new IdComparator();
		Map<Integer,Trainee> map = new TreeMap<>(comparator);
		map.put(10, trainee1);
		map.put(11, trainee2);
		map.put(4, trainee3);
		map.put(13, trainee4);
	
		
		int size=map.size();
		
		System.out.println("size="+size);

		Trainee trainee = map.get(11);// fetching value associated with key 11
		System.out.println(trainee.getId() + " " + trainee.getName());

		map.remove(4);// removing element by key=4
		
		Set<Integer> keys = map.keySet();
		for (Integer k : keys) {
			Trainee fetched = map.get(k);
			System.out.println(fetched.getId() + " " +fetched.getName());

		}

	}

}



