class LinearSearchDemo {
    public static void main(String[] args) {

        int arr[] = {5, 15, 25, 35, 45};
        int key = 25;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}