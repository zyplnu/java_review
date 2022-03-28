package 设计模式.迭代器模式;

public class Test {
    public static void main(String[] args) {
        Course java = new Course("Java");
        Course javaBase = new Course("Java基础");

        ICourseAggregate aggregate = new CourseAggregateImpl();
        aggregate.add(java);
        aggregate.add(javaBase);


        printCourse(aggregate);
    }

    private static void printCourse(ICourseAggregate aggregate){
        Iterator<Course> it = aggregate.iterator();
        while (it.hasNext()){
            Course course = it.next();
            System.out.println(course);
        }
    }
}
