package com.nagarro.AdvanceJavaAssignment3;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.data.*;
import com.nagarro.data.Tshirt;
import com.nagarro.search.TshirtCsv;
import com.nagarro.searchip.TshirtSearchIp;
import com.nagarro.view.Input;
import com.nagarro.view.Output;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		Input input = new Input();
		TshirtSearchIp tshirtSearchIp = input.getInput();

		TshirtCsv t = new TshirtCsv();
		t.run();

		Configure configure = new Configure();

		Color color = tshirtSearchIp.getColor();
		String colorStr = color.toString();

		Gender gender = tshirtSearchIp.getGender();
		String genderStr = gender.toString();

		Size size = tshirtSearchIp.getSize();
		String sizeStr = size.toString();
		
		OutputPreference op = tshirtSearchIp.getOutputPreference();

		List<Tshirt> res = new ArrayList<Tshirt>();

		res = configure.searchItem(colorStr, genderStr, sizeStr,op);
		
		System.out.println("Search Results:");

		if (res.isEmpty()) {
			System.out.println("No T-shirt is available.");
		} else {
			Output output1 = new Output();
			output1.displayOutput(res);
		}
	}
}