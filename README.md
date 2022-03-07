
#Tổng hợp các design pattern thông dụng

--------------------------------

##The Factory Pattern
* Mục đích: tạo ra instance của Object một cách lỏng lẻo, dễ dàng thay đổi khi object đó phải thay đổi sang instace
của 1 class cụ thể khác.
  * Ví dụ: Bạn muốn khởi tạo 1 đối tượng Pizza, nhưng có rất nhiều loại pizza và bạn không biết chắc sẽ khởi tạo instance của loại pizza nào, bạn có thể sử dụng 
  factory để linh động tạo ra đối tượng đó chỉ cần thông tin đầu vào là : type của Pizza
  * Code example ở thư mục src/factory
* Lợi ích
  * Tạo khớp nối lỏng lẻo, tránh sự phụ thuộc của thành phần cấp cao vào các thành phần cấp thấp hơn
  * Đóng gói được sự thay đổi kiểu của đối tượng, dễ dàng mở rộng và hạn chế được sửa lại code trong các class