package ru.zhuravl;

import java.util.Arrays;

public class DualLinkListA_Run {
    public static void main(String[] args) {
        System.out.println("\n\n========== Check ADD() ObjectA : ");

        InterfaceDualListA dualLinkListA = new DualLinkListA();

        String dataA[] = {"Alfa", "Beta", "Gamma", "Delta"};


        for (String name: dataA) {
            ObjectA objectA = new ObjectA(name);
            dualLinkListA.add(objectA);
        }
        System.out.println(dualLinkListA.getSize() + "\n-----------------------\n");

//========================================================================================================
        System.out.println("\n\n========== Check intersect() method(): ");

        InterfaceDualListA dualLinkListA1 = new DualLinkListA();
        InterfaceDualListA dualLinkListA2 = new DualLinkListA();

        String data1[] = {"00", "11", "22", "33", "44", "55", "66", "77"};
        String data2[] = {"55", "44", "X", "77", "88"};


        for (String name: data1) {
            ObjectA objectA = new ObjectA(name);
            dualLinkListA1.add(objectA);
        }
        int s = dualLinkListA1.getSize();
        System.out.println(s + "\n-----------------------\n");
        dualLinkListA1.printObjectsList();


        for (String name: data2) {
            ObjectA objectA = new ObjectA(name);
            dualLinkListA2.add(objectA);
        }
        s = dualLinkListA2.getSize();
        System.out.println(s + "\n-----------------------\n");
        dualLinkListA2.printObjectsList();


        InterfaceDualListA dualLinkListA3 = dualLinkListA1.intersect((DualLinkListA) dualLinkListA2);

        System.out.printf("%s %s \n", "size dualLinkListA3: ", dualLinkListA3.getSize());
        System.out.println(Arrays.toString(dualLinkListA3.getListValuesNames()));
        dualLinkListA3.printObjectsList();


////===================================================================================================
//        System.out.println("\n\n========== Check addList() method(): ");
//
//        dualLinkListA1.addList((DualLinkListA) dualLinkListA2);
//
//        System.out.println(Arrays.toString(dualLinkListA1.getListValuesNames()));
//        dualLinkListA1.printObjectsList();
//
//
////=========================================================================================================
//
//        System.out.println("\n\n========== Check getNodeValueNames method(): ");
//
//        System.out.println(((DualLinkListA) dualLinkListA1).getNode(0).getValue().name);
//        System.out.println(dualLinkListA1.getElement(0));
//        System.out.println(((DualLinkListA) dualLinkListA1).getNode(1).getValue().name);
//        System.out.println(dualLinkListA1.getElement(1));
//        System.out.println(((DualLinkListA) dualLinkListA1).getNode(2).getValue().name);
//        System.out.println(dualLinkListA1.getElement(2));
//        System.out.println(((DualLinkListA) dualLinkListA1).getNode(3).getValue().name);
//        System.out.println(dualLinkListA1.getElement(3));
//        System.out.println(((DualLinkListA) dualLinkListA1).getNode(4).getValue().name);
//        System.out.println(dualLinkListA1.getElement(4));
//
////        InterfaceDualItemA ref = ((DualLinkListA) dualLinkListA1).getNode(0);
////        System.out.println(ref.getName());
//    //=========================================================================================================
//        System.out.println("\n\n========== Check removeHead method(): ");
//
//        InterfaceDualListA dualLinkListA6 = new DualLinkListA();
//
//        String data3[] = {"00", "11", "22", "33", "44", "55", "66", "77"};
//
//
//        for (String name: data3) {
//            ObjectA objectA = new ObjectA(name);
//            dualLinkListA6.add(objectA);
//        }
//        s = dualLinkListA6.getSize();
//        System.out.println(s + "\n-----------------------\n");
//        dualLinkListA6.printObjectsList();
//
//        System.out.println("\n" + dualLinkListA6.getSize() + "\n-----------------------\n");
//
//        dualLinkListA6.removeElement(16);
//        System.out.println(Arrays.toString(dualLinkListA6.getListValuesNames()));
//        System.out.println("\n" + dualLinkListA6.getSize() + "\n-----------------------\n");
//        System.out.println();

    }





}



