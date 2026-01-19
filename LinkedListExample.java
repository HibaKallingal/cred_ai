import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args)
    {
        var cars = new LinkedList<String> ();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.addFirst("Mazda");
        cars.removeLast();
        cars.addLast("Skoda");
        System.out.println(cars);
    }
}

