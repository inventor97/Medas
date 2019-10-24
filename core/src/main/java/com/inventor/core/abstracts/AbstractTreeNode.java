package com.inventor.core.abstracts;

import com.inventor.core.interfaces.TreeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTreeNode <T extends TreeNode> implements TreeNode<T> {
    private long id = -1;
    private List<T> childs = new ArrayList<>();
    private T parent;
    private String name;
    private long parentId;


    public AbstractTreeNode() {
    }

    public AbstractTreeNode(String name) {
        this.name = name;
    }

    public AbstractTreeNode(List<T> childs) {
        this.childs = childs;
    }

    public AbstractTreeNode(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public AbstractTreeNode(long id, List<T> childs, T parent, String name) {
        this.id = id;
        this.childs = childs;
        this.parent = parent;
        this.name = name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }


    @Override
    public void add(T child) {
        child.setParent(this);
        childs.add(child);
    }

    @Override
    public void remove(T child) {
        childs.remove(child);
    }

    @Override
    public List<T> getChilds() {
        return childs;
    }

    @Override
    public T getChild(long id) {
        for (T child : childs) {
            if (child.getId() == id) {
                return child;
            }
        }
        return null;
    }

    @Override
    public T getParent() {
        return parent;
    }

    @Override
    public void setParent(T parent) {
        this.parent = parent;
    }

    @Override
    public boolean hasChilds() {
        return childs !=null && !childs.isEmpty();
    }

    @Override
    public boolean hasParent() {
        return parent!=null;
    }

}
