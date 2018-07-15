package com.crpdev.thrillio.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.crpdev.thrillio.constants.MovieGenre;
import com.crpdev.thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsKidFriendlyEligible() {
//		Test1: if the movie genre is horror thriller: return false
		
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.HORROR,
				8.5);
		boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse("For horror or thriller genre isKidFriendlyEligible must return false", isKidFriendlyEligible);
		
//		Test2: Other genre - return true
		
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.CLASSICS,
				8.5);
		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertTrue("For other genre isKidFriendlyEligible must return true", isKidFriendlyEligible);
			
	}

}
