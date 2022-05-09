package examplePackage;

import examplePackage.Structure;

public class StructureDemo implements Structure {
    public int addTwoInteger(int a, int b) {
        return a + b;
    }

    public int subtractTwoInteger(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Structure structure = new StructureDemo();
        structure.addTwoInteger(1, 2);
        structure.subtractTwoInteger(1,2);
    }
}