package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class O_35_PrintTreeNodeZ {
    public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) return result;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(pRoot);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) {
                ArrayList<Integer> list = new ArrayList<>();
                while (!stack1.isEmpty()) {
                    TreeNode tempNode = stack1.pop();
                    list.add(tempNode.val);
                    if (tempNode.left != null)
                        stack2.push(tempNode.left);
                    if (tempNode.right != null)
                        stack2.push(tempNode.right);
                }
                result.add(list);
            }
            if (!stack2.isEmpty()) {
                ArrayList<Integer> list = new ArrayList<>();
                while (!stack2.isEmpty()) {
                    TreeNode tempNode = stack2.pop();
                    list.add(tempNode.val);
                    if (tempNode.right != null)
                        stack1.push(tempNode.right);
                    if (tempNode.left != null)
                        stack1.push(tempNode.left);
                }
                result.add(list);
            }
        }
        return result;
    }
}
