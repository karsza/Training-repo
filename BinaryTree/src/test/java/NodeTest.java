import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void equals_simple() {
        Node a = new Node(1);
        Node b = new Node(1);

        assertTrue(Node.equals(a, b));
        assertTrue(Node.equals(b, b));
    }
    @Test
    void not_equals_simple() {
        Node a = new Node(1);
        Node b = new Node(2);

        assertFalse(Node.equals(a, b));
    }
    @Test
    void equals_complex() {
        Node a1 = new Node(1);
        Node a2 = new Node(0);
        Node a3 = new Node(2);
        a1.left = a2;
        a1.right = a3;

        Node b1 = new Node(1);
        Node b2 = new Node(0);
        Node b3 = new Node(2);
        b1.left = b2;
        b1.right = b3;

        assertTrue(Node.equals(a1, b1));
        assertFalse(Node.equals(a1, b3));
    }
    @Test
    void insert(){
        Node a1 = new Node (2);
        Node a2 = new Node (2);

        a2.left = new Node(1);
        a2.left.left = new Node(-1);

        a1.insert(1);
        a1.insert(-1);

        assertTrue(Node.equals(a1,a2));
    }
    @Test
    void printTree() {
        Node a1 = new Node(5);
        a1.insert(4);
        a1.insert(8);
        a1.insert(6);

        String expected = "4 5 6 8 ";
        assertEquals(expected, a1.printTree());
    }
}