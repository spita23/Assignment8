public class Student extends User {
    boolean feePaid;


    Student(String name, boolean feePaid) {
        super(name);
        this.feePaid = feePaid;
    }

    public boolean isFeePaid() {
        return feePaid;
    }

    void setFeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }
}

