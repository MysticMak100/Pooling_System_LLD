package list;

public class user {
    private int id;
    private String name;

    public user(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void acquire_resource(resource r, pool p) {
        if (p.getTotalpool().contains(r)) {
            if (p.getUsing().contains(r)) {
                System.out.println("resource already in use");
                return;
            } else {
                System.out.println(r + " a quired by " + this);
                p.getUsing().add(r);
                r.changestatus();
            }
        } else {
            System.out.println("resource does not exist");
        }
    }

    public void release_resource(resource r, pool p) {
        p.getUsing().remove(r);
        r.changestatus();
        System.out.println(r + " released");
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

    @Override
    public String toString() {
        return name;
    }
}