package oopHomeWork;

public class Main {

	public static void main(String[] args) {
		
		//first object
		Product product1 = new Product("Yazılım Geliştirici Yetiştirme Kampı(JAVA + REACT)","orange","Engin Demirog",19);
		
		Product product2 = new Product("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","blue","Engin Demirog",0);
		
		Product product3 = new Product();
		product3.name = "Programlamaya Giriş için Temel Kurs";
		product3.imageColor = "white";
		product3.trainer = "Engin Demirog";
		product3.completedPart = 0;
		
		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println("Kurs ismi: "+product.name);
			System.out.println("Kurs resim rengi: "+product.imageColor);
			System.out.println("Kurs eğitimcisi: "+product.trainer);
			System.out.println("Kurs tamamlanan kısım: %"+product.completedPart);
			System.out.println("-----------------");
		}
		
		//first method
		ProductService productService = new ProductService();
		
		productService.addCourse(product1);
		productService.addCourse(product2);
		productService.addCourse(product3);
		
		//second method
		productService.reachToChannel();
		
		System.out.println("********************");
		
		
		//second object
		Category category1 = new Category(1,"Kurslarım");
		Category category2 = new Category(2,"Tüm Kurslar");
		Category category3 = new Category(3,"Kampa Hazırlık");
		Category category4 = new Category(4,"Sık Sorulan Sorular");
		
		Category[] categories = {category1,category2,category3,category4};
		for (Category category : categories) {
			System.out.println("Seçtiğiniz kategori: " +category.name);
		}
		
		
		
		
		
		

	}

}
