import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>(new Apple(), 5);

        Box<Apple> appleBox2 = new Box<>(new Apple(), 2);

        Box<Orange> orangeBox = new Box<>(new Orange(), 3);

        Box<Lemon> lemonBox = new Box<Lemon>(new Lemon(), 2);

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
        System.out.println("Вес orangeBox: " + orangeBox.getWeight());
        System.out.println("Вес lemonBox: " + lemonBox.getWeight());

        System.out.println("Вес appleBox1 равен весу appleBox2? " + appleBox1.compare(appleBox2));
        System.out.println("Вес appleBox1 равен весу orangeBox? " + appleBox1.compare(orangeBox));

        appleBox1.transferFruits(appleBox2);
        System.out.println("После пересыпки, appleBox1 содержит:");
        appleBox1.printBox();
        System.out.println("После пересыпки, appleBox2 содержит:");
        appleBox2.printBox();

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println("Исходный intArray: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        Box.swapElements(intArray, 1, 3);
        System.out.println("После обмена элементов с индексами 1 и 3: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] strArray = { "один", "два", "три" };
        ArrayList<String> strList = Box.arrayToList(strArray);
        System.out.println("ArrayList из strArray: " + strList);
    }
}