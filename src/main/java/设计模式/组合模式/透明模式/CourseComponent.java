package 设计模式.组合模式.透明模式;

public abstract class CourseComponent {

    public void addChild(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }
    public void removeChild(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }
    public String getName(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持获取名字操作");
    }
    public double getPrice(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }
}
