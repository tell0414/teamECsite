package com.internousdev.arizona.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.arizona.dao.CartInfoDAO;
import com.internousdev.arizona.dao.UserInfoDAO;
import com.internousdev.arizona.dto.CartInfoDTO;
import com.internousdev.arizona.dto.UserInfoDTO;
import com.internousdev.arizona.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String userId;
	private String password;
	private List<String> userIdErrorMessageList;
	private List<String> passwordErrorMessageList;
	private boolean savedUserIdFlag;
	private String isNotUserInfoMessage;
	private List<CartInfoDTO> cartItemList;
	private int totalPrice;
	private String cartFlag ;
	private Map<String, Object> session;

	public String execute() {

		if (!session.containsKey("tempUserId")) {
			return "sessionTimeout";
		}

		String result = ERROR; //初期値としてERRORを入れる

		session.remove("savedUserIdFlag");
		UserInfoDAO userInfoDAO = new UserInfoDAO();

		if (session.containsKey("createUserFlag")) { // 新規ユーザー登録画面から来た場合

			userId = session.get("userIdForCreateUser").toString();
			password = session.get("password").toString();

			session.remove("userIdForCreateUser");
			session.remove("password");
			session.remove("createUserFlag");

		} else { // ログイン画面から来た場合

			InputChecker inputChecker = new InputChecker();
			userIdErrorMessageList = inputChecker.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, false,false);
			passwordErrorMessageList = inputChecker.doCheck("パスワード", password, 1, 16, true, false, false, true, false,false);

			if (userIdErrorMessageList.size() > 0 || passwordErrorMessageList.size() > 0) { // userIdまたはpasswordに入力間違えがある場合

				return result;
			}

				boolean exists = false;
				try {
					exists = userInfoDAO.isExistsUserInfo(userId, password); // ユーザーIDとパスワードがあるか確認
				} catch (SQLException e) {
					e.printStackTrace();
					return "DBError";
				}

			if (exists == false) { // ログイン出来ない場合
				isNotUserInfoMessage = "ユーザーIDまたはパスワードが異なります。";
				return result;
			}
		}

		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		String tempUserId = session.get("tempUserId").toString();
		List<CartInfoDTO> cartInfoDTOListForTempUser = null;
		try {
			cartInfoDTOListForTempUser = cartInfoDAO.getCartInfoDTOlist(tempUserId);
		} catch (SQLException e) {
			e.printStackTrace();
			return "DBError";
		}

		if (cartInfoDTOListForTempUser != null && cartInfoDTOListForTempUser.size() > 0) { // 仮ユーザーIDでカートにいれた商品と本ユーザーIDを紐付けする。

				boolean cartresult = changeCartInfo(cartInfoDTOListForTempUser, tempUserId);

			if (!cartresult) { // 紐付けできないときエラーを返す
				return "DBError";
			}
		}

		UserInfoDTO userInfoDTO = null;
		try {
			userInfoDTO = userInfoDAO.getUserInfo(userId, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return "DBError";
		}

		session.put("userId", userInfoDTO.getUserId());
		session.put("logined", 1);

		if (savedUserIdFlag) { // ユーザーID保存ボタンを押した場合
			session.put("savedUserIdFlag", true);
		}
		session.remove("tempUserId");

		if (session.containsKey("cartFlag")) { // カートフラグがあればカート画面に遷移
			session.remove("cartFlag");
			try{
				cartItemList = cartInfoDAO.getCartInfoDTOlist(userId);
				}catch(SQLException e){
					e.printStackTrace();
					return "DBError";
				}

			try{
				totalPrice = cartInfoDAO.getTotalPrice(userId);
				}catch(SQLException e){
					e.printStackTrace();
					return "DBError";
				}

			result = "cart";

		} else { // カートフラグがなければホーム画面に遷移
			result = SUCCESS;

		}

		return result;
	}

	private boolean changeCartInfo(List<CartInfoDTO> cartInfoDTOListForTempUser, String tempUserId)  {
		int count = 0;
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		boolean result = false;

		for (CartInfoDTO dto : cartInfoDTOListForTempUser) {

			boolean exists2 = false;
			try {
				exists2 = cartInfoDAO.isExistsCartInfo(userId, dto.getProductId());
			} catch (SQLException e1) {
				e1.printStackTrace();
				return result;
			}

			if (exists2==true) {
				// カートに商品の個数を追加するとき
				try{
					count += cartInfoDAO.updateProductCount(userId, dto.getProductId(), dto.getProductCount());
					}catch(SQLException e){
						e.printStackTrace();
						return result;
					}

				try{
					cartInfoDAO.delete(String.valueOf(dto.getProductId()), tempUserId);
					}catch(SQLException e){
						e.printStackTrace();
						return result;
					}
			} else {
				// カートに新しく商品を入れるとき
				try{
					count += cartInfoDAO.linkToUserId(tempUserId, userId, dto.getProductId());
					}catch(SQLException e){
						e.printStackTrace();
						return result;
					}
			}
		}
		if (count == cartInfoDTOListForTempUser.size()) {
			result = true;
		}
		return result;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getUserIdErrorMessageList() {
		return userIdErrorMessageList;
	}

	public void setUserIdErrorMessageList(List<String> userIdErrorMessageList) {
		this.userIdErrorMessageList = userIdErrorMessageList;
	}

	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}

	public boolean getSavedUserIdFlag() {
		return savedUserIdFlag;
	}

	public void setSavedUserIdFlag(boolean savedUserIdFlag) {
		this.savedUserIdFlag = savedUserIdFlag;
	}

	public String getIsNotUserInfoMessage() {
		return isNotUserInfoMessage;
	}

	public void setIsNotUserInfoMessage(String isNotUserInfoMessage) {
		this.isNotUserInfoMessage = isNotUserInfoMessage;
	}

	public List<CartInfoDTO> getCartItemList() {
		return cartItemList;
	}

	public void setCartInfoDTOList(List<CartInfoDTO> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCartFlag() {
		return cartFlag;
	}

	public void setCartFlag(String cartFlag) {
		this.cartFlag = cartFlag;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
