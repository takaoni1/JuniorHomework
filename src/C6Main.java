public class C6Main {

    public static void main(String[] args) {
        int[] arrayA = new int[]{5, 2, 3, 4, 12, 2};
        int[] arrayB = new int[]{1, 2, 3, 4};

        C6MyIntArrayList listOne = new C6MyIntArrayList();
        C6MyIntArrayList listTwo = new C6MyIntArrayList();

        listOne.printElements();
        listOne.ensureCapacity(2);
        listOne.add(9);

        for (int i = 0; i < arrayA.length; i++) {
            listOne.add(arrayA[i]);
        }

        for (int i = 0; i < arrayB.length; i++) {
            listTwo.add(arrayB[i]);
        }

        listOne.printElements();
        listTwo.printElements();

        listTwo.set(2, 11);
        System.out.println();
        System.out.println(listOne.doesContain(2));
        System.out.println(listTwo.lastIndexOf(11));
        System.out.println(listOne.indexOf(12));
        System.out.println(listTwo.get(0));

        listOne.addAll(listTwo);
        listOne.printElements();

//        listOne.clear();

        listOne.addAll(1, listTwo);
        listOne.printElements();


    }
}
