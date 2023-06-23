package test;
//lombok을 lib에 넣으면 
//@Getter 와 @Setter를 넣으면 임포트가 된다
//Dog d = new Dog 오류나는데 @AllArgsConstructor하면 됨
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
class Dog{
    private String name;
    private int age;
}
public class LomTest {
public static void main(String[] args) {
    Dog d = new Dog("강아지", 10);
    d.setName("이름변경");
    System.out.println(d.getName());
}
    
}
