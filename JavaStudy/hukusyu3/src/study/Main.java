package study;

/**
 *
 * 本課題では、継承・オーバーロードメソッドの基本的な使い方を学んでいきましょう。
 * 課題は問①から問③まであります。public class Pet {

    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    protected String getName() {
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }

    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    public void introduce() {
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}
 * 指定された値と変数名を守って記述してください。
 *
 * @author s.nanaumi
 */
public class Main {

    public static void main(String[] args) {

        // ③ Taskクラスのインスタンスを生成し、「doTask()」メソッドを呼び出しなさい。
    	Task cal = new Task();
    	cal.doTask();

    }

}