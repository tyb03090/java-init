package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInfoController {

	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		UserInfoServices uiService = new UserInfoServices();
		return uiService.getUserInfoList(param);
	}

	public int insertUserInfo(Map<String, String> userInfo) {
		UserInfoServices uiService = new UserInfoServices();
		return uiService.insertUserInfo(userInfo);
	}

	public int deleteUserInfo(Map<String, String> userInfo) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		return uiRepo.deleteUserInfo(userInfo);
	}

	public static void main(String[] args) {
		UserInfoController uiController = new UserInfoController();
		Map<String, String> param = new HashMap<>();
		param.put("uiName", "습");
		List<Map<String, String>> userInfoList = uiController.getUserInfoList(param);
		System.out.println("번호\t이름\t아이디\t비밀번호");
		for (Map<String, String> userInfo : userInfoList) {
			System.out.println(userInfo.get("uiNum") + "\t");
		}

//		param.put("uiName", "철수");
//		param.put("uiId", "cs");
//		param.put("uiPwd", "1111");
//		int result = uiController.insertUserInfo(param);
//		System.out.println("실행 결과 : " + result);
		
		param.put("uiNum", "6");
		int result = uiController.deleteUserInfo(param);
		System.out.println("실행 결과 : " + result);
	}
}
