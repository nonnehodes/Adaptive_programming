package Formatieve_opdracht_3a;

import java.util.ArrayList;
import java.util.List;

class BoomMethode {

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    List<Integer> boomMethodeOutput = new ArrayList<>();


    BoomMethode() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
        System.out.println(boomMethodeOutput);
    }

    void inorderRec(Node root) {
        if(root != null) {
            inorderRec(root.left);
            boomMethodeOutput.add(root.key);
            inorderRec(root.right);
        }
    }
}

//Bron: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/, door: geeksforgeeks
// ik heb nauwelijks tot niets zelf gemaakt in deze code, het enige wat ik heb aangepast zijn de print statements. en 2 regels code om items in een lijst te zetten. wel vond ik de code heel netjes gemaakt en is mischien een goed voorbeeld voor in de les?
// ik wist niet hoe ik deze code zelf moest schrijven vandaar dat ik hem gecopieerd heb :)