package DesignPatterns.CreationalDesignPatterns.SingletonPattern.CloneApproach;

/**
 * Description: Avoid singleton property violation using "clone"
 * Using this approach, we will allow to use clone on our singleton class. But it will call the
 * getInstance() method of the same class which will eventually returns the singleton object which
 * was already created. Hence maintaining the singleton property.
 *
 * for eg.
 * <code>SingletonCloneApproachSecond anotherInstance = (SingletonCloneApproachSecond)
 * instance.clone();</code>
 * Which will gives you the same object which was created earlier. You can cross verify the same
 * by printing the hashcode of the object.
 *
 * Created by Prashant on 11-10-2017.
 */
class SingletonCloneApproachFirst implements Cloneable {

    private SingletonCloneApproachFirst() {}

    protected Object clone()
    {
        return getInstance();
    }

    private static class SingletonHelper {
        public static final SingletonCloneApproachFirst
            instance = new SingletonCloneApproachFirst();
    }

    public static SingletonCloneApproachFirst getInstance(){
        return SingletonCloneApproachFirst.SingletonHelper.instance;
    }
}
