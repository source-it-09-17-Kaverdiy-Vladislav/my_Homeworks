package HomeWork3;

public class Demo {
    public static void main(String[] args) {

        MyList myList = new MyListImpl();

        System.out.println(myList.size());
        myList.add(new Person());
        System.out.println(myList.size());
    }
}
