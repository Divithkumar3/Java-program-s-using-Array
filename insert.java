public class insert {
    public static void main(String[] args) {
        int[] arr={10,20,30,50};
        int element=40;
        int position=3;
        arr = insertElement(arr, element, position);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] insertElement(int[] arr,int element,int position){
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = element;

        for (int i = position + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        return newArr;

    }
}

