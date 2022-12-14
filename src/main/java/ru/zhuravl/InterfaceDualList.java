package ru.zhuravl;

public interface InterfaceDualList extends InterfaceList {

    InterfaceDualList intersect(DualLinkList dualLinkList);

    InterfaceDualList getSubList(int position, int number);

    void printDualList();



}
