package com.cos.blog.test;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@Getter
//@Setter

@Data //getter, setter을 한번에 적용시켜줄때 사용
//@AllArgsConstructor 전체 생성자를 만들고 싶으면 사용
@NoArgsConstructor //빈 생성자를 만들고 싶으면 사용
// @RequiredArgsConstructor //final이 없으면 적용이 안됨
public class Member {
	private int id;
	private String username;
	private String password;
	private String email;
}
