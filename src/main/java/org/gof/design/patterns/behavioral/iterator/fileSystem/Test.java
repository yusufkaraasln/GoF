
package org.gof.design.patterns.behavioral.iterator.fileSystem;


import org.gof.design.patterns.behavioral.iterator.fileSystem.iterator.DirectoryIterator;

public class Test {

    public static void main(String[] args) {
        Directory userDir = new Directory("C:\\Users\\Yusuf");
        userDir.list();

        Directory devDir = new Directory("\\Desktop", userDir); // \Users\Yusuf\Desktop win dir
        File file1 = new File("Readme.txt", devDir);
        File file2 = new File("Report.docs", devDir);
        File file3 = new File("Example.js", devDir);


        System.out.println("\nIterating");
        DirectoryIterator iterator = devDir.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


    }
}
