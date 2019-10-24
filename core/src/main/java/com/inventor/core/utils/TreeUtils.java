package com.inventor.core.utils;

import com.inventor.core.interfaces.TreeNode;

import java.util.List;

public class TreeUtils <T extends TreeNode> {

    public boolean addToTree(long parenId, T newNode, List<T> treeList, List<T> plianlist) {
        if(parenId !=0) {
            for (T currentNode: plianlist ) {
                if(currentNode.getId()==parenId) {
                    currentNode.add(newNode);
                    return true;
                }
                else {
                    T node  = (T) recursiveSearch(parenId, currentNode);
                    if (node!=null) {
                        node.add(newNode);
                        return true;
                    }
                }
            }
        }
        treeList.add(newNode);
        return false;
    }
    private TreeNode recursiveSearch(long parenId, T child) {
        for (T node: (List<T>)child.getChilds()) {
            if(node.getId()==parenId) {
                return node;
            }
            else if (node.hasChilds()) {
                recursiveSearch(parenId,node);
            }
        }
        return null;
    }
}
