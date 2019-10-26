package LeetCode;

import java.util.*;

public class L297 {
        public static void main(String[] args){
            TreeNode root = new TreeNode(0);
            System.out.println(serialize(root));
        }
        public static String serialize(TreeNode root) {
            StringBuilder str = new StringBuilder("");
            Stack<TreeNode> stack = new Stack<>();
            TreeNode node = root;
            while (node != null || !stack.isEmpty()){
                while (node != null){
                    str.append(node.val + ",");
                    stack.push(node);
                    node = node.left;
                }
                str.append("null,");

                if (!stack.isEmpty()){
                    node = stack.pop();
                    node = node.right;
                }
            }
            str.append("null");
            return str.toString();
        }
        public TreeNode deserialize(String data) {
            String[] list = data.split(",");
            List<String> data_list = new LinkedList<String>(Arrays.asList(list));
            return Helper(data_list);
        }
        public TreeNode Helper(List<String> list){
            TreeNode node;
            String str = list.remove(0);
            if (str.equals("null")){
                return null;
            }else {
                node = new TreeNode(Integer.parseInt(str));
                node.left = Helper(list);
                node.right = Helper(list);
            }
            return node;
        }
}
