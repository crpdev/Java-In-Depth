package com.crpdev.thrillio;

import com.crpdev.thrillio.entities.Bookmark;
import com.crpdev.thrillio.entities.User;
import com.crpdev.thrillio.managers.BookmarkManager;
import com.crpdev.thrillio.managers.UserManager;

public class Launch {

	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {

		System.out.println("1. Loading Data...");
		DataStore.loadData();

		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();

		System.out.println("Printing data...");
		printUserData();
		printBookmarkData();
	}

	private static void printBookmarkData() {
		for (User user : users) {
			System.out.println(user);
		}
	}

	private static void printUserData() {
		for (Bookmark[] bookmarklist : bookmarks) {
			for (Bookmark bookmark : bookmarklist) {
				System.out.println(bookmark);
			}

		}

	}
	

	private static void startBookmarking() {
		System.out.println("\n2. Bookmarking...");
		for (User user: users) {
			View.bookmark(user, bookmarks);
		}
		
	}


	public static void main(String[] args) {

		loadData();
		startBookmarking();

	}

}
