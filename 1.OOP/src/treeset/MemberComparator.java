package treeset;

import java.util.Comparator;
import java.util.Objects;

public class MemberComparator implements Comparator<MemberComparator> {

    private int memberId;
    private String memberName;

    public MemberComparator() {}
    public MemberComparator(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int compare(MemberComparator member1, MemberComparator member2) { // 첫번째 매개변수가 this, 두번째는 compare와 같은 매개변수
        return member1.memberId - member2.memberId;
    }

}