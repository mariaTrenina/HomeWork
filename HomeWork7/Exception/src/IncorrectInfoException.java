public class IncorrectInfoException extends Exception {
    private String fio;
    private int age;
    public IncorrectInfoException(String message, String fio, int age) {
        super(message);
        this.fio = fio;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
