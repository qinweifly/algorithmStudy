package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行
 */
public class O_36_PrintTreeNodeRow {
    public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) return result;
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(pRoot);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            queueJudge(result, queue1, queue2);
            queueJudge(result, queue2, queue1);
        }
        return result;
    }

    private void queueJudge(ArrayList<ArrayList<Integer>> result, Queue<TreeNode> queueFirst, Queue<TreeNode> queueSecond) {
        if (!queueFirst.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            while (!queueFirst.isEmpty()) {
                TreeNode tempNode = queueFirst.poll();
                list.add(tempNode.val);
                if (tempNode.left != null)
                    queueSecond.offer(tempNode.left);
                if (tempNode.right != null)
                    queueSecond.offer(tempNode.right);
            }
            result.add(list);
        }
    }
}
