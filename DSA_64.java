import java.util.*;
public class DSA_64 {
    static class Node{
        int value;
        Node left, right;
        Node(int data){
            value = data;
            left=right = null;
        }

        public static List<List<Integer>> level_Traversal(Node root){
            LinkedList<List<Integer>> result = new LinkedList<>();
            if(root == null){
                return result;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            
            while(!queue.isEmpty()){
                
                int size = queue.size();
                List<Integer> level = new ArrayList<>();
                for(int i = 0 ; i < size; i++){
                    Node node = queue.poll();
                    level.add(node.value);
                    if(node.left != null) queue.offer(node.left);
                    if(node.right != null) queue.offer(node.right);
                }
                result.add(level);

            }
            return result;

        }
        public static void main(String args[]){
            Node root = new Node(3);
            root.left = new Node(9);
            root.right = new Node(20);
            root.right.left = new Node(15);
            root.right.right = new Node(7);

            List<List<Integer>> result = level_Traversal(root);
            System.out.println(result);
            
            

        }

    }
}
