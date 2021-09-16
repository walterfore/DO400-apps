@Test
public void checkingOutUnavailableBookThrowsException()
	throws BookNotAvailableException {
	// Given
 inventory.add(new Book("book1"));
 inventory.add(new Book("book1"));
 library.checkOut("student1", "book1");
 library.checkOut("student2", "book1");
 // When
 final BookNotAvailableException exception = assertThrows(
 BookNotAvailableException.class,
 () -> {
 library.checkOut("student3", "book1");
  }
 );
 // Then
 assertTrue(exception.getMessage().matches("Book book1 is not available"));
 }
