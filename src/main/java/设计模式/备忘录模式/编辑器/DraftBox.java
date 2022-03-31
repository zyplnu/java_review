package 设计模式.备忘录模式.编辑器;

import java.util.Stack;

public class DraftBox {

    private final Stack<ArticleMemento> stack = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento memento = stack.pop();
        return memento;
    }

    public void addMemento(ArticleMemento articleMemento){
        stack.push(articleMemento);
    }


}
