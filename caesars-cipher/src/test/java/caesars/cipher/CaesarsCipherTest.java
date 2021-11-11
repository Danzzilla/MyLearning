package caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest {

	private CaesarsCipher caesarsCipher = new CaesarsCipher();
	
	@Test
	void testCipheredMessageWithOffsetOf12(){
		assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString(){
		assertEquals("", caesarsCipher.cipher("", 12));
	}

	@Test
	void testCipheredMessageWithOffsetOf11(){
		assertEquals("szh lcp jzf oztyr ezolj", caesarsCipher.cipher("how are you doing today", 11));
	}
}
