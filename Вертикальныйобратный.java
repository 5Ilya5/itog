static void contInOrder(Node top){
    Stack<Node> stack = new Stack<> (); 
    while (top!=null || !stack.empty()){
        if (!stack.empty()){
            top=stack.pop();
            top.treatment();
            if (top.right!=null) top=top.right;
            else top=null;
        }
        while (top!=null){
            stack.push(top);
            top=top.left;
        }
    }
}