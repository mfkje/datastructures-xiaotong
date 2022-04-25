package datastrcture.session2;

public class Day02CustomArray {
        //    Implement the above class.
//    You are NOT allowed to use any advanced data structures like ArrayLists, HashMaps, Arrays class, System.arraycopy(), etc.
//
//    You are NOT allowed to add or remove any methods or fields in the above code.
//
//    Special permission: You may add private helper methods if you wish and a public constructor.
//
//    Methods may throw ArrayIndexOutOfBoundsException if parameters (indexes) are invalid.

        private int[] data = new int[1]; // only grows by doubling size, never shrinks
        private int size = 0; // how many items do you really have

        public int size() {
                return size;
        }

        public void add(int value) {
                if (size == data.length) {
                        int[] newData = new int[data.length * 2];
                        System.arraycopy(data, 0, newData, 0, data.length);
                        data = newData;
                }
                data[size++] = value;
        }
        public void clear() {
                size = 0;
        }
        public int get(int index) {
                if (index < 0 || index >= size) {
                        throw new IndexOutOfBoundsException();
                }
                return data[index];
        }
        //delete first value matching, trueif value found, false otherwise
        public boolean deleteByValue(int value) {
                int index = findIndexOfValue(value);
                if (index != -1) {
                        deleteByIndex(index);
                        return true;
                }
                return false;
        }
       //shifting the data from right to left
        public void deleteByIndex(int index) {
                if (index < 0 || index >= size) {
                        throw new IndexOutOfBoundsException();
                }
                for (int i = index; i < size; i++) {
                        data[i] = data[i + 1];
                }
                size--;
        }


        public int findIndexOfValue(int value) {
                for (int i = 0; i < size; i++) {
                        if (data[i] == value) {
                                return i;
                        }
                }
                return -1;

        public void insertValueAtIndex(int value, int index) {
                if (index < 0 || index > size) {
                        throw new IndexOutOfBoundsException();
                }
                if (size == data.length) {
                      this.growStorage();
                }
                for (int i = size; i > index; i--) {
                        data[i] = data[i - 1];
                }
                }

                }
        }

