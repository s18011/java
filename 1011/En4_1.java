public class En4_1 {
    public static void main(String[] args) {
        Item pencilA = new Item("abcd", "HB", "双葉鉛筆", 100);
        Item pencilB = new Item("abcd", "HB", "双葉鉛筆", 100);
        Item pencilC = new Item("abcd", "2B", "三菱鉛筆", 100);
        Item pencilD = new Item("abcd", "HB", "双葉鉛筆", 200);

        checkEquals(pencilA, pencilB);
        checkEquals(pencilA, pencilC);
        checkEquals(pencilC, pencilB);
        checkEquals(pencilA, pencilD);
        }
    public static void checkEquals(Item item1, Item item2) {
        if (item1.equals(item2)) {
            System.out.println(item1.getName() + "と" + item2.getName() + "は等しいです");
        } else {
            System.out.println(item1.getName() + "と" + item2.getName() + "は等しくないです");
        }
    }

}

