static void contLevelOrder(Node top){
    Queue<Node> queue=new LinkedList<> ();
    do{
        top.treatment();
        if (top.left!=null) queue.add(top.left);
        if (top.right!=null) queue.add(top.right);
        if (!queue.isEmpty()) top=queue.poll();
    }while (!queue.isEmpty());
}