package h_info;

import java.util.ArrayList;

public interface infoModel {

	// 전체검색을 한 결과를 리턴
	ArrayList<InfoVO> selectInfoAll() throws Exception; // end of public ArrayList

	//// 전화번호를 얻어서 해당 고객정보를 지우기
	void deleteInfo(String tel) throws Exception;// end of catch

	// 전화번호를 입력 받아 해당 고객정보를 디비에서 검색하여 InfoVO 지정하여 리턴
	InfoVO selectINfoByTel(String tel) throws Exception;

	// 넘겨받은 InfoVO의 멤버 값들을 디비에 입력
	void modifyInfo(InfoVO vo) throws Exception; // end of main

	// 넘겨받은 InfoVO의 멤버 값들을 디비에 입력
	void insertInfo(InfoVO vo) throws Exception; // end of main

}