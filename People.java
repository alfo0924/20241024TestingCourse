public class People {
    // 重寫 toString 方法，返回人物的基本資訊（姓名、身高和BMI）
    public String toString() {
        return "Name: " + name + ", Height: " + height + ", BMI: " + bmi();
    }

    // 新增子女方法
    // 參數 p 代表要新增的子女物件
    // 此方法會將子女加入當前物件的 children 列表，並設定父親關係
    public void addChild(People p) {
        this.children.add(p);
        p.setFather(this);
    }

    // 判斷是否為兄弟姊妹的方法
    // 參數 p 代表要比較的對象
    // 目前返回 false，需要實作具體的兄弟姊妹判斷邏輯
    public boolean isSibling(People p) {
        return false;
    }

    // 主程式，用於測試 People 類別的功能
    public static void main(String[] args) {
        // 測試建立人物物件
        People person = new People(name: "John", height: 1);
        System.out.println(person);

        // 測試父子關係設定
        People father = new People(name: "Mark", height: 1);
        person.setFather(father);
        System.out.println("Father: " + person.getFather());

        // 設定出生年份（註解表示這可能不需要）
        person.setBirthDayYear(1985);
    }
}
