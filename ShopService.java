package chapter06exercise;
//싱글톤 작성 방법
public class ShopService {

	//정적 필드 : 여기서 shopService=singleton
	private static ShopService shopService = new ShopService();
	
	//생성자
	private ShopService() {}
	
	//정적 메소드
	static ShopService getInstance() {
		return shopService;
	}
	
}
