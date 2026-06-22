class DynamicArray {

    private int[] arr;
    private int size = 0;
    public DynamicArray(int capacity) {

        arr = new int[capacity];
            
    }

    public int get(int i) {

            return arr[i];
    }

    public void set(int i, int n) {

            if(i < arr.length) {
                arr[i] = n;    
            }
            
    }

    public void pushback(int n) {

            if(size < arr.length) {
                arr[size] = n;
            }
            else {
                resize();
                arr[size] =n;
              
            }
              size++;

    }

    public int popback() {

        

        int ans = arr[size-1];

        arr[size - 1] = 0;
        
        size--;

        return ans;

    }

    private void resize() {

        int arr1[] = new int[arr.length * 2];

        for(int i = 0; i < size; i++) {
            arr1[i] = arr[i];
        } 

        this.arr = arr1;
    }

    public int getSize() {

        return size;

    }

    public int getCapacity() {

        return arr.length;

    }
}
