public class MethodOverloading
{
    public static void main(String[] args) {
        Addition obj1 = new Addition();
        int s;
        s = obj1.add(3, 4);
        System.out.println(s);
        System.out.println(obj1.add(2,4,6));
        System.out.println(obj1.add("Suchitra","Ekanath"));
        System.out.println(obj1.add(2,4,6,8));
    }
}
