package com.biz.classex;

import com.biz.classex.children.CatClass;
import com.biz.classex.children.DogClass;
import com.biz.classex.parents.AnimalClass;

public class ClassExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogClass dog = new DogClass();
		CatClass cat = new CatClass();
		
		AnimalClass aniClass = new AnimalClass();
		aniClass.strName = "포유류";
		aniClass.whatIsName();
		
		dog.strName = "몽이";
		dog.whatIsName();
		dog.strColor = "white";
		dog.whatIsColor();
		
		cat.strName = "랑이";
		cat.whatIsName();

		
	}

}
