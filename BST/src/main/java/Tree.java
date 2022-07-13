public class Tree {
    TreeNode root;

    Tree(){
        this.root = null;
    }

    void insertNode(char letter){
        TreeNode newNode = new TreeNode(letter);
        this.root = insert(this.root,newNode);
    }

    private TreeNode insert(TreeNode root,TreeNode newNode){
        if (root == null){
            root = newNode;
            return  root;
        }else if(newNode.letter <= root.letter){
            root.left = insert(root.left,newNode);
        }else if(newNode.letter > root.letter){
            root.right = insert(root.right,newNode);
        }
        return root;
    }

    public void DFS(char letter){
        if (this.root == null){
            System.out.printf("Empty");
        }else {
            Stack stack = new Stack();
            stack.push(this.root);

            while (!stack.isEmptyS()){
                TreeNode temp = stack.pop();
                System.out.printf("--> " +temp.letter);

                if (temp.letter == letter){
                    System.out.printf("letter found : " +temp.letter);
                    return;
                }
                if (temp.right!= null){
                    stack.push(temp.right);
                }
                if (temp.left!=null){
                    stack.push(temp.left);
                }
            }
        }
        System.out.printf("Value not found");
    }

    public void BFS(char letter){
        if(this.root == null){
            System.out.printf("Empty");
        }else{
            Queue queue = new Queue();
            queue.enqueue(this.root);

            while (!queue.isEmpty()){
                TreeNode temp = queue.dequeue();
                System.out.printf("--> " +temp.letter);

                if (temp.letter == letter){
                    System.out.printf("letter found : " +temp.letter);
                    return;
                }
                if (temp.left!=null){
                    queue.enqueue(temp.left);
                }
                if (temp.right!=null){
                    queue.enqueue(temp.right);
                }
            }
        }
        System.out.printf("Value not found");
    }
}
