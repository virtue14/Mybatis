## 개발환경
- Amazon Corretto 21
- mysql community server 8.0
- spring boot 3.3.5
- mybatis framework
- thymeleaf

## dependencies
- Spring Web
    - MVC 패턴 구현을 위한
- Lombok
- Spring Boot DevTools
    - 코드 수정시 자동으로 서버 재시작
- MyBatis Framework
- MySQL Driver

## table
```sql
-- board_table
DROP TABLE IF EXISTS board_table;
CREATE TABLE board_table
(
  id            bigint PRIMARY KEY AUTO_INCREMENT,
  boardTitle    varchar(50),
  boardWriter   varchar(20),
  boardPass     varchar(20),
  boardContents varchar(500),
  boardHits     int      DEFAULT 0,
  createdAt     datetime DEFAULT NOW(),
  fileAttached  int      DEFAULT 0
);
-- board_file_table
DROP TABLE IF EXISTS board_file_table;
CREATE TABLE board_file_table
(
  id               bigint AUTO_INCREMENT PRIMARY KEY,
  originalFileName varchar(100),
  storedFileName   varchar(100),
  boardId          bigint,
  CONSTRAINT fk_board_file FOREIGN KEY (boardId) REFERENCES board_table (id) ON DELETE CASCADE
);
```
