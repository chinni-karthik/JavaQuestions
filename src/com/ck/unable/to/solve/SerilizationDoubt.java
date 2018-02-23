package com.ck.unable.to.solve;

public class SerilizationDoubt {

		/*
		How De-serialization  works in Java???
		1-Deserialization  means converting the object which was previously converted into byte stream , as part of serialization, back into object form.
		2-in simple terms, converting the content in abc.ser into a java object step by step.
		3-The input for Deserialization  is content in abc.ser (we get form file system or database.)
		4-But, what is present in abc.ser?? just nothing but meta data of class created during serialization. instance fields types and values as well.
		5-jvm first reads byte stream and tells if this is byte stream of a serilizatiable class or not.
		6-all parents of serilizable class should be serilizable. else they should have default constructor.now, control comes till object class and if middle any class is not serilizable, then throw NonSerilizableException.
		7-If all goes fine, then blank instance is created.
		8-Now is the important step : if serial version uid mismatches, then object reconstruction is halted and InvalidClassException is raised.
		9-now, readObject() is called which is responsible to convert byte steam into the java object by setting values to blank object.

		Thats it...!!!
		*/
	
		/*
		Q-What happens to transient variables during De-serialization??
		To put it in simpler words, if an object is being written to a byte stream then all transient variables will be ignored.
		*/
	
}
