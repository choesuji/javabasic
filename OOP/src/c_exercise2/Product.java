package c_exercise2;

public class Product {
	
		
		// 멤버필드 
        private String productNo;  // 상품번호
        private String productName; //상품명
        private int stock;  // 초기재고량
        
		public void setProductNo(String productNo) {
			this.productNo = productNo;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}      
        
        // 멤버메소드
        public void income (int count) {
        	stock += count;
        }
        
        public void sale (int panda) {
        	stock -= panda; 
        }
        	
        public void output() {
        	System.out.println("상품명:"+productName);
        	System.out.println("상품번호:"+productNo);
        	System.out.println("재고량:"+stock);
        }
        
}
        
        
	


