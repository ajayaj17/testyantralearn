package com.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.sound.sampled.AudioInputStream;

public class DataTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/musicfiles","root","root");
			AudioInputStream stream;
			java.sql.Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("insert into musicfiles values (1,\"Ed_Sheeran_-_Shape_of_You.m4a \",\"Ed-sheeran\",\"mysong\",\"E:\b song\",\"this is try\")");
//			stream=AudioSystem.getAudioInputStream(new file().getAbsolutePath())
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
