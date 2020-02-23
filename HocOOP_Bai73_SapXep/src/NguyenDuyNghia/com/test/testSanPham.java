package NguyenDuyNghia.com.test;
import NguyenDuyNghia.com.model.SanPham;

import java.util.ArrayList;
import java.util.Collections;
public class testSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham>dsSP=new ArrayList<SanPham>();
		dsSP.add(new SanPham(1, "Pepsi", 25));
		dsSP.add(new SanPham(2, "Coca", 15));
		dsSP.add(new SanPham(3, "Redbull", 20));
		System.out.println("Danh sách sản phẩm:");
		for(SanPham sp: dsSP)
			System.out.println(sp);
		Collections.sort(dsSP);
		System.out.println("Danh sách sản phẩm sau khi Sort:");
		for(SanPham sp: dsSP)
			System.out.println(sp);

	}

}
