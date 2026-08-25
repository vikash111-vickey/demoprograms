package day6traininig;
public class builder {

    public static void main(String[] args) {

                StringBuilder c = new StringBuilder();

        c.append("Vikash");

        System.out.println("Create: " + c);
        System.out.println("Read: " + c);
        System.out.println(c.charAt(0));
        c.insert(5, " kshithriya");
        System.out.println("After Insert: " + c);
        c.replace(0, 5, "Mr Vikash");
        System.out.println("After Replace: " + c);     
        c.delete(0, 3);
        System.out.println("After Delete: " + c);    
    }
}