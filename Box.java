import java.util.List;
import java.util.ArrayList;
public class Box<T extends Fruit>
{
    private List<T> fruits = new ArrayList<>();
    public Box(T fruit, int quantity)
    {
        for (int i = 0; i < quantity; i++) {
            fruits.add(fruit);
        }
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public float getWeight()
    {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }
    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }
    public void transferFruits(Box<T> anotherBox)
    {
        if (this == anotherBox) {
            return;
        }

        if (this.fruits.isEmpty())
        {
            return;
        }

        for (T fruit : fruits) {
            anotherBox.addFruit(fruit);
        }
        fruits.clear();
    }
    public void printBox() {
        for (T fruit : fruits) {
            System.out.println(fruit.getClass().getSimpleName());
        }
    }
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static <T> ArrayList<T> arrayToList(T[] array) {
        ArrayList<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}