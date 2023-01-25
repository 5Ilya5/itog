static void contPreOrder(Node top){
    Stack<Node> stack = new Stack<> (); 
    while (top!=null || !stack.empty()){
        if (!stack.empty()){
            top=stack.pop();
        }
        while (top!=null){
            top.treatment();
            if (top.right!=null) stack.push(top.right);
            top=top.left;
        }
    }
}