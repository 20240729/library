package library;

import java.util.ArrayList;

public class Library {
    // 클래스 속성
    ArrayList<Book> booklist = new ArrayList<Book>();

    // 생성자(책 목록 초기화 필요) <== 질문할 내용 : 초기화는 바로 위에서 된 것 아닌가요 ㅠㅠ
    // 잘 모르겠습니다...
    /*public Library(ArrayList<Book> books) {
        this.booklist = books;
    }*/

    // 메서드
    // 도서관에 책 추가
    public void addBook(Book book) {
        booklist.add(book);
    }

    // 도서관에서 책 제거
    public void removeBook(Book book) {
        booklist.remove(book);
    }

    // 도서관에서 책 이름으로 검색
    public void searchBook(String title) {
        for (Book book : booklist) {
            if (book.getTitle().equals(title)) {
                book.printBookInfo();
            }
        }
    }

    // 도서관의 모든 책 조회
    public void printAllBooks() {
        for (Book book : booklist) {
            book.printBookInfo();
        }
    }

    // 도서관에서 책 대여
    public void rentBook (Book book){
        if(book.getIsAvailable()){
            book.setIsAvailable(false);
        }else {
            System.out.println("이미 대여중인 도서입니다.");
        }
    }

    // 도서관에서 책 대여
    public void returnBook (Book book){
        if(book.getIsAvailable()){
            System.out.println("이미 반납된 도서입니다.");
        }else {
            book.setIsAvailable(true);
        }
    }






}
