package com.ogutdeniz.creationalpatterns.singelton;

public class SingeltonTest {
    public static void main(String[] args) {
        EagerSingelton eagerSingelton1 = EagerSingelton.getInstance();
        EagerSingelton eagerSingelton2 = EagerSingelton.getInstance();

        System.out.println(eagerSingelton1.hashCode() == eagerSingelton2.hashCode());

        LazySingelton lazySingelton1 = LazySingelton.getInstance();
        LazySingelton lazySingelton = LazySingelton.getInstance();

        System.out.println(lazySingelton1.hashCode() == lazySingelton.hashCode());

        ThreadSafeSingelton threadSafeSingelton1 = ThreadSafeSingelton.getInstance();
        ThreadSafeSingelton threadSafeSingelton2 = ThreadSafeSingelton.getInstance();

        System.out.println(threadSafeSingelton1.hashCode() == threadSafeSingelton2.hashCode());

        DoubleCheckingLockingSingelton doubleCheckingLockingSingelton1 = DoubleCheckingLockingSingelton.getInstance();
        DoubleCheckingLockingSingelton doubleCheckingLockingSingelton2 = DoubleCheckingLockingSingelton.getInstance();

        System.out.println(doubleCheckingLockingSingelton1.hashCode() == doubleCheckingLockingSingelton2.hashCode());

        EnumSingelton enumSingleton1 = EnumSingelton.INSTANCE;
        EnumSingelton enumSingleton2 = EnumSingelton.INSTANCE;
        System.out.println(enumSingleton1.hashCode() == enumSingleton2.hashCode());
    }
}
