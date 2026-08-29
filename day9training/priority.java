package day9training;

import java.util.PriorityQueue;

class patient{
		String name;
		int priority;
		patient(String name,int priority){
			this.name=name;
			this.priority=priority;
			
		}
	}
	public class priority {
	public static void main(String[] args) {
		PriorityQueue<patient>queue=new PriorityQueue<>(
				(p1,p2)->p1.priority-p2.priority
				);
				queue.add(new patient("anand",2));
				queue.add(new patient("rahul",3));
				queue.add(new patient("priya",8));
				queue.add(new patient("vikash",6));
				while (!queue.isEmpty()) {
					patient p=queue.poll();
					System.out.println(
							p.name+" - priority "+p.priority);
				}

	}

}
