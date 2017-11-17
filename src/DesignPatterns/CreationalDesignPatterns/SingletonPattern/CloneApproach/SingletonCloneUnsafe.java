package DesignPatterns.CreationalDesignPatterns.SingletonPattern.CloneApproach;


class SingletonCloneUnsafe implements Cloneable {

    private SingletonCloneUnsafe() {}

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private static class SingletonHelper {
        public static final SingletonCloneUnsafe
            instance = new SingletonCloneUnsafe();
    }

    public static SingletonCloneUnsafe getInstance(){
        return SingletonCloneUnsafe.SingletonHelper.instance;
    }
}
