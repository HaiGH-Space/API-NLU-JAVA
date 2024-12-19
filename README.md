
# API for NLU

Project này sẽ cung cấp các api mà trang [dkmh](https://dkmh.hcmuaf.edu.vn/) của NLU sử dụng. Từ đó có thể dễ dàng tạo các tool dkmh với việc chỉ cần gọi các api cần thiết đã được cung cấp sẵn giúp tối ưu hiệu suất.




## Tech Stack

- **Language**: Java
- **Build Tool**: 
  - Maven



## Features

- Đăng nhập
- Đăng ký môn học
- Lấy danh sách điểm sinh viên
- Lấy danh sách thông tin các môn học



## Roadmap

- Thêm lấy thời khóa biểu




## Installation

Clone project này về.
- Clone repo: `https://github.com/HaiGH-Space/API-NLU-JAVA.git`

- Chạy: `mvn install`

- Khởi động test: `javac Test.java`

## Note
Trước khi sử dụng các api, phải thực hiện api đăng nhập trước.
Điền vào mssv và mật khẩu vào hàm login, hàm này sẽ trả về sinh viên nếu đăng nhập thành công.




## Usage

Trước tiên hãy bắt đầu với việc tạo lớp API để gọi các API cần thiết.
```java
API api = new API();
```
Trước khi gọi các api khác ta phải đăng nhập để lấy được token.
```java
try{
    Student sinh_vien = api.login(username,password);

    if  (sinh_vien != null) {
        String authorization = sinh_vien.getAuthorization();
        // Gọi các api khác
    }else {
        System.out.println("Đăng nhập thất bại");
    }
}catch (IOException e) {
    e.printStackTrace();
}
```
Sau khi có được **authorization**, bạn có thể sử dụng các api khác.
```java
/*
    Lấy danh sách điều kiện lọc
*/
List<FilteringCondition> dsDKLoc = api.dsDKLoc(authorization);
```
## FAQ

#### Sử dụng dkmh bằng API liệu nhà trường có khóa không?

Câu trả lời là không

#### Project này có thu nhập dữ liệu cá nhân hay bất kì dữ liệu riêng tư nào không?

Câu trả lời là không, bạn chạy trên local của chính bạn không qua bất kì bên nào khác.


## Authors

- [@HaiGH](https://github.com/HaiGH-Space)


## Acknowledgements

- **Libraries and Tools**: 
  - [OKHttp](https://square.github.io/okhttp/) - Thư viện HTTP client cho việc giao tiếp mạng.
  - [Gson](https://github.com/google/gson) - Thư viện chuyển đổi giữa Java Objects và JSON.
- **Tài nguyên**: 
  - [OKHttp guide](https://square.github.io/okhttp/) - Tài liệu hướng dẫn sử dụng OKHttp.
  - [Gson guide](https://github.com/google/gson/wiki) - Tài liệu chi tiết về Gson.


## Licenses

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)

[![Apache License](https://img.shields.io/badge/License-Apache%202.0-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0)


## Used By

This project is used by: [NLU-GUI](https://github.com/HaiGH-Space/NLU-GUI)


