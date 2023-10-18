package draft.home_work_start;

public class MainRubAr {
    public static void main(String[] args) {

        RubberArray<String> strRA = new RubberArray<>();
        strRA.add("as", "my", "dog", "cat");
        strRA.add("my");
        strRA.add("fly");
        System.out.println(strRA.toString());
        System.out.println(strRA.length());
        System.out.println(strRA.indexOf("my"));
        System.out.println(strRA.lastIndexOf("my"));

        strRA.removeByIndex(5);
        System.out.println(strRA.toString());


    }
}
