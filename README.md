# Một số nguyên tắc cần hướng tới khi lập trình hướng đối tượng
* Encapsulate what varies : đóng gói những gì thay đổi ( hoặc có thể thay đổi trong tương lai)
  * Lợi ích:
    * Khi có sự thay đổi xảy ra, chỉ cần thay đổi tại vị trí đóng gói thay vì bất cứ chỗ nào sử dụng đến logic đó
    * Tách rời phần thay đổi và những phần tĩnh, dễ dàng maintain và đọc code
-------
* Favor Composition over Inheritance: ưu tiên thành phần hơn là thừa kế (ưu tiên chữ không phải tất cả)
  * Nhược điểm của thừa kế
    * Cứng nhắc, khó mở rộng, khi thay đổi lớp cha sẽ dẫn tới lớp con thay đổi
    * Khi hệ thống lớn, cây thừa kế sẽ sâu và phức tạp gây khó khăn cho việc hiểu và maintain code
    * 1 số ngôn ngữ chỉ hỗ trợ đơn kế thừa
    * Không thể thay đổi ở runtime (fix cứng trong code)
  * Ưu điểm của kế thừa
    * Tái sử dụng code
  * Ưu điểm của thành phần
    * Dễ dàng mở rộng, hay thay đổi bằng nhiều cách (Dependency injection, setter)
    * Có thể thay đổi ở runtime
    ...
  * Khi nào nên sử dụng kế thừa:
    * Sử dụng kế thừa khi lớp con và lớp cha có cùng cấu trúc và chức năng,
    lớp con có thể sử dụng thay thế lớp cha trong một việc hay hoạt động nào đó...
----
* Program to interface, not implementations: dùng interface thay vì các triển khai
  * Lợi ích của việc sử dụng interface để giao tiếp giữa các class:
    * Tạo ra những khớp nối lỏng lẻo, dễ dàng thay đổi khi cần thiết
    bằng các kĩ thuật như Dependency injection, setter...
    * Che giấu logic và dữ liệu, có thể thay đổi ở khâu triển khai mà không ảnh hưởng đến client
  Ví dụ: Khi giám đốc cần báo cáo X từ phòng kinh doanh, giám đốc chỉ cần bảo trợ lý quản lý báo cáo(interface) 
    mà không cần phải biết những người trong phòng kinh doanh (implementions) theo nhiệm vụ(X,Y,Z...) để lấy báo cáo
----
* Classes should be open for extension but closed for modification: Các lớp nên mở cho việc mở rộng và đóng cho việc thay đổi
  * Khi thay đổi trong 1 class sẽ gây ảnh hưởng đến các nơi sử dụng class đó
  * Tốn thời gian, chi phí cho việc testing khi thay đổi những thứ cũ đã được làm một cách chuẩn mực
----
#Tổng hợp các design pattern thông dụng

--------------------------------

##The Factory Pattern
* Mục đích: tạo ra instance của Object một cách lỏng lẻo, dễ dàng thay đổi khi object đó phải thay đổi sang instance
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
  
## Command Pattern
* Mục đích: Tách đối tượng yêu cầu request ra khỏi đối tượng biết cách thực hiện request đó
* Lợi ích:
  * Linh hoạt khi có thêm các request và cách xử lý request mới 
  * Có thể thay đổi request, cách xử lý request ở runtime mà không cần sửa code cũ

## The Adapter Pattern
* Mục đích: Giúp các class hoạt động cùng nhau ngay cả khi không tương thích về mặt interface
* Ví dụ: class Gà Tây có thể hoạt động y như class Vịt thông qua 1 adapter

## The Template Pattern
* Mục đích: tạo khung xương cho thuật toán và trì hoãn một vài step cho các subclass thực hiện, việc này cho phép 
các subclass định nghĩa lại các step đó mà không ảnh hưởng đến toàn bộ cấu trúc của thuật toán
* Lợi ích:
  * Tính đóng gói, khi cần chỉ thay đổi 1 chỗ thay vì nhiều class và che giấu logic không thiết với các class khác
  * Clean design, reuse code tối đa
  * Dễ dàng mở rộng, thêm các subclass khác