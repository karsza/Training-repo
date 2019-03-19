public class BinaryTree {

    Node root;

//    public void add(Node newNode) {
//        if (current != null) {
//            if (current.value > newNode.value) {
//                current.left = newNode;
//            }
//            else {
//                current.right = newNode;
//            }
//        } else current = newNode;
//    }
public void add(int value) {
    if (root != null) {
        if (root.value >=value) {
            root.left.value = value;
        }
        else {
            root.right.value = value;
        }
    }
    else root.value = value ;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinaryTree)) return false;
        BinaryTree binarytree = (BinaryTree) o;
        Node binarytree1;
        binarytree1 = this.root;
        Node binarytree2;
        binarytree2 = binarytree.root;
        while (binarytree1 != null && binarytree2 != null) {
            if (binarytree1.value != binarytree2.value)
                return false;
            if (binarytree1.left == null && binarytree2.left != null)
                return false;
            if (binarytree1.left != null && binarytree2.left == null)
                return false;
            if (binarytree1.right == null && binarytree2.right != null)
                return false;
            if (binarytree1.right != null && binarytree2.right == null)
                return false;
            else {
                binarytree1 = binarytree1.left;
                binarytree2 = binarytree2.left;
                binarytree1 = binarytree1.right;
                binarytree2 = binarytree2.right;
            }
        }
        return true;
    }
}
