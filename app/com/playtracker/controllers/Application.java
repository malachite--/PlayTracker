package com.playtracker.controllers;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import com.playtracker.model.User;
import com.playtracker.views.html.test;

public class Application extends Controller {

	@Transactional
	public static Result test() {
		User u = JPA.em().find(User.class, 1L);
		return ok(test.render(u == null ? "MIMI" : u.getUsername()));
	}

	public static Result test2() {
		return ok(test.render("This is another test."));
	}
}