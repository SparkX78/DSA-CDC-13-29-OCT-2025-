public class DSA_63 {
    static class BinaryTree{
        static class Node{
            int data;
            Node left, right;

            Node(int value){
            data = value;
            left = right = null;
            
            }
        }
        Node root;
        BinaryTree(){
            root = null;

        }

        void inorder(Node node){
            if(node == null){
                return;
            }
            inorder(node.left);
            System.out.println(node.data + " ");
            inorder(node.right);
        }
        void preorder(Node node){
            if(node == null){
                return;
            }
            System.out.println(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }

        void postorder(Node node){
            if(node == null){
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data + " ");
        }
        
    }

    public static void main(String args[]){
        BinaryTree btree = new BinaryTree();
        btree.root = new BinaryTree.Node(21);
        btree.root.left = new BinaryTree.Node(22);
        btree.root.right = new BinaryTree.Node(23);
        btree.root.left.left = new BinaryTree.Node(24);
        btree.root.left.right = new BinaryTree.Node(25);
        btree.root.left.left.left = new BinaryTree.Node(26);
        btree.root.left.right.right = new BinaryTree.Node(27);


        System.out.println("INORDER TRAVERSAL: ");
        btree.inorder(btree.root);
        System.out.println();

        System.out.println("PREORDER TRAVERSAL; ");
        btree.preorder(btree.root);
        System.out.println();

        System.out.println("POSTORDER TRAVERSAL; ");
        btree.preorder(btree.root);
        System.out.println();

    }
}
