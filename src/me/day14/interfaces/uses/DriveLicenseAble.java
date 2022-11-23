package me.day14.interfaces.uses;

public interface DriveLicenseAble { // 분류 기준만 제공
    int a = 0;
    // static final 생략 가능
    // 함수를 구현하는 중에 함수 내에서 특정 값이 필요할 수 있음
    // 해당 분류 기준에 의해 분류된 객체들에 공통된 상수값을 제공할 수도 있음

    ///////////////////////////////////////////////////////////////////////////
    // 인터페이스랑 (추상) 클래스 차이점
    // - (추상) 클래스: 객체를 만들기 위함, (데이터 + 함수) --> 자식들한테 제공
    // - 인터페이스: 객체를 다른 기준에 의해 분류하기 위함 (기능) (분류 후 메소드 제공, 상수값 제공)
    ///////////////////////////////////////////////////////////////////////////

    void renew();
    default void renew2() {
        System.out.println("Renew2()");
    }
    // abstract 생략 가능
    // 무조건 구현 클래스에서 재정의 해야함 (추상 메소드로 정의)


    // Java 8+
    default void renew1() { // 재정의를 해도 되고 안해도 되는 함수
        System.out.println("Renew Your License....");
    }
    static void staticMethod() { // 인터페이스 안에 살고 있는 함수 (구현 클래스에서 재정의 불가능)
        System.out.println("Static Method");
    }

}
