
import list.resource;
import list.user;
import list.pool;

public class pooling {

    public static void main(String[] args) {
        pool p = new pool(1, 2);
        // Scanner sc = new Scanner(System.in);

        resource r1 = new resource(1, "java");
        p.addres(r1);

        resource r2 = new resource(2, "python");
        p.addres(r2);

        resource r3 = new resource(3, "c++");
        p.addres(r3);

        user u1 = new user(1, "Ateeque");
        user u2 = new user(2, "Aman");
        user u3 = new user(3, "Mota");
        user u4 = new user(4, "Rahul");

        u1.acquire_resource(r1, p);
        u2.acquire_resource(r1, p);
        u3.acquire_resource(r2, p);
        u4.acquire_resource(r3, p);
        u1.release_resource(r1, p);
        u2.acquire_resource(r1, p);
        u3.release_resource(r2, p);
        u4.acquire_resource(r2, p);

    }

}
