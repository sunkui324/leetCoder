package com.practice.leetCode.q0617_MergeTwoBinaryTrees;

import sun.reflect.generics.tree.Tree;

/**
 *   采用递归的方式 依次相加
 * @author bruce.sun
 * @date 2018/6/12
 * @param
 * @return
 *
 */
public class MergeTwoBinaryTreesSolution {



    public TreeNode mergeTrees(TreeNode t1,TreeNode t2){

        if(t1==null || t2==null){return t1==null?t2:t1;}
        int val=t1.val +t2.val;
        TreeNode newNode=new TreeNode(val);
        newNode.left =mergeTrees(t1.left,t2.left);
        newNode.right =mergeTrees(t1.right,t2.right);
        return newNode;
    }

    public TreeNode mergeTrees2(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null){return null;}
        if(t1==null || t2==null){return t1==null?t2:t1;}
        int val =(t1 ==null ?0:t1.val)+(t2 ==null ?0:t2.val);
        TreeNode newNode=new TreeNode(val);
        newNode.left =mergeTrees(t1 ==null?null:t1.left,t2==null?null:t2.left);
        newNode.right =mergeTrees(t1 ==null?null:t1.right,t2==null?null:t2.right);
        return newNode;
    }


    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}

    }
}
