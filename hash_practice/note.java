package hash_practice;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class note {
	public static String solution(String[] participant, String[] completion) {
    	String answer = null;
    	
    	HashMap<Integer,String> pt = new HashMap<>();
    	HashMap<Integer,String> cm = new HashMap<>();
    
    	for(int i=0;i<participant.length;i++) {
    		pt.put(i, participant[i]);
    	}
    	
    	for(int i=0;i<completion.length;i++) {
    		cm.put(i, completion[i]);
    	}
    	
    	Set<Entry<Integer, String>> entrySet_pt = pt.entrySet();
    	//Set<Entry<Integer, String>> entrySet_cm = cm.entrySet();
    	
    	for (Entry<Integer, String> entry : entrySet_pt) {
    		if(cm.containsValue(entry.getValue())==true) {
    			cm.remove(getKey(cm,entry.getValue()));
    		}else if(cm.containsValue(entry.getValue())==false) {
    			answer=entry.getValue();
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
	