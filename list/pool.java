package list;

import java.util.*;

public class pool {
    private int id;
    private int limit;
    private HashSet<resource> totalpool;
    private HashSet<resource> using;

    public pool(int id, int limit) {
        this.id = id;
        this.limit = limit;
        this.totalpool = new HashSet<>();
        this.using = new HashSet<>();
    }

    public void addres(resource r) {
        if (totalpool.size() == limit) {
            System.out.println("Couldnt add new resource");
            return;
        }
        totalpool.add(r);
        System.out.println(r + " added to pool");
    }

    public void remove(resource r) {
        totalpool.remove(r);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLimit() {
        return this.limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public HashSet<resource> getTotalpool() {
        return this.totalpool;
    }

    public void setTotalpool(HashSet<resource> totalpool) {
        this.totalpool = totalpool;
    }

    public HashSet<resource> getUsing() {
        return this.using;
    }

    public void setUsing(HashSet<resource> using) {
        this.using = using;
    }

}
