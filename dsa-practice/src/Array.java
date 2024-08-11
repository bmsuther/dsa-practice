import java.util.Arrays;

public class Array <T> {

    private T[] data;
    private int length;
    private int max;

    public Array(int initialCapacity) {
        this.length = 0;
        this.max = initialCapacity;
        this.data =  (T[]) new Object[initialCapacity];
    }

    public T[] getArray() {
        return this.data;
    }

    public void add(T input) {
        // dynamic resizing
        if (length == max) {
            max *= 2;
            T[] tempArr = (T[]) new Object[max];
            for(int i = 0; i < length; i++) {
                tempArr[i] = this.data[i];
            }
            //increment before adding
            length++;
            tempArr[length] = input;
            this.data = tempArr;
        }
        else {
            this.data[length] = input;
            this.length++;
        }
    }

    public void delete(int index) {
        if(index > length) {
            throw new RuntimeException("Index of " + index + " is out of bounds for length of " + length);
        }
        //delete by skipping value with selected index
        for(int i = 0; i < length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[this.length-1] = null;
        this.length--;
    }

    public T get(int index) {
        if(index > length) {
            throw new RuntimeException("Index of " + index + " is out of bounds for length of " + length);
        }
        return this.data[index];
    }

    public void insert(int index, T input) {
        if(index > length) {
            throw new RuntimeException("Index of " + index + " is out of bounds for length of " + length);
        }
        this.data[index] = input;
    }

    public int length() {
        return this.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.data);
    }
}
