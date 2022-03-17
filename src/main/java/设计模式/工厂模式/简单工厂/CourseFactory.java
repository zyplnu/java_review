package 设计模式.工厂模式.简单工厂;

public class CourseFactory {

    /**
     * Class 使用泛型，保证在return前可以返回ICourse类型的对象，安全机制
     * @param clazz
     * @return
     */
    public static ICourse create(Class<? extends ICourse> clazz){
        if(null != clazz){
            try {
                return (ICourse) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
