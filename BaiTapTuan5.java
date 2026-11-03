import java.util.Scanner;

public class BaiTapTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("         QUAN LY NHAP SACH");
        System.out.println("====================================");

        System.out.print("Nhap so sach: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] ma = new String[n];
        String[] ten = new String[n];
        String[] tacGia = new String[n];
        double[] donGia = new double[n];
        int[] soLuong = new int[n];

        // Bai 1: Nhap thong tin sach
        for (int i = 0; i < n; i++) {
            System.out.println("\n---------- SACH " + (i + 1) + " ----------");

            System.out.print("Ma sach  : ");
            ma[i] = sc.nextLine();

            System.out.print("Ten sach : ");
            ten[i] = sc.nextLine();

            System.out.print("Tac gia  : ");
            tacGia[i] = sc.nextLine();

            System.out.print("Don gia  : ");
            donGia[i] = sc.nextDouble();

            System.out.print("So luong : ");
            soLuong[i] = sc.nextInt();
            sc.nextLine();
        }

        // Bai 3: Menu lap den khi chon Thoat
        int chon = 0;

        while (chon != 4) {
            System.out.println("\n====================================");
            System.out.println("              MENU");
            System.out.println("====================================");
            System.out.println("  1. Hien thi danh sach sach");
            System.out.println("  2. Thong ke sach");
            System.out.println("  3. Tim sach theo ma");
            System.out.println("  4. Thoat");
            System.out.println("------------------------------------");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("\n============= DANH SACH SACH =============");
                    System.out.printf("%-10s %-20s %-18s %-12s %-8s%n",
                            "Ma sach", "Ten sach", "Tac gia", "Don gia", "SL");
                    System.out.println("------------------------------------------");

                    for (int i = 0; i < n; i++) {
                        System.out.printf("%-10s %-20s %-18s %-12.2f %-8d%n",
                                ma[i], ten[i], tacGia[i],
                                donGia[i], soLuong[i]);
                    }

                    System.out.println("==========================================");
                    break;

                case 2:
                    // Bai 2: Tinh tong so luong va tong gia tri
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;

                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i];
                        tongGiaTri += donGia[i] * soLuong[i];
                    }

                    System.out.println("\n========== THONG KE SACH ==========");
                    System.out.println("Tong so luong : " + tongSoLuong);
                    System.out.printf("Tong gia tri  : %.2f%n", tongGiaTri);
                    System.out.println("===================================");
                    break;

                case 3:
                    // Bai 4: Tim sach theo ma
                    System.out.print("\nNhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < n; i++) {
                        if (ma[i].equalsIgnoreCase(maTim)) {
                            System.out.println("\n-------- THONG TIN SACH --------");
                            System.out.println("Ma sach  : " + ma[i]);
                            System.out.println("Ten sach : " + ten[i]);
                            System.out.println("Tac gia  : " + tacGia[i]);
                            System.out.printf("Don gia  : %.2f%n", donGia[i]);
                            System.out.println("So luong : " + soLuong[i]);
                            System.out.println("--------------------------------");

                            timThay = true;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    System.out.println("\nCam on ban da su dung chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }

        sc.close();
    }
}