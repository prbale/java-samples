package DesignPatterns.CreationalDesignPatterns.SingletonPattern.CloneApproach;

import java.io.IOException;

public class MainClass {
	
    public static void main(String[] args)
				throws IOException, ClassNotFoundException, CloneNotSupportedException {

		SingletonCloneApproachSecond instance = SingletonCloneApproachSecond.getInstance();

		// Below line will give compile time error.
		// SingletonCloneApproachSecond anotherInstance = (SingletonCloneApproachSecond) instance.clone();

			SingletonCloneUnsafe instance1 = SingletonCloneUnsafe.getInstance();
			SingletonCloneUnsafe instance2 = (SingletonCloneUnsafe) instance1.clone();

			System.out.println("------- Clone Unsafe : Start ---------------");
			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
			System.out.println("------- Clone Unsafe : End ---------------\n\n");

			SingletonCloneApproachFirst instance3 = SingletonCloneApproachFirst.getInstance();
		SingletonCloneApproachFirst instance4 = (SingletonCloneApproachFirst) instance3.clone();

		System.out.println("instance1 hashCode:- " + instance3.hashCode());
		System.out.println("instance2 hashCode:- " + instance4.hashCode());
	}
}