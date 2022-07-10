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
        if (isEmptyS()){
            this.top = newNode;
        }else {
            this.top.next = newNode;
            this.top = newNode;
        }
    }

    public TreeNode pop(){
        if (isEmptyS()){
            return null;
        }else {
            StackNode temp = this.top;
            this.top = temp.next;
            temp.next = null;
            return  temp.node;
        }
    }

    public TreeNode peek(){
        if (isEmptyS()){
            return null;
        }else {
            return this.top.node;
        }
    }
}
