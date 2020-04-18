import Array.DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(3);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        int i = dynamicArray.get(3);
        int j =dynamicArray.indexOf(4);
        int k = dynamicArray.indexOf(3);
        dynamicArray.removeAt(0);
        System.out.println(dynamicArray);
    }
}

