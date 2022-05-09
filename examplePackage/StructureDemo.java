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
        Structure structure = new Structure() {
            @Override
            public int addTwoInteger(int a, int b) {
                return a + b;
            }

            @Override
            public int subtractTwoInteger(int a, int b) {
                return a - b;
            }
        };
    }
}