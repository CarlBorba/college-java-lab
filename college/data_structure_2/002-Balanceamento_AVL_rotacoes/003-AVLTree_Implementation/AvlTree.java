public class AvlTree {
    private Node root;

    private int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    private int getBalanceFactor(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private void updateHeight(Node node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    // --- Rotations ---

    // Right Rotation (LL Case)
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        updateHeight(y);
        updateHeight(x);

        return x; // New root of this subtree
    }

    // Left Rotation (RR Case)
    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        updateHeight(x);
        updateHeight(y);

        return y; // New root of this subtree
    }


    // --- Insertion ---

    // AQUI É UMA SOBRECARGA PARA QUE NÃO SEJA NECESSÁRIO FICAR PASSANDO A ROOT TODA HORA ???
    public void insert(int key) {
        this.root = insertRecursive(this.root, key);
    }

    private Node insertRecursive(Node node, int key) {
        // 1. Standard BST insertion
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insertRecursive(node.left, key);
        } else if (key > node.key) {
            node.right = insertRecursive(node.right, key);
        } else {
            return node; // Duplicate keys not allowed
        }

        // NO CASO ELE SÓ IRÁ PASSAR PARA ESSA PARTE SEGUINTE QUANDO FOR UMA FOLHA NÉ? OU SEJA NÃO POSSUI NÓ A DIREITA NEM A ESQUERDA PARA EXECUTAR NOVAMENTE A INSERÇÃO

        // AQUI ESTÁ ATUALIZANDO A ALTURA DA RAIZ ATUAL? ONDE O NÓ SERÁ INSERIDO ABAIXO DELA?
        // 2. Update height of current node
        updateHeight(node);

        // 3. Get balance factor to check if it became unbalanced
        int balance = getBalanceFactor(node);

        // Case 1: Left-Left (LL) -> Single Right Rotation
        if (balance > 1 && key < node.left.key) {
            return rotateRight(node);
        }

        // Case 2: Right-Right (RR) -> Single Left Rotation
        if (balance < -1 && key > node.right.key) {
            return rotateLeft(node);
        }

        // Case 3: Left-Right (LR) -> Left Rotation on child + Right Rotation on node
        if (balance > 1 && key > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Case 4: Right-Left (RL) -> Right Rotation on child + Left Rotation on node
        if (balance < -1 && key < node.right.key) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    // In-order traversal to verify sorting
    public void printInOrder() {
        printInOrderRecursive(this.root);
        System.out.println();
    }

    private void printInOrderRecursive(Node node) {
        if (node != null) {
            printInOrderRecursive(node.left);
            System.out.print(node.key + "(h=" + node.height + ", bf=" + getBalanceFactor(node) + ") ");
            printInOrderRecursive(node.right);
        }
    }
}