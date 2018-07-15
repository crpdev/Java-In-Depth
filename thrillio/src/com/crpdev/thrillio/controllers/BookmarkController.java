package com.crpdev.thrillio.controllers;

import com.crpdev.thrillio.entities.Bookmark;
import com.crpdev.thrillio.entities.User;
import com.crpdev.thrillio.managers.BookmarkManager;

public class BookmarkController {

	private static BookmarkController instance = new BookmarkController();

	private BookmarkController() {
	}

	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().saveUserBookmark(user, bookmark);

	}

}
