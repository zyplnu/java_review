package 设计模式.原型模式.深拷贝;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        QiTianDaSheng copy = (QiTianDaSheng) qiTianDaSheng.clone();

        System.out.println(qiTianDaSheng == copy);
    }
}
