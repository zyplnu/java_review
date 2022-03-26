package 设计模式.委派模式.简单demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 委托模式一般结合策略模式使用，初始化时构造map
 * Leader将逻辑委托给员工和员工B
 */
public class Leader implements IEmployee {

    private Map<String , IEmployee> employeeMap = new HashMap<>();

    public Leader(){
        employeeMap.put("爬虫" , new EmployeeA());
        employeeMap.put("海报" , new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if(employeeMap.containsKey(task)){
            employeeMap.get(task).doing(task);
        }

    }
}
