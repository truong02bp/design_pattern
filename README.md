
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
  * Đóng gói được sự thay đổi kiểu của đối tượng, dễ dàng mở rộng và hạn chế được việc phải 
  sửa lại code trong các class
* Lưu ý
  * Không nên sử dụng với các đối tượng ít có sự thay đổi, ví dụ như String... 
  để cồng kềnh không cần thiết 


## Singleton Pattern
* Mục đích: đảm bảo chỉ có 1 instance của class được khởi tạo trong hệ thống
* Lợi ích:
  * Tiết kiệm bộ nhớ so với sử dụng biến static (có thể khởi tạo 1 cách lazy)
  * Đảm bảo không instance nào được khởi tạo thêm nữa, biến static không thể làm được điều này
  * Xử lý logic nhất quán trong trường hợp cả hệ thống chỉ cần 1 instance thực hiện việc đó:
    * Ví dụ: printer, cache, logger, manage or registry settings...
* Lưu ý
  * Khi xử lý đa luồng, có thể dẫn tới khởi tạo instace khác nhau, lí do là vì 2 luồng cùng thực hiện tạo lazy cùng 1 lúc
