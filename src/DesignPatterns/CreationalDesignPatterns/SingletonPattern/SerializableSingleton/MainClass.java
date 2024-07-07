package DesignPatterns.CreationalDesignPatterns.SingletonPattern.SerializableSingleton;

import java.io.*;

public class MainClass {
	
    public static void main(String[] args) throws IOException, ClassNotFoundException {

		SerializableSingletonBad instance1 = SerializableSingletonBad.getInstance();

		// Write to file
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instance1);
		out.close();

		// Read from file
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializableSingletonBad instance2 = (SerializableSingletonBad) in.readObject(); // Singleton appraoch failed.
		in.close();

		System.out.println("SerializableSingletonBad instanceOne hashCode = "+instance1.hashCode());
		System.out.println("SerializableSingletonBad instanceTwo hashCode = "+instance2.hashCode());

		// ==================================================================================

		SerializableSingletonGood instance3 = SerializableSingletonGood.getInstance();

		// Write to file
		ObjectOutput out1 = new ObjectOutputStream(new FileOutputStream("filename1.ser"));
		out1.writeObject(instance3);
		out1.close();

		// Read from file
		ObjectInput in1 = new ObjectInputStream(new FileInputStream("filename1.ser"));
		SerializableSingletonGood instance4 = (SerializableSingletonGood) in1.readObject();
		in1.close();

		System.out.println("\nSerializableSingletonGood instanceOne hashCode = "+instance3.hashCode());
		System.out.println("SerializableSingletonGood instanceTwo hashCode = "+instance4.hashCode());
    }
}