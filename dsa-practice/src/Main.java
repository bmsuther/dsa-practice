public class Main {
    public static void main(String[] args) {
        Array<Integer> arrayImpl = new Array<>(5);
        arrayImpl.add(1);
        arrayImpl.add(2);
        arrayImpl.add(3);
        arrayImpl.add(4);
        arrayImpl.add(5);

        System.out.println(arrayImpl);

        arrayImpl.delete(0);

        System.out.println(arrayImpl);

    }
}
