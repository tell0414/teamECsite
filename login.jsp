<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/login.css">
	<link rel="stylesheet" type="text/css" href="./css/home.css">
	<title>ログイン画面</title>
</head>
<body>
<script src="./js/arizona.js"></script>
<jsp:include page="header.jsp" />
<div id="contents">
<div class="top">
	<h1>ログイン画面</h1>
</div>

	<s:if
		test="userIdErrorMessageList!=null && userIdErrorMessageList.size()>0">
		<!-- 			エラーメッセージがあれば表示 -->
		<div class="error">
			<div class="error-message">
				<s:iterator value="userIdErrorMessageList">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>

	<s:if
		test="passwordErrorMessageList!=null && passwordErrorMessageList.size()>0">
		<!-- 			エラーメッセージがあれば表示 -->
		<div class="error">
			<div class="error-message">
				<s:iterator value="passwordErrorMessageList">
					<s:property />
					<br>
				</s:iterator>
			</div>
		</div>
	</s:if>

	<s:if
		test="isNotUserInfoMessage!=null && !isNotUserInfoMessage.isEmpty()">
		<!-- 			エラーメッセージがあれば表示 -->
		<div class="error">
			<div class="error-message">
				<s:property value="isNotUserInfoMessage" />
			</div>
		</div>
	</s:if>

	<s:form id="loginForm">
		<table class="vertical-list-table">
			<tr>
				<th scope="row">
					<s:label value="ユーザーID" />
				</th>
				<s:if test="#session.savedUserIdFlag==true">
					<td>
						<s:textfield name="userId" class="txt" placeholder="ユーザーID" value='%{#session.userId}' autocomplete="off" />
					</td>
				</s:if>
				<s:else>
					<td>
						<s:textfield name="userId" class="txt" placeholder="ユーザーID" value='%{userId}' autocomplete="off"></s:textfield>
					</td>
				</s:else>
			</tr>
			<tr>
				<th scope="row">
					<s:label value="パスワード" />
				</th>
				<td><s:password name="password" class="txt"
						placeholder="パスワード" sutocomplete="off" /></td>
			</tr>
		</table>

		<div class="box">
			<s:if test="(#session.savedUserIdFlag==true && #session.userId!=null && !#session.userId.isEmpty()) || savedUserIdFlag==true">
				<s:checkbox name="savedUserIdFlag" checked="checked" class="flag"/>
			</s:if>
			<s:else>
				<s:checkbox name="savedUserIdFlag" class="flag"/>
			</s:else>
			<s:label value="ユーザーID保存" />
			<br>
		</div>

		<div class="submit_btn_box" >
			<s:submit value="ログイン" class="submit_btn" onclick="goLoginAction()" />
			<s:hidden id="cartFlag" name="cartFlag" value="%{cartFlag}" />
		</div>

		<div class="submit_btn_box">
			<div id="contents-btn-set"></div>
			<s:submit value="新規ユーザー登録" class="submit_btn" onclick="goGoCreateUserAction()" />
		</div>

		<div class="submit_btn_box">
			<div id="submit_btn_box"></div>
			<s:submit value="パスワード再設定" class="submit_btn" onclick="goGoResetPasswordAction()" />
		</div>

	</s:form>

</div>
</body>
</html>