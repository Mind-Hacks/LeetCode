package patterns.Chain;


import patterns.Chain.model.Director;
import patterns.Chain.model.GeneralManager;
import patterns.Chain.model.Leader;
import patterns.Chain.model.Manager;

public class Client {

    public static void main(String[] args) {

        Leader director = new Director("张三");
        Leader manager = new Manager("李四");
        Leader gManager = new GeneralManager("王五");

        // 组织好责任链对象的关系
        director.setNextLeader(manager);
        manager.setNextLeader(gManager);

        // 开始请假操作
        LeaveRequest request = new LeaveRequest("倪升武", 15, "在家睡觉");
        director.handleRequest(request);
    }

}