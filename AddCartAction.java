package com.internousdev.arizona.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.arizona.dao.CartInfoDAO;
import com.internousdev.arizona.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware {

	private int productId;
	private int productCount;
	private int totalPrice;
	private List<CartInfoDTO> cartItemList;
	private Map<String, Object> session;

	public String execute(){

		if (!session.containsKey("tempUserId") && !session.containsKey("userId")) {
			return "sessionTimeout";
		}

		if(!(productCount>=1&&productCount<=5)){
			return ERROR;
		}

		String result = ERROR;
		String userId = null;

		int logined = Integer.parseInt(String.valueOf(session.get("logined")));

		if (logined == 1) { // ログイン時

			userId = session.get("userId").toString();
		} else { // 未ログイン時

			userId = String.valueOf(session.get("tempUserId"));
		}

		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		int count = 0;

		boolean exists = false;
		try {
			exists = cartInfoDAO.isExistsCartInfo(userId, productId);
		} catch (SQLException e) {
			e.printStackTrace();
			return result;
		}

		if (exists==true) { // 既存の商品に個数を追加するとき

			try{
				count = cartInfoDAO.updateProductCount(userId, productId, productCount);
				}catch(SQLException e){
					e.printStackTrace();
					return result;
				}

		} else { // 新しく商品をカートに追加する時

			try{
				count = cartInfoDAO.addCartItem(userId, productId, productCount);
				}catch(SQLException e){
					e.printStackTrace();
					return result;
				}
		}

		if (count > 0) {
			try {
				cartItemList = cartInfoDAO.getCartInfoDTOlist(userId);
			} catch (SQLException e) {
				e.printStackTrace();
				return result;
			}

			try {
				totalPrice = cartInfoDAO.getTotalPrice(userId);
			} catch (SQLException e) {
				e.printStackTrace();
				return result;
			}
			result = SUCCESS;
		}
		return result;

	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<CartInfoDTO> getCartItemList() {
		return cartItemList;
	}

	public void setCartInfoDTOList(List<CartInfoDTO> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
