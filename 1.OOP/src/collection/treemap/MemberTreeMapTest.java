package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

    public static void main(String[] args) {

        MemberTreeMap manager = new MemberTreeMap();

        Member memberLee = new Member(1, "이순신");
        Member memberKim = new Member(2, "김유신");
        Member memberPark = new Member(3, "박혁거세");
        // HashSet 에서 객체에 대한 논리적 검증이 필요함.
        Member memberPark2 = new Member(3, "박혁거세 중복임");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2);

        manager.showAllMember();

        manager.removeMember(1);

        manager.showAllMember();

    }
    
}
