
import java.util.ArrayList;
import java.util.Scanner;

public class BaiTapTuan5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Bai 1: Nhap so luong 5 cuon sach
        int[] soLuong = new int[5];
        int tong = 0;
        int max = 0;

        System.out.println("===== BAI 1: MANG SO LUONG =====");

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Nhap so luong sach " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();

            tong += soLuong[i];

            if (i == 0 || soLuong[i] > max)
            {
                max = soLuong[i];
            }
        }

        System.out.print("So luong cac sach: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(soLuong[i] + " ");
        }

        System.out.println("\nTong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
        sc.nextLine();

        // Bai 2 va Bai 3: Danh sach ma sach va thong tin sach
        ArrayList<String> maSach = new ArrayList<>();
        ArrayList<String> danhSachSach = new ArrayList<>();

        // Bai 4: Menu quan ly sach
        int chon = 0;

        while (chon != 8)
        {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon)
            {
                case 1:
                    // Them sach vao ArrayList
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();

                    if (maSach.contains(ma))
                    {
                        System.out.println("Ma sach da ton tai!");
                        break;
                    }

                    System.out.print("Nhap ten sach: ");
                    String ten = sc.nextLine();

                    System.out.print("Nhap tac gia: ");
                    String tacGia = sc.nextLine();

                    System.out.print("Nhap don gia: ");
                    double donGia = sc.nextDouble();

                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();
                    sc.nextLine();

                    maSach.add(ma);

                    danhSachSach.add(ma + "|" + ten + "|" + tacGia
                            + "|" + donGia + "|" + sl);

                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    // Hien thi danh sach sach
                    System.out.println("\n===== DANH SACH SACH =====");

                    for (int i = 0; i < danhSachSach.size(); i++)
                    {
                        String[] sach = danhSachSach.get(i).split("\\|");

                        System.out.println("Ma sach: " + sach[0]);
                        System.out.println("Ten sach: " + sach[1]);
                        System.out.println("Tac gia: " + sach[2]);
                        System.out.println("Don gia: " + sach[3]);
                        System.out.println("So luong: " + sach[4]);
                        System.out.println("-------------------------");
                    }
                    break;

                case 3:
                    // Tim sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < danhSachSach.size(); i++)
                    {
                        String[] sach = danhSachSach.get(i).split("\\|");

                        if (sach[0].equalsIgnoreCase(maTim))
                        {
                            System.out.println("Thong tin sach:");
                            System.out.println("Ma sach: " + sach[0]);
                            System.out.println("Ten sach: " + sach[1]);
                            System.out.println("Tac gia: " + sach[2]);
                            System.out.println("Don gia: " + sach[3]);
                            System.out.println("So luong: " + sach[4]);

                            timThay = true;
                        }
                    }

                    if (!timThay)
                    {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    // Xoa sach theo ma
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    int viTriXoa = maSach.indexOf(maXoa);

                    if (viTriXoa != -1)
                    {
                        maSach.remove(viTriXoa);
                        danhSachSach.remove(viTriXoa);
                        System.out.println("Xoa sach thanh cong!");
                    }
                    else
                    {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 5:
                    // Sua thong tin sach
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    int viTriSua = maSach.indexOf(maSua);

                    if (viTriSua != -1)
                    {
                        System.out.print("Nhap ten sach moi: ");
                        ten = sc.nextLine();

                        System.out.print("Nhap tac gia moi: ");
                        tacGia = sc.nextLine();

                        System.out.print("Nhap don gia moi: ");
                        donGia = sc.nextDouble();

                        System.out.print("Nhap so luong moi: ");
                        sl = sc.nextInt();
                        sc.nextLine();

                        danhSachSach.set(viTriSua, maSua + "|" + ten + "|"
                                + tacGia + "|" + donGia + "|" + sl);

                        System.out.println("Sua sach thanh cong!");
                    }
                    else
                    {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 6:
                    // Tinh tong so luong sach
                    tong = 0;

                    for (int i = 0; i < danhSachSach.size(); i++)
                    {
                        String[] sach = danhSachSach.get(i).split("\\|");
                        tong += Integer.parseInt(sach[4]);
                    }

                    System.out.println("Tong so luong sach: " + tong);
                    break;

                case 7:
                    // Tinh tong gia tri sach
                    double tongGiaTri = 0;

                    for (int i = 0; i < danhSachSach.size(); i++)
                    {
                        String[] sach = danhSachSach.get(i).split("\\|");

                        double gia = Double.parseDouble(sach[3]);
                        int soLuongSach = Integer.parseInt(sach[4]);

                        tongGiaTri += gia * soLuongSach;
                    }

                    System.out.printf("Tong gia tri sach: %.2f%n", tongGiaTri);
                    break;

                case 8:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        }

        sc.close();
    }
}
