package list;

public class resource {
    private int id;
    private String name;
    private boolean inuse;

    public resource(int id, String name) {
        this.id = id;
        this.name = name;
        this.inuse = false;
    }

    public boolean getstatus() {
        return inuse;
    }

    public void changestatus() {
        inuse = (inuse == true) ? false : true;
    }

    @Override
    public String toString() {
        return "Resource:" + name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInuse() {
        return this.inuse;
    }

    public boolean getInuse() {
        return this.inuse;
    }

    public void setInuse(boolean inuse) {
        this.inuse = inuse;
    }

}
