class ReferenceDemo {
    public static void main(String[] args) {

        int arr1[] = {10, 20, 30};
        int arr2[] = arr1;

        arr2[0] = 99;

        System.out.println("arr1[0] = " + arr1[0]);
    }
}