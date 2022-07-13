package will.selectivebreeding;

public enum Reproductivity {
    MALE("Fertile male"),
    FEMALE("Fertile Female"),
    INFERTILE("Infertile");

    private String status;

    Reproductivity(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}