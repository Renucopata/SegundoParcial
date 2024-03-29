package Basic.Memento;

public class ConcreteObject {
    private String attribute1;
    private String attribute2;
    private String attribute3;

    public ConcreteObject(){}
    public ConcreteObject(String attribute1,String attribute2,String attribute3){
        this.attribute1=attribute1;
        this.attribute2=attribute2;
        this.attribute3=attribute3;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public void info(){
        System.out.println("****");
        System.out.println("INFO > attribute1: "+attribute1);
        System.out.println("INFO > attribute2: "+attribute2);
        System.out.println("INFO > attribute3: "+attribute3);
        System.out.println("****");
    }
}
