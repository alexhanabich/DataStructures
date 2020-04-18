package Array;

public class DynamicArray {
    int length = 0;
    int[] values;

    public DynamicArray(int length) {
        values = new int[length];
    }

    public void add(int value) {
        if(length == values.length) {
            int[] newValues = new int[values.length * 2];
            for (int i = 0; i < values.length; i++) {
                newValues[i] = values[i];
            }
            values = newValues;
        }
        values[length] = value;
        length++;
    }

    public int get(int index) {
        if (index >= length) {
            throw new IllegalArgumentException();
        }
        return values[index];
    }

    public int indexOf(int value) {
        for (int i = 0; i < length; i++) {
            if (values[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index >= length) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < length; i++) {
            values[i] = values[i + 1];
        }
        length--;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < length; i++) {
            str += values[i];
            if (i != length - 1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
