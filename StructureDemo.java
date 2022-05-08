public class StructureDemo implements Structure {
    public int addTwoInteger(int a, int b) {
        return a + b;
    }

    public int subtractTwoInteger(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Structure structure = new Structure();
        System.out.println(structure.addTwoInteger());
        System.out.println(structure.subtractTwoInteger());
    }
}