package chapter06exercise;
//�̱��� �ۼ� ���
public class ShopService {

	//���� �ʵ� : ���⼭ shopService=singleton
	private static ShopService shopService = new ShopService();
	
	//������
	private ShopService() {}
	
	//���� �޼ҵ�
	static ShopService getInstance() {
		return shopService;
	}
	
}
