public class Start {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        // Inserting elements that would create an unbalanced BST in standard insertion
        int[] keys = {10, 20, 30, 40, 50, 25};

        for (int key : keys) {
            System.out.println("Inserting: " + key);
            tree.insert(key);
        }

        System.out.print("\nIn-order Traversal [Key(height, balance_factor)]: ");
        tree.printInOrder();
    }
}