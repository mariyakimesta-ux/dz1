public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("Аня", "Суп");
        map.put("Борис", "Плов");
        map.put("Юра", "Компот");

        System.out.println(map.get("Аня"));
        System.out.println(map.get("Борис"));
        System.out.println(map.get("Юра"));

        map.remove("Аня");
        System.out.println(map.get("Аня"));
        System.out.println(map.get("Юра"));
    }
}