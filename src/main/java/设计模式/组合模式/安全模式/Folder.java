package 设计模式.组合模式.安全模式;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Directory {

    private List<Directory> dirs;

    private int level;

    public Folder(String name , int level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<>();
    }

    @Override
    public void show() {

    }

    public  boolean add(Directory dir){
        return this.dirs.add(dir);
    }

    public  boolean remove(Directory dir){
        return this.dirs.remove(dir);
    }

    public Directory get(int index){
        return this.dirs.get(index);
    }
}
