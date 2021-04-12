package designmodel.structure;

import java.util.ArrayList;
import java.util.List;

public class MergeMode {

    private static class File{

        public void list(){
            System.out.printf("file");
        }
    }

    public static class Dictionary extends File{
        List<File> fileList = new ArrayList<>();

        public void addFile(File file){
            fileList.add(file);
        }

        public void list(){
            for (File file : fileList) {
                file.list();
            }
        }
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addFile(new File());
        dictionary.list();
    }
}
