package ru.zhuravl;

public class DualLinkList extends LinkList implements InterfaceDualList {
    class DualNode extends LinkList.Node implements InterfaceDualItem {

        DualLinkList.DualNode previous;

        DualNode(String value, DualNode next, DualNode previous) {
            super(value, next);
            this.previous = previous;
        }

        @Override
        public InterfaceDualItem getPrevious() {
            return previous;
        }
    }

//==================================================================================

    @Override
    public void add(String data) {
        super.add(data);
    }

    @Override
    protected InterfaceItem createNode(String data) {
        if (super.getTail() == null) {
            return new DualLinkList.DualNode(data, (DualNode) null, (DualNode) null);
        } else {
            return new DualLinkList.DualNode(data, (DualNode) null, (DualNode) getHead());
        }
    }

    @Override
    public InterfaceDualList intersect(DualLinkList dualLinkList) {
        DualLinkList list3 = (DualLinkList) super.intersect(dualLinkList);
        return list3;
    }

    protected InterfaceDualList createList() {
        return new DualLinkList();
    }

    @Override
    public void printDualList() {
        InterfaceDualItem ref = (InterfaceDualItem) getTail();
        for (int i = 0; i < getSize(); i++) {
            System.out.printf("%-25s %-35s\n", "getValue():", ref.getValue());
            System.out.printf("%-25s %-35s\n", "Node:", ref);
            System.out.printf("%-25s %-35s\n", "getPrevious():", ref.getPrevious());
            System.out.printf("%-25s %-35s\n", "getNext():", ref.getNext());
            System.out.println("-------------");
            ref = (InterfaceDualItem) ref.getNext();

        }

    }

//===================================================================================


    @Override
    public InterfaceDualList getSubList(int position, int number) {
        InterfaceDualList list = new DualLinkList();

        InterfaceItem ref = this.getTail();


        return list;
    }

}
