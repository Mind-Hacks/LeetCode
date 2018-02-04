package patterns.Interpreter;

public class Client {

    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");                             //创建变量
        Constant c = new Constant(true);                            //创建常量

        Expression exp = new Or(new And(c,x) , new And(y,new Not(x)));    //设置表达式

        ctx.assign(x, false);
        ctx.assign(y, true);                                        //给X Y 变量赋值
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));    //输出结果


        System.out.println("x=" + x.interpret(ctx));
        System.out.println("y=" + y.interpret(ctx));
    }

}