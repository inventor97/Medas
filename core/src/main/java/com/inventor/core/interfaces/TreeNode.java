package com.inventor.core.interfaces;

import java.util.List;

public interface TreeNode <T extends TreeNode> {

    long getParentId();

    long getId();

    void setId(long id);

    void add(T child);

    void remove(T child);

    List<T> getChilds();

    T getChild(long id);

    T getParent();

    void setParent(T parent);

    boolean hasChilds();

    boolean hasParent();

}
