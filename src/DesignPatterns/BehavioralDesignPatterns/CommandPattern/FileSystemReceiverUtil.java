package DesignPatterns.BehavioralDesignPatterns.CommandPattern;

import DesignPatterns.BehavioralDesignPatterns.CommandPattern.FileSystem.FileSystemReceiver;
import DesignPatterns.BehavioralDesignPatterns.CommandPattern.FileSystem.UnixFileSystemReceiver;
import DesignPatterns.BehavioralDesignPatterns.CommandPattern.FileSystem.WindowsFileSystemReceiver;

/**
 * Created by Prashant on 17-07-2017.
 */

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {

        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is : " + osName);
        if( osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        }
        else {
            return new UnixFileSystemReceiver();
        }
    }
}