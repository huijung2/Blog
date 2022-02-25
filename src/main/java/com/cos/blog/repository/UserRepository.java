package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blog.model.User;

// DAO
// 자동으로 bean등록이 된다.
// @Repository 생략가능
public interface UserRepository extends JpaRepository<User, Integer>{

}




//JAP Naming 전략
//SELECT*FROM user WHERE username =?1 AND password =?2;
//User findByUsernameAndPassword(String username, String password);	
//@Query(value = "SELECT*FROM user WHERE username =?1 AND password =?2", nativeQuery = true)
//User login(String username, String password);
//두가지 방법 다 가능하지만 Blog에 들어가는 내용은 간단하기 때문에 위 코드를 사용하여 데이터를 추출한다.