//import jdk.internal.jline.internal.TestAccessible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BinaryTreeTest {
@Test
    public void equals(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.current = new Node(5);
        binaryTree.current.left = new Node(2);
        binaryTree.current.right = new Node(4);
        BinaryTree expectedBinaryTree = new BinaryTree();
        expectedBinaryTree.current = new Node(5);
        expectedBinaryTree.current.left = new Node(2);
        expectedBinaryTree.current.right = new Node (4);

        assertTrue(expectedBinaryTree.equals(binaryTree));
        assertEquals(expectedBinaryTree,binaryTree);

        binaryTree.current.value = 10;
        assertNotEquals(binaryTree,expectedBinaryTree);
    }
    @Test
    void equalsOfTwoEmptyTrees(){
        BinaryTree binaryTree1 = new BinaryTree();
        BinaryTree binaryTree2 = new BinaryTree();

        assertEquals(binaryTree2,binaryTree1);
    }
    @Test
    void addToBinaryTree(){
        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.add(5);
        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.current.value = 7;
        assertNotEquals(binaryTree2,binaryTree1);

    }
}