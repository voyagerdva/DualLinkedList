package ru.zhuravl;

public class DualLinkListA extends LinkListA implements InterfaceDualListA {
    class DualNodeA extends LinkListA.NodeA implements InterfaceDualItemA {

        DualLinkListA.DualNodeA previous;

        DualNodeA(ObjectA value, DualNodeA next, DualNodeA previous) {
            super(value, next);
            this.previous = previous;
        }

        @Override
        public InterfaceDualItemA getPrevious() {
            return previous;
        }
    }


//==============================================================================
    @Override
    public void add(ObjectA data) {
        super.add(data);
    }

    @Override
    protected InterfaceItemA createNode(ObjectA data) {
        if (super.getTail() == null) {
            return new DualLinkListA.DualNodeA(data, (DualNodeA) null, (DualNodeA) null);
        } else {
            return new DualLinkListA.DualNodeA(data, (DualNodeA) null, (DualNodeA) getHead());
        }
    }

    @Override
    public InterfaceDualListA intersect(DualLinkListA dualLinkList) {
        DualLinkListA list3 = (DualLinkListA) super.intersect(dualLinkList);
        return list3;
    }

    protected InterfaceDualListA createList() {
        return new DualLinkListA();
    }

    @Override
    public void printDualListA() {
        InterfaceDualItemA ref = (InterfaceDualItemA) getTail();
        for (int i = 0; i < getSize(); i++) {
            System.out.printf("%-25s %-35s\n", "getValue():", ref.getValue());
            System.out.printf("%-25s %-35s\n", "Node:", ref);
            System.out.printf("%-25s %-35s\n", "getPrevious():", ref.getPrevious());
            System.out.printf("%-25s %-35s\n", "getNext():", ref.getNext());
            System.out.println("-------------");
            ref = (InterfaceDualItemA) ref.getNext();
        }
    }

//===================================================================================

    @Override
    public InterfaceDualListA getSublist(int position, int number) {
        return new DualLinkListA();
    }
}





















