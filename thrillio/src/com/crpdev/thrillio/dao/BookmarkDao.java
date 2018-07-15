package com.crpdev.thrillio.dao;

import com.crpdev.thrillio.DataStore;
import com.crpdev.thrillio.entities.Bookmark;
import com.crpdev.thrillio.entities.UserBookmark;

public class BookmarkDao {

	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {

		DataStore.add(userBookmark);

	}
}
