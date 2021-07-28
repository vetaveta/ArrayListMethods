
    public class MyArrayList<T> {
        private static final int INITIAL_SIZE = 10;
        private Object[] data;
        private int size;

        public void MyArrayList() {
            this.data = new Object[INITIAL_SIZE];
            this.size = 0;
        }

        public void add(T element) {
            if (this.size == this.data.length) {
                Object[] newArray = new Object[this.data.length * 2];
                for (int i = 0; i < this.data.length; i++) {
                    newArray[i] = this.data[i];
                }
                this.data = newArray;
            }
            this.data[this.size] = element;
            this.size++;
        }

        public T get(int i) {
            if (i >= this.size) {
                throw new IllegalArgumentException("Big Index: " + i);
            }
            if (i < 0) {
                throw new IllegalArgumentException("Negative Index: " + i);
            }
            return (T) this.data[i];
        }

        public void remove(int removeIndex) {
            for (int i = removeIndex; i < this.size - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            this.data[size - 1] = null;
            this.size--;
        }

        public int size() {
            return this.size;
        }

        public  boolean contains(T item){
            for(int i = 0; i< this.data.length; i++){
                if(this.data[i].equals(item)){
                    return true;
                }
            }
            return false;
        }

        public boolean isEmpty() {
            return this.size == 0;
        }

        @Override
        public String toString() {
            if (this.size == 0) {
                return "[]";
            }
            StringBuilder str = new StringBuilder("[ ");
            str.append(this.data[0]);
            for (int i = 1; i < this.size; i++) {
                str.append(" , ");
                str.append(this.data[i]);
            }
            str.append(" ]");

            return str.toString();
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof MyArrayList)) {
                return false;
            }
            MyArrayList<T> arrayList = (MyArrayList<T>) other;
            if (this.size != arrayList.size) {
                return false;
            }
            for (int i = 0; i < arrayList.size; i++) {
                if (!this.data[i].equals(arrayList.data[i])) {
                    return false;
                }
            }
            return true;
        }

    }

