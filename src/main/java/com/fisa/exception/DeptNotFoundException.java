//검색 부서 번호가 미 존재지 발생하는 예외로 개발
package com.fisa.exception;

public class DeptNotFoundException extends Exception{
	public DeptNotFoundException() {}
	public DeptNotFoundException(String m) {
		super(m);
	}

}