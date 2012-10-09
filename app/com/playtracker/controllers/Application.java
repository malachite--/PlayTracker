package com.playtracker.controllers;

import play.mvc.Controller;
import play.mvc.Result;

import com.playtracker.views.html.test;

public class Application extends Controller {

	public static Result test() {
		return ok(test.render("This is a test."));
	}

	public static Result test2() {
		return ok(test.render("This is another test."));
	}
}