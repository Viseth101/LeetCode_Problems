public class Tree {
    Object info;
    Tree left, right;
    public Tree(Object newInfo){
        this.info = newInfo;
        this.left = null;
        this.right = null;
    }
    public Tree(){
        this(null);
    }
    public void setInfo(Object newInfo){
        this.info = newInfo;
    }
    public void setLeft(Tree newNode){
        this.left = newNode;
    }
    public void setRight(Tree newNode){
        this.right = newNode;
    }
    
}
