package DesignPatterns.CreationalDesignPatterns.SingletonPattern.CloneApproach;

/**
 * Description: Avoid singleton property violation using "clone"
 * Using this approach, we will not allow to use clone on our singleton class. If any developer,
 * tries to do the same then there will be compiler issue.
 * for eg.
 * <code>SingletonCloneApproachSecond anotherInstance = (SingletonCloneApproachSecond)
 * instance.clone();</code>
 * This will throw below error:
 * <code>Unhandled exception: java.lang.CloneNotSupportedException</code>
 *
 * Created by Prashant on 11-10-2017.
 */
class SingletonCloneApproachSecond implements Cloneable {

    private SingletonCloneApproachSecond() {}

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    private static class SingletonHelper {
        public static final SingletonCloneApproachSecond
            instance = new SingletonCloneApproachSecond();
    }

    public static SingletonCloneApproachSecond getInstance(){
        return SingletonCloneApproachSecond.SingletonHelper.instance;
    }
}
