package 设计模式.原型模式.浅拷贝;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(12);
        concretePrototypeA.setName("zhangsan");
        List hohhies = new ArrayList();
        concretePrototypeA.setHobbies(hohhies);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA)client.startClone(concretePrototypeA);
        System.out.println(concretePrototypeA.getHobbies());
        System.out.println(copy.getHobbies());
        System.out.println(concretePrototypeA.getHobbies() == copy.getHobbies());
    }
}
