public class Node {

    Node left;
    Node right;
    int value;


    public Node(int value) {
        this.value = value;
    }

    public void insert(int data){
        if (data<=value) {
            if (left == null) {
                left = new Node(data);
            } else left.insert(data);
        }
        else {
            if (right == null){
                right= new Node (data);
            } else right.insert(data);
        }
    }
    public String printTree() {
        String result="";
        if (left != null){
            result = left.printTree();
        }
        result = result + value + " ";
        if (right !=null){
            result = result + right.printTree();
        }
        return result;
    }
    //https://stackoverflow.com/questions/9597188/the-most-efficient-way-to-test-two-binary-trees-for-equality
    public static boolean equals(Node a, Node b) {
        // check for reference equality and nulls
        if (a == b) return true; // note this picks up case of two nulls
        if (a == null) return false;
        if (b == null) return false;

        // check for data inequality
        if (a.value != b.value) {
            //if ((a.value == null) || (b.value == null)) return false;
            //if (!(a.value == b.value)) return false;
            return false;
        }
        // recursively check branches
        if (!equals(a.left, b.left)) return false;
        if (!equals(a.right, b.right)) return false;

        // we've eliminated all possibilities for non-equality, so trees must be equal
        return true;
    }
}
