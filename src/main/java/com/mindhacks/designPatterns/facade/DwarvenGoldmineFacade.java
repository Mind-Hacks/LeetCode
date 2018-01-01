package com.mindhacks.designPatterns.facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Applicability
 * （1）为复杂的模块或子系统提供外界访问的模块。
 （2）子系统相对独立。
 （3）在层次化结构中，可以使用外观模式定义系统中每一层的入口。
 * https://www.cnblogs.com/lthIU/p/5860607.html
 */
public class DwarvenGoldmineFacade {

    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldmineFacade() {
        workers = new ArrayList<DwarvenMineWorker>();
        workers.add(new DwarvenGoldDigger());   //金矿挖掘机
        workers.add(new DwarvenCartOperator()); //矿车操作员
        workers.add(new DwarvenTunnelDigger()); //隧道挖掘机
    }

    public void startNewDay() {
        makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, DwarvenMineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
    }

    private static void makeActions(Collection<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions) {
        for (DwarvenMineWorker worker : workers) {      //传入一个工人，多个行为
            worker.action(actions);
        }
    }

    public static void main(String[] args) {
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();

        System.out.println("======起床了=========");
        facade.startNewDay();

        System.out.println("======开工了=========");
        facade.digOutGold();

        System.out.println("======下工了=========");
        facade.endDay();

        DwarvenCartOperator cartOperator=new DwarvenCartOperator();
        cartOperator.action( DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }
}