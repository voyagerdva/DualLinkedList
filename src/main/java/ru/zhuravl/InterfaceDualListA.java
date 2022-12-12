package ru.zhuravl;

public interface InterfaceDualListA extends InterfaceListA {
    InterfaceDualListA intersect(DualLinkListA list);

    InterfaceDualListA getSublist(int position, int number);

    void printDualListA();

}
