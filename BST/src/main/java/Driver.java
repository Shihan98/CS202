public class Driver {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insertNode('q');
        tree.insertNode('w');
        tree.insertNode('e');
        tree.insertNode('r');
        tree.insertNode('t');
        tree.insertNode('g');
        tree.insertNode('h');
        tree.insertNode('s');
        tree.insertNode('m');
        tree.insertNode('a');
        tree.insertNode('p');
        tree.insertNode('u');

        tree.DFS('u');
        System.out.printf("\n");
        tree.BFS('m');

    }
}
