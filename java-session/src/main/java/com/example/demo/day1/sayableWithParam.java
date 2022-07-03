package com.example.demo.day1;


interface Sayableparam{
	public String Say(String name );
}

public class sayableWithParam {

	public static void main(String[] args) {
		Sayableparam s = (name)->{
			return "sayable with parameter is executing with name : "+name;
		};
		
		System.out.println(s.Say("Shrutika"));

	}

}
