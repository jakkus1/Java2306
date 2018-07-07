package Java0707.Heap;

import java.util.Arrays;

public class Heap {
    private int[] tree;
    private int lastIndex;


    public Heap (int size) {
        this.tree = new int[size];
        this.lastIndex = 0;

    }


    public void add (int data){
        tree[lastIndex] = data;
        int i = lastIndex++;
        int tmp;
        int parent;
        while (i > 0){
            parent = getParent(i);
            if(tree[parent] < tree[i]) {
                tmp = tree[parent];
                tree[parent] = tree[i];
                tree[i] = tmp;
            }else{
                break;
            }
            i = parent;
        }

    }
    int getLeftChild(int index){
        return tree[getLeftChildIndex(index)];
    }
    int getRightChild(int index){
        return tree[getRightChildIndex(index)];
    }


    int getLeftChildIndex (int index) {
        if (isLeftChild(index)) {
            return 2 * index + 1;
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

    private boolean isLeftChild (int index) {
        return 2 * index + 1 < lastIndex;
    }


    int getRightChildIndex (int index) {
        if (isRightChild(index)) {
            return 2 * index + 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isRightChild(int index) {
        return (2 * index + 2) < lastIndex;
    }

    int getParent(int index) {
        if (index != 0) {
            return (index - 1) / 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    boolean isLeaf(int index) {
        return !isLeftChild(index);
    }

    @Override
    public String toString() {
        return Arrays.toString(tree);
    }
}

