import library.Book;
import library.Library;

public class Main {
    public static void main(String[] args) {
        // 도서관 객체 생성
        Library library = new Library();

        // 책 객체 4개 생성
        Book bookA = new Book("제목1","작가1",true);
        Book bookB = new Book("제목2","작가2",true);
        Book bookC = new Book("제목3","작가3",true);
        Book bookD = new Book("제목4","작가4",true);

        // 도서관에 책 추가
        library.addBook(bookA);
        library.addBook(bookB);
        library.addBook(bookC);
        library.addBook(bookD);

        // 도서관에서 책 제거
        library.removeBook(bookD);

        // 도서관의 모든 책 출력
        library.printAllBooks();

        // 도서관에서 책 대여
        library.rentBook(bookA);
        //대여 처리 되었는지 확인용
        System.out.println("절취선================================================");
        library.searchBook("제목1");
        System.out.println("절취선================================================");


        // 도서관에서 책 반납
        library.returnBook(bookA);





    }
}