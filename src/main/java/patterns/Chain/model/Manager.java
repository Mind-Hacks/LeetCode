package patterns.Chain.model;


import patterns.Chain.LeaveRequest;

//经理
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {

        int days = request.getLeaveDays(); //获取请假天数
        String name = request.getName(); //获取请假人姓名
        String reason = request.getReason(); // 获取请假理由

        if(days <= 10) { //如果满足10天内的要求，经理直接审批
            System.out.println("员工" + name + "请假" + days + "天，理由：" + reason);
            System.out.println("经理" + this.name + "审批通过");
        } else {
            System.out.println("请假天数过多，经理" + this.name + "没法处理");
            if(this.nextLeader != null) { //否则，如果链上存在下一个Leader，就让他处理
                this.nextLeader.handleRequest(request);
            } 
        }
    }

}