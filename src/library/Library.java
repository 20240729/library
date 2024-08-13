package library;

public class Library {
    // 클래스 속성
    String title = "";
    String author = "";
    boolean isAvailable = false;

    // 클래스 생성자
    public Library(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // 메서드

    // 제목 조회
    public String getTitle() {
        return title;
    }

    // 대여 여부 조회
    public boolean getIsAvailable() {
        return isAvailable;
    }

    // 대여 여부 설정
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // 책 상세 정보 출력
    public void printBookInfo(){
        System.out.println(title);
        System.out.println(author);
        if(isAvailable){
            System.out.println("대여 가능");
        }else {
            System.out.println("대여 불가능");
        }
    }

}
