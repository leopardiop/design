package com.java.design.zen.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {

    private String name;  
    private TreeNode parent;  
    private Vector<TreeNode> children = new Vector<TreeNode>();
  
    public TreeNode(String name) {  
        this.name = name;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public TreeNode getParent() {  
        return parent;  
    }  
  
    public void setParent(TreeNode parent) {  
        this.parent = parent;  
    }  
  
    /** 
     * 添加子节点 
     *  
     * @param node 
     */  
    public void addChildren(TreeNode node) {  
        children.add(node);  
        node.setParent(this);  
    }  
  
    /** 
     * 删除子节点 
     *  
     * @param node 
     */  
    public void removeChildren(TreeNode node) {  
        children.remove(node);  
    }  
  
    /** 
     * 获得子节点 
     *  
     * @return 
     */  
    public Enumeration<TreeNode> getChildren() {
        return children.elements();  
    }  
  
    @Override  
    public String toString() {  
        return "TreeNode [parent=" + (null == parent ? "" : parent.getName()) +  
            ", name=" + name + ", children" + children.toString() + "]";
    }  
      
}