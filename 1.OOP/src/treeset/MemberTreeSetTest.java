package treeset;

public class MemberTreeSetTest {

    public static void main(String[] args) {

        MemberTreeSet manager = new MemberTreeSet();

        MemberCompare memberCompareLee = new MemberCompare(1, "이순신");
        MemberCompare memberCompareKim = new MemberCompare(2, "김유신");
        MemberCompare memberComparePark = new MemberCompare(3, "박혁거세");
        // HashSet 에서 객체에 대한 논리적 검증이 필요함.
        MemberCompare memberComparePark2 = new MemberCompare(3, "박혁거세 중복임");

        manager.addMember(memberCompareLee);
        manager.addMember(memberCompareKim);
        manager.addMember(memberComparePark);
        manager.addMember(memberComparePark2);

        manager.showAllMember();

        manager.removeMember(1);

        manager.showAllMember();

    }

}
