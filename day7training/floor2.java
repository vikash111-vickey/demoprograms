package day7training;

public class floor2 {

    public static void main(String[] args) {

        String[] sizes = { "rahul","rahul", "ravi", "ravi","vikash","vikash", "vikash","yashwanth"};

        String target = "vikesh";

        int start = 0;
        int end = sizes.length - 1;

        String floor = null;
        String ceil = null;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (sizes[mid].equals(target)) {

                floor = sizes[mid];
                ceil = sizes[mid];

                break;
            }

            else if (sizes[mid].compareTo(target) < 0) {

                floor = sizes[mid];   
                start = mid + 1;      
            }

            else {

                ceil = sizes[mid];    
                end = mid - 1;        
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}