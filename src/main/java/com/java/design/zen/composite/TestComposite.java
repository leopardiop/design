package com.java.design.zen.composite;

public class TestComposite {
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        /*TreeNode root = new TreeNode("ROOT");
        TreeNode node11 = new TreeNode("NODE11");  
        TreeNode node12 = new TreeNode("NODE12");  
        TreeNode node1121 = new TreeNode("NODE1121");  
        TreeNode node1122 = new TreeNode("NODE1122");  
        TreeNode node1221 = new TreeNode("NODE1221");  
        TreeNode node1222 = new TreeNode("NODE1222");  
        root.addChildren(node11);  
        root.addChildren(node12);  
        node11.addChildren(node1121);  
        node11.addChildren(node1122);  
        node12.addChildren(node1221);  
        node12.addChildren(node1222);  
        System.out.println(root.toString());  */


        Tree tree = new TreeElement(0l,"根");
        Tree tree1 = new TreeElement(1l,"一级");
        Tree tree2 = new TreeElement(2l,"一级２");
        Tree tree3 = new TreeElement(3l,"二级");
        Tree tree4 = new TreeElement(4l,"二级２");
        Tree tree5 = new TreeElement(5l,"三级");

        tree.addChildren(tree1);
        tree.addChildren(tree2);

        tree1.addChildren(tree3);
        tree2.addChildren(tree4);

        tree4.addChildren(tree5);

        /*tree1.setParent(tree);
        tree2.setParent(tree);

        tree3.setParent(tree1);
        tree4.setParent(tree2);
        tree5.setParent(tree4);*/

        System.out.println(tree.toString());

    }  
  
} 