public class En4_1 {
    public static void main(String[] args) {
        item pencilA = new item("abcd", "HB", "双葉鉛筆", 100);
        item pencilB = new item("abcd", "HB", "双葉鉛筆", 100);
        item pencilC = new item("abcd", "2B", "三菱鉛筆", 100);
        item pencilD = new item("abcd", "HB", "双葉鉛筆", 200);

        checkEquals(pencilA, pencilB);
        checkEquals(pencilA, pencilC);
        checkEquals(pencilC, pencilB);
        checkEquals(pencilA, pencilD);
        }
    public static void checkEquals(item item1, item item2) {
        if (item1.equals(item2)) {
            System.out.println(item1.getName() + "と" + item2.getName() + "は等しいです");
        } else {
            System.out.println(item1.getName() + "と" + item2.getName() + "は等しくないです");
        }
    }

}

