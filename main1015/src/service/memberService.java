package service;

import java.util.ArrayList;

import dao.memberDAO;
import dto.memberVO;

public class memberService {
	//dao를 포함
	private memberDAO dao;
	
	public memberService() {
		dao=new memberDAO();
	}
	
	public ArrayList<memberVO> getAllMembers() {
		return dao.getAllMembers();
	}

}
