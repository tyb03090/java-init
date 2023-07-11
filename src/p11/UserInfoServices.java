package p11;

import java.util.List;
import java.util.Map;

public class UserInfoServices {
	
	public List<Map<String, String>> getUserInfoList(Map<String,String> param){
		UserInfoRepository uiRepo = new UserInfoRepository();
		return uiRepo.getUserInfoList(param);
	}
	
	public int insertUserInfo(Map<String, String> userInfo) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		return uiRepo.insertUserInfo(userInfo);
	}
	
	public int deleteInfo(Map<String, String> userInfo) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		return uiRepo.deleteUserInfo(userInfo);
	}
}
