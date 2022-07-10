public class Stack {
    StackNode top;

    Stack(){
        this.top = null;
    }

    boolean isEmptyS(){
        if (top == null){
            return true;
        }else {
            return false;
        }
    }

    public void push(TreeNode node){
        StackNode newNode = new StackNode(node);

    }
}
