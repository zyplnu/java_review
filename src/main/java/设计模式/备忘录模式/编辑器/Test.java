package 设计模式.备忘录模式.编辑器;

public class Test {
    public static void main(String[] args) {
        DraftBox draftBox = new DraftBox();

        Editor editor = new Editor("title", "hello", "http://123.url");

        ArticleMemento memento = editor.saveToMemento();
        System.out.println(memento);

        draftBox.addMemento(memento);

        System.out.println("修改文章---");

        editor.setTitle("title2");
        editor.setContent("hi");
        ArticleMemento articleMemento = editor.saveToMemento();
        draftBox.addMemento(articleMemento);
        System.out.println(articleMemento);
    }
}
