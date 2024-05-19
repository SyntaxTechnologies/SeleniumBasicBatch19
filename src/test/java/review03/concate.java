package review03;

public class concate {
    public static void main(String[] args) {
     int i=5;
       String xapth = "//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]";
        System.out.println(xapth);
    }
}
