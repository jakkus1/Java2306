package Java0707.Heap;

import java.util.Arrays;

public class Heap {
    private int[] tree;
    private int lastIndex;


    public Heap (int size) {
        this.tree = new int[size];
        this.lastIndex = 0;

    }


    public void add (int index) {
        tree[lastIndex] = index;
        int i = lastIndex++;
        int tmp;
        int parent;
        while (i > 0) {
            parent = getParent(i);
            if (tree[parent] < tree[i]) {
                tmp = tree[parent];
                tree[parent] = tree[i];
                tree[i] = tmp;
            } else {
                break;
            }
            i = parent;
        }

    }

    int getLeftChild (int index) {
        return tree[getLeftChildIndex(index)];
    }

    int getRightChild (int index) {
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

    private boolean isRightChild (int index) {
        return (2 * index + 2) < lastIndex;
    }

    int getParent (int index) {
        if (index != 0) {
            return (index - 1) / 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    boolean isLeaf (int index) {
        return !isLeftChild(index);
    }

    @Override
    public String toString () {
        return Arrays.toString(Arrays.copyOfRange(tree, 0, lastIndex));
    }

   public int remove (int index) {
        int parent;
        int r;

        r = tree[index];

        tree[index] = tree[lastIndex-1];

        lastIndex--;

        parent = (index - 1) / 2;


        if (index  == 0 || tree[parent] < tree[index])
            HeapMoveDown(index);
        else
            HeapMoveUp(index);

        return r;

    }

    void HeapMoveUp (int index) {
        int parent;
        int help;

        while (index != 0) {

            parent = (index - 1) / 2;

            if (tree[index] < tree[parent]) {
                help = tree[parent];
                tree[parent] = tree[index];
                tree[index] = help;


                index = parent;
            } else {
                break;
            }

        }
    }

    void HeapMoveDown (int index) {

        {
            int child1;
            int child2;
            int help;


            while (2 * index + 1 <= lastIndex ) {
                child1 = 2 * index + 1;                 // lewe dziecko
                child2 = 2 * index + 2;               // prawe dziecko

                if (child2 <= lastIndex) {

                    if (tree[index] < tree[child1] && tree[index] < tree[child2]) {

                        break;
                    } else {

                        if (tree[child1] < tree[child2]) {

                            help = tree[index];
                            tree[index] = tree[child1];
                            tree[child1] = help;

                            index = child1;
                        } else {

                            help = tree[index];
                            tree[index] = tree[child2];
                            tree[child2] = help;

                            index = child2;
                        }
                    }
                } else {

                    if (tree[index] < tree[child1]) {

                        break;
                    } else {

                        help = tree[index];
                        tree[index] = tree[child1];
                        tree[child1] = help;

                        index = child1;
                    }
                }
            }
        }

    }




}

