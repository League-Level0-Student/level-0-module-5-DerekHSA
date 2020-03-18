package _03_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		
String name=JOptionPane.showInputDialog("What's your name??");
for (int i = 0; i < name.length(); i++) {
	String letter=name.substring(i,i+1);
if(i%2==0) {
	goofyName+=letter.toUpperCase();
}}
JOptionPane.showMessageDialog(null,goofyName);
	}}

