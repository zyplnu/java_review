package 设计模式.组合模式.安全模式;

public class Test {
    public static void main(String[] args) {
        File qq = new File("QQ.exe");
        File wx = new File("WX.exe");

        Folder office = new Folder("办公软件" , 2);
        File word = new File("word.exe");
        File ppt = new File("ppt.exe");

        office.add(word);
        office.add(ppt);

        Folder root = new Folder("D盘" , 1);
        root.add(qq);
        root.add(wx);
        root.add(office);
        root.show();
    }
}
