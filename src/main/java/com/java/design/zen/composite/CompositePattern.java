package com.java.design.zen.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * 组合模式：组合多个对象形成树形结构以表示具有“整体—部分”关系的层次结构。
 * 组合模式对单个对象（即叶子对象）和组合对象（即容器对象）的使用具有一致性。
 */
public class CompositePattern {
    public static void main(String[] args) {
        IMessage forum = new Forum("灌水区", "admin");
        IMessage m1 = new PostMessage("张三", "大象进医院了！！！");
        IMessage m2 = new PostMessage("李四", "怎么可能？");
        IMessage m3 = new PostMessage("张三", "怎么不可能？！大象踩着蚂蚁，然后骨折了！！！");
        m1.add(m2);
        m2.add(m3);
        forum.add(m1);
        forum.print();
    }
}
/**
 * 论坛版块，帖子抽象接口。
 */
interface IMessage{
    public void add(IMessage message);
    public void delete(int i);
    public IMessage getChild(int i);
    public void print();
}
/**
 * 论坛帖子：原始帖或回帖
 */
class PostMessage implements IMessage{
    private String content; //内容
    private String author; //发帖人
    private List<IMessage> messages = new ArrayList<IMessage>();//回帖
     
    public PostMessage(String author,String content){
        this.author = author;
        this.content = content;
    }
     
    @Override
    public void add(IMessage message) {
        messages.add(message);
    }
 
    @Override
    public void delete(int i) {
        if(i>messages.size()){
            throw new IllegalArgumentException("索引越界...");
        }
        messages.remove(i);
    }
 
    @Override
    public IMessage getChild(int i) {
        return messages.get(i);
    }
     
    @Override
    public void print() {
        System.out.println(author+"说："+content);
        //递归调用成员构件的业务方法实现
        for(IMessage message : messages){
            message.print();
        }
    }
}
/**
 * 论坛版块：由相应帖子组成
 */
class Forum implements IMessage{
    private String name; //版块名
    private String admin;//版主
    private List<IMessage> messages = new ArrayList<IMessage>();//帖子
     
    public Forum(String name,String admin){
        this.name = name;
        this.admin = admin;
    }
     
    @Override
    public void add(IMessage message) {
        messages.add(message);
    }
 
    @Override
    public void delete(int i) {
        if(i>messages.size()){
            throw new IllegalArgumentException("索引越界...");
        }
        messages.remove(i);
    }
 
    @Override
    public IMessage getChild(int i) {
        return messages.get(i);
    }
 
    @Override
    public void print() {
        System.out.println("版块："+name+",管理员："+admin);
        System.out.println("帖子内容：");
        //递归调用成员构件的业务方法实现
        for(IMessage message : messages){
            message.print();
        }
    }
}