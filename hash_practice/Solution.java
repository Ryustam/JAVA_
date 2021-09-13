package hash_practice;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Solution {
	public static String solution(String[] participant, String[] completion) {
    	String answer = null;
    	
    	HashMap<String,Integer> map = new HashMap<>();
    
    	
    	for(String k:participant) {
    		map.put(k,map.getOrDefault(k, 0) + 1);
    	}
    	
    	for(String s:completion) {
    		map.replace(s, map.get(s)-1);
    	}
    	
    	for(Entry<String,Integer> entry :map.entrySet()) {
    		if(entry.getValue()!=0) {
    			answer=entry.getKey();
    		}
    	}
    	return answer;
}
	
	
	public static <K, V> K getKey(HashMap<K, V> map, V value) {
		 
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }		
	

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in_p;
		
		String participant[] = new String[100000];
		String completion[] = new String[99999];
		
		in_p=sc.nextLine();
		
		StringTokenizer stok = new StringTokenizer(in_p,"]");
		String in_p1=stok.nextToken();
		String in_p2=stok.nextToken();
		
		StringBuilder sb = new StringBuilder(in_p1);
		StringBuilder sb2 = new StringBuilder(in_p2);
		sb.delete(0,1);
		sb2.delete(0, 3);
		
		in_p1=sb.toString();
		in_p2=sb2.toString();
		
		participant=in_p1.split(", ");
		completion=in_p2.split(", ");
		
		System.out.println(solution(participant, completion));
	}  
}