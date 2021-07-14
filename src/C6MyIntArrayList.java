import java.util.Arrays;

public class C6MyIntArrayList {

    private int[] intElements;
    private int size;

    public C6MyIntArrayList(int initCapacity) {
        this.intElements = new int[initCapacity];
    }

    public C6MyIntArrayList(C6MyIntArrayList c) {
        this.size = c.size;
        this.intElements = new int[size];
        if (size != 0) {
            for (int i = 0; i < this.size; ++i) {
                this.intElements[i] = c.intElements[i];
            }
        }
    }

    public C6MyIntArrayList() {
        this(20);
    }

    public boolean add(int e) {
        if (this.size == this.intElements.length) {
            this.intElements = Arrays.copyOf(this.intElements, this.size * 2);
        }

        this.intElements[size] = e;
        this.size++;
        this.intElements = Arrays.copyOf(intElements, size);
        return true;
    }

    public int size() {
        return this.size;
    }

    public void printElements() {
        System.out.println("\nElements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(intElements[i] + " ");
        }
    }

    public boolean doesContain (int e) {
        for (int i = 0; i < this.size; ++i) {
            if (e == this.intElements[i]) {
                return  true;
            }
        }

        return false;
    }

    public int get (int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        return this.intElements[index];
    }

    public int indexOf (int e) {
        for (int i = 0; i < this.size; ++i) {
            if (e == this.intElements[i]) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf (int e) {
        for (int i = size - 1; i >= 0; --i) {
            if (e == this.intElements[i]) {
                return i;
            }
        }

        return -1;
    }

    public int removeElementAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        int removeThis = this.intElements[index];

        //        for (int i = index; i < this.size; ++i) {
        //            this.intElements[i] = this.intElements[i + 1];

        System.arraycopy(this.intElements, index + 1, this.intElements, index, this.size - index);

        this.size--;

        return removeThis;
    }

    public void clear() {
        this.size = 0;
    }

    public int set (int index, int e) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        int replaceThis = this.intElements[index];
        this.intElements[index] = e;

        return replaceThis;
    }

    public boolean addAll (C6MyIntArrayList c) {
        for (int i = 0; i < c.size; i++) {
            add(c.get(i));
        }
        return true;
    }

    public boolean addAll (int index, C6MyIntArrayList c) {
        if (c == null) {
            throw new IndexOutOfBoundsException();
        }

        intElements = Arrays.copyOf(intElements, intElements.length + c.intElements.length);
        int limit = c.intElements.length + index;
        for (int i = intElements.length - 1; i >= limit; i--) {
            intElements[i] = intElements[i - c.intElements.length];
        }
        int count = 0;
        for (int i = index; i < limit; i++) {
            intElements[i] = c.intElements[count];
            count++;
        }

        return true;
    }

    public boolean swapElements (int[] array, int index1, int index2) {

        if (array == null || index1 >= array.length || index2 >= array.length ||
            index1 < 0 || index2 < 0 || index1 == index2) {

            return false;
        }

        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;

        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (this.intElements.length != this.size) {
            this.intElements = Arrays.copyOf(this.intElements, minCapacity);
        }

    }

    public void getCapacity() {
        System.out.println("\nCapacity = "+ intElements.length);
    }

    public void trimToSize() {
        if (this.intElements.length != this.size) {
            this.intElements = Arrays.copyOf(this.intElements, size);
        }
    }
}
