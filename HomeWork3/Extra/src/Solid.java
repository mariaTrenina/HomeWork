public class Solid {
    public static void main(String[] args) {
        IntArray arr = new IntArray(3,7,2,5,8,0,1);
        IntArray a = new IntArray(13);
        IntArray b = new IntArray();
        arr.sort(true);
        System.out.println();
        arr.sort(false);
        System.out.println();
        b.setArray(1,2,3,8);
        System.out.println(b.getArray());
    }
}
