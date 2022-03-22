package com.project;

import java.beans.Statement;
import java.sql.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class DatabaseMethod {
	public static void dataBase(String sql) {
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
