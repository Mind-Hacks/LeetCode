package patterns.Interpreter;

public class Client {

    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        ctx.assign(x, false);
        ctx.assign(y, true);        //给X Y 变量赋值

        Constant c = new Constant(true);

        Expression exp = new Or(new And(c,x) , new And(y,new Not(x)));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));


        System.out.println("x=" + x.interpret(ctx));
        System.out.println("y=" + y.interpret(ctx));
    }

}