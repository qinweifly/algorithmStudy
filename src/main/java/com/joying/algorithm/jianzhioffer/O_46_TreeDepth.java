package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class O_46_TreeDepth {
    /**
     * 采用递归算法求解
     *
     * @param root
     * @return
     */
    public int treeDepthByRecursion(TreeNode root) {
        if (root == null) return 0;
        int left = treeDepthByRecursion(root.left);
        int right = treeDepthByRecursion(root.right);
        return 1 + Math.max(left, right);
    }

    /**
     * 通过借助队列来实现计算树深
     * @param root
     * @return
     */
    public int treeDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size;
        int high = 0;
        TreeNode tempNode;
        while (queue.size() != 0) {
            size = queue.size();
            while (size != 0) {
                tempNode = queue.poll();
                if (tempNode.left != null)
                    queue.offer(tempNode.left);
                if (tempNode.right != null)
                    queue.offer(tempNode.right);
                size--;
            }
            high++;
        }
        return high;
    }
}
