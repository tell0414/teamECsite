package com.internousdev.arizona.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.internousdev.arizona.dto.CartInfoDTO;

public class CartInfoDTOTest {

	@Test
	public void testGetIdMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetIdMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetIdMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetIdMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdEmptyCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdkatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserIdAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdEmptyCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserIdAll(){
		CartInfoDTO dto= new CartInfoDTO();
		String expected="漢字 テスト　123abc";
		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductIdMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductIdMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductIdMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductIdMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductCountMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductCountMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductCount0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductCountMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductCountMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductCount0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setProductCount(expected);
		int actual=dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPriceMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPriceMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPrice0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPriceMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPriceMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPrice0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setPrice(expected);
		int actual=dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameEmptyCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProudctNameNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameEmpryCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanaNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void GettestProductNameKanaEmptyCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanaSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanaFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanaAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanaHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanaHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanaKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanaKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductNameKanaAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKaneNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKanaEmptyCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKanaSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKanaFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKanaAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKanaHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKanaHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductNameKanaKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void SetProductNameKanaKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void SetProductNameKanaAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setProductNameKana(expected);
		String actual=dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePathNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePathEmpryCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePathSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePathFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePathAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePathHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePathHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePathKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void GetImageFilePathKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePathAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathEmptyCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePathAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setImageFilePath(expected);
		String actual=dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageNamePathNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileNameEmpryCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileNameSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileNameFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileNameAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileNameHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileNameHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileNameKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void GetImageFileNameKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFileNameAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameEmptyCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFileNameAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setImageFileName(expected);
		String actual=dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleseDateNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseDateDate(){
		CartInfoDTO dto=new CartInfoDTO();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		String expected;
		try{
			expected=String.valueOf(sdf.parse("20180420 12:00:00"));
			dto.setReleaseDate(expected);
			assertEquals(expected,dto.getReleaseDate());
		}catch(ParseException e){
			fail();
		}
	}

	@Test
	public void testSetReleseDateNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setReleaseDate(expected);
		String actual=dto.getReleaseDate();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseDateDate(){
		CartInfoDTO dto=new CartInfoDTO();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		String expected;
		try{
			expected=String.valueOf(sdf.parse("20180420 12:00:00"));
			dto.setReleaseDate(expected);
			assertEquals(expected,dto.getReleaseDate());
		}catch(ParseException e){
			fail();
		}
	}

	@Test
	public void testGetReleaseCompanyNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompanyEmptyCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompanySpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompanyFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompanyAlpahbeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompanyHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompanyHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompanyKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompanyKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetReleaseCompanyAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanyNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanyEmptyCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanySpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanyFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanyAlpahbeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanyHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanyHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanyKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanyKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetReleaseCompanyAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setReleaseCompany(expected);
		String actual=dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusEmpryCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatusAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusNull(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=null;
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusEmpryCharacter(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected=" ";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusFullSpace(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="　";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusAlphabeticCharacters(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="abc";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusHalfWidthDigit(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="123";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusHiragana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="てすと";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusKatakana(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="テスト";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusKanji(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatusAll(){
		CartInfoDTO dto=new CartInfoDTO();
		String expected="漢字 テスト　てすと123abc";
		dto.setStatus(expected);
		String actual=dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void GetSubtotalMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setSubtotal(expected);
		int actual=dto.getSubtotal();
		assertEquals(expected,actual);
	}

	@Test
	public void GetSubtotalMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setSubtotal(expected);
		int actual=dto.getSubtotal();
		assertEquals(expected,actual);
	}

	@Test
	public void GetSubtotal0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setSubtotal(expected);
		int actual=dto.getSubtotal();
		assertEquals(expected,actual);
	}

	@Test
	public void SetSubtotalMax(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=21474;
		dto.setSubtotal(expected);
		int actual=dto.getSubtotal();
		assertEquals(expected,actual);
	}

	@Test
	public void SetSubtotalMin(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=-21474;
		dto.setSubtotal(expected);
		int actual=dto.getSubtotal();
		assertEquals(expected,actual);
	}

	@Test
	public void SetSubtotal0(){
		CartInfoDTO dto=new CartInfoDTO();
		int expected=0;
		dto.setSubtotal(expected);
		int actual=dto.getSubtotal();
		assertEquals(expected,actual);
	}
}
