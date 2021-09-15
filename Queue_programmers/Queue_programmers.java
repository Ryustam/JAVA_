package Queue_programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_programmers {

	public static void main(String[] args) {
		
	int arr[] = {95,90,99,99,80,99};
	int arr2[] = {1,1,1,1,1,1};
	for(int i=0;i<solution(arr,arr2).length;i++) {
		System.out.println(solution(arr,arr2)[i]);
	}
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
		
		 Queue<Integer> queue = new LinkedList<>();
		 
		 for(int i=0;i<progresses.length;i++) {
			 queue.add(calc(progresses[i],speeds[i]));
		 }
		 int launch=1;
	     int count =1; 
	     int max=queue.poll();;
	     do{ 
	    	 if(max>=queue.peek()) {
	    		 queue.poll();
	    	 }else {
	    		 launch++;
	    		 max=queue.poll();
	    	 }
	     }while(queue.peek()!=null);
	    
	     int[] answer = new int[launch];
	     
	     for(int i=0;i<progresses.length;i++) {
			 queue.add(calc(progresses[i],speeds[i]));
		 }
	     
	     launch=0;
	     count =1; 
	     max=queue.poll();;
	     do{ 
	    	 if(max>=queue.peek()) {
	    		 queue.poll();
	    		 count++;
	    		 answer[launch]=count;
	    	 }else {
	    		 if(launch==0) {
	    			 answer[launch]=count;
	    		 }
	    		 answer[launch]=count;
	    		 count=1;
	    		 launch++;
	    		 max=queue.poll();
	    	 }
	     }while(queue.peek()!=null);
	     
	     
	     
	     return answer;
	 }

	public static int calc(int progresses, int speeds) {
		
		int day=0;
			
		for(int j=1;;j++) {
			if(progresses+speeds*j>=100) {
				day=j;
				break;
			}
		}
		return day;
	}
	

}
