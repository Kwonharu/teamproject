package com.javaex.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class AnimalController {
    public static void main(String[] args) throws IOException {
    	
    	//변수 serviceKey에 인증키를 넣어주고
        String serviceKey = "k8%2Bvf8egiEvlVDfF5B4oeSKbMZ3qkrNw3e7Gp%2FVhYpo1rhXRdA2V%2FCw3Wywn1BNdZBDBIvwv2OPRpJ24QjJwUg%3D%3D";
        
        //410160010625053
        //690723
        //http://apis.data.go.kr/1543061/animalInfoSrvc/animalInfo?dog_reg_no=410160010625053&owner_birth=690723&serviceKey=k8%2Bvf8egiEvlVDfF5B4oeSKbMZ3qkrNw3e7Gp%2FVhYpo1rhXRdA2V%2FCw3Wywn1BNdZBDBIvwv2OPRpJ24QjJwUg%3D%3D
        
        //각각의 정보를 넣어줍니다.
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1543061/animalInfoSrvc/animalInfo"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=" + serviceKey); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("dog_reg_no","UTF-8") + "=" + URLEncoder.encode("410000001513331", "UTF-8")); /*동물등록번호 또는 RFID코드 필수*/
        urlBuilder.append("&" + URLEncoder.encode("rfid_cd","UTF-8") + "=" + URLEncoder.encode("410000000227825", "UTF-8")); /*동물등록번호 또는 RFID코드 필수*/
        urlBuilder.append("&" + URLEncoder.encode("owner_nm","UTF-8") + "=" + URLEncoder.encode("홍길동", "UTF-8")); /*소유자 성명 또는 생년월일 필수*/
        urlBuilder.append("&" + URLEncoder.encode("owner_birth","UTF-8") + "=" + URLEncoder.encode("011111", "UTF-8")); /*소유자 성명 또는 생년월일 필수*/
        urlBuilder.append("&" + URLEncoder.encode("_type","UTF-8") + "=" + URLEncoder.encode(" ", "UTF-8")); /*xml(기본값) 또는 json*/
        
        //나중에 사용할 map을 선언해줍니다.
        Map<String, Object> map = new HashMap<String, Object>();
        
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        
        //getResponseCode가 20n0이상 300이하일때는 정상적으로 작동합니다.
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
        url =null;
        //StringBuilder로 위에 파라미터 더 한값을 toString으로 불러옵니다.
        //그리고 println으로 확인을 하면 xml형식이 나오게됩니다.
        System.out.println(sb.toString());
    }

}









