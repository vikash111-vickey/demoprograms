package day6traininig;
public class intersectionstring {
				    public static void main(String[] args) {

				        String[] array1 = {"vikash", "vikas", "thilak", "yashwanth"};
				        String[] array2 = {"ullas", "vikas", "yeshas", "yashwanth"};

				        System.out.println("Intersection:");

				        for (int i = 0; i < array1.length; i++) {

				            for (int j = 0; j < array2.length; j++) {

				                if (array1[i].equals(array2[j])) {
				                    System.out.print(array1[i] + " ");
				                }

				            }
				        }
				    }
				
			}