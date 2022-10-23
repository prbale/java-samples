package InterviewPrograms.LeftViewBinaryTree;

import java.util.*;

class Node {

    public int data;
    Node leftNode;
    Node rightNode;

    Node(int val) {
        data = val;
        leftNode = null;
        rightNode = null;
    }
}

class ViewOfBinaryTree {

    private void traverseTree(Node node, int level, LinkedHashMap<Integer, Integer> indexLevelHashMap) {
        if(node != null) {

            if(!indexLevelHashMap.containsKey(level)) {
                indexLevelHashMap.put(level, node.data);
            }

            traverseTree(node.leftNode, level+1, indexLevelHashMap);
            traverseTree(node.rightNode, level+1, indexLevelHashMap);
        }
    }

    public static void main(String args[]) {

        ViewOfBinaryTree treeDemo = new ViewOfBinaryTree();
        Node node = treeDemo.prepareTree();

        LinkedHashMap<Integer, Integer> indexLevelHashMap = new LinkedHashMap<>();

        treeDemo.traverseTree(node, 1, indexLevelHashMap);

        treeDemo.printResult(indexLevelHashMap);
    }

    private void printResult(LinkedHashMap<Integer, Integer> indexLevelHashMap) {
        Set<Integer> keys = indexLevelHashMap.keySet();
        for(Integer key: keys) {
            System.out.println(indexLevelHashMap.get(key) + " ");
        }
    }

    private Node prepareTree() {
        Node rootNode = new Node(10);
        Node node7 = new Node(7);
        Node node5 = new Node(5);
        Node node8 = new Node(8);
        Node node15 = new Node(15);
        Node node13 = new Node(13);
        Node node21 = new Node(21);
        Node node12 = new Node(12);
        Node node14 = new Node(14);
        Node node20 = new Node(20);
        Node node24 = new Node(24);
        Node node22 = new Node(22);
        Node node27 = new Node(27);

        rootNode.leftNode = node7;
        rootNode.rightNode = node15;
        node7.leftNode = node5;
        node7.rightNode = node8;
        node15.leftNode = node13;
        node15.rightNode = node21;
        node13.leftNode = node12;
        node13.rightNode = node14;
        node21.leftNode = node20;
        node21.rightNode = node24;
        node24.leftNode = node22;
        node24.rightNode = node27;

        return rootNode;
    }
}
