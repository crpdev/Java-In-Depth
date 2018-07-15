package com.crpdev.thrillio.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.crpdev.thrillio.constants.BookGenre;
import com.crpdev.thrillio.managers.BookmarkManager;

class BookTest {

	@Test
	void testIsKidFriendlyEligible() {
//		Test1:For philosophy and self help isKidFriendlyEligible must return false

		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		boolean isKidFriendlyEligible = book.isKidFriendlyEligible();

		assertFalse("For philosophy and self help isKidFriendlyEligible must return false", isKidFriendlyEligible);

//		Test 2: For others isKidFriendlyEligible must return true

		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.ART, 4.3);
		isKidFriendlyEligible = book.isKidFriendlyEligible();

		assertTrue("For others isKidFriendlyEligible must return false", isKidFriendlyEligible);

	}

}
