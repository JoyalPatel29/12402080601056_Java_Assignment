class Outer {

    // 🔹 Member Inner Class
    class MemberInner {
        void show() {
            System.out.println("This is Member Inner Class");
        }
    }

    void display() {

        // 🔹 Local Inner Class
        class LocalInner {
            void show() {
                System.out.println("This is Local Inner Class");
            }
        }

        LocalInner l = new LocalInner();
        l.show();
    }
}

// 🔹 Interface for Anonymous Class
interface Demo {
    void show();
}

public class Program7 {
    public static void main(String[] args) {

        Outer obj = new Outer();

        // Member Inner Class
        Outer.MemberInner m = obj.new MemberInner();
        m.show();

        // Local Inner Class
        obj.display();

        // Anonymous Inner Class
        Demo d = new Demo() {
            public void show() {
                System.out.println("This is Anonymous Inner Class");
            }
        };
        d.show();
    }
}
