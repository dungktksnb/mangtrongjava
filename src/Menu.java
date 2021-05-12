import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        int[] arr = new int[100];
        int size = 0;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    size = inputSize();
                    inputArray(arr, size);
                    menu1();
                    break;
                case 2:
                    displayArray(arr,size);
                    menu1();
                    break;
                case 3:
                    findMaxEven(arr, size);
                    System.out.println("số chẵn lớn nhất trong mảng là: " + findMaxEven(arr, size));
                    menu1();
                    break;
                case 4:
                    listNum(arr,size);
                    menu1();
                    break;
                case 5:
                    sumNum(arr,size);
                    menu1();
                    break;

                case 6:
                    break;

                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:

                    break;

                case 11:
                    System.exit(0);
                    break;


            }

        }
        while (choice >= 1 && choice <= 11);
    }

    static void menu() {
        System.out.println("=========MENU=======");
        System.out.println("1.Nhập mảng có kích thước N (0<N<100)");
        System.out.println("2. Hiển thị mảng vừa nhập");
        System.out.println("3. Tìm số chẵn lớn nhất trong mảng");
        System.out.println("4. Liệt kê danh sách các số chẵn trong mảng");
        System.out.println("5. Tính tổng các số chẵn trong mảng");
        System.out.println("6. Nhập vào giá trị và vị trí cần chèn của giá trị đó trong mảng, chèn giá trị đó vào mảng");
        System.out.println("7. Xoá tất cả các phần tử có giá trị bằng X (được nhập từ bàn phím) khỏi mảng");
        System.out.println("8. Đảo ngược mảng ban đầu");
        System.out.println("9. Hiển thị danh sách các số nguyên tố trong mảng");
        System.out.println("10. Sắp xếp mảng theo thứ tự giảm dần");
        System.out.println("11. Thoát");

    }

    static int inputSize() {
        int N;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập kích thước của mảng(0<n<100):");
            N = sc.nextInt();
        } while (N <= 0 || N >= 100);
        return N;
    }

    static void inputArray(int[] arr, int N) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang gom N phan tu: ");
        for (int i = 0; i < N; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
    }

    static void displayArray(int[] arr ,int N) {
        System.out.println("Mang la: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    static int findMaxEven(int[] arr, int N) {
        int max = arr[0];
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void listNum(int[] arr, int N) {
        System.out.println("Các số chắn trong mảng là:");
        int [] arr1=new int[N];
        int index=0;
        int length=0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                    arr1[index]=arr[i];
                    index++;
                    length++;
            }

        }
        for (int i = 0; i < length; i++) {
            System.out.print(arr1[i]+" ");

        }
        System.out.println();

    }
    static void menu1(){
        System.out.println("Nhấn phím bất kỳ để ra ngoài Menu");
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
    }
    static void sumNum(int []arr,int N){

        int sum=0;
        for (int i = 0; i < N; i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }

        }
        System.out.println("tổng của các số chẵn trong mảng là:" +sum);
    }
    static void chenPhanTuVaoMang()




}



