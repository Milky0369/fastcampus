package treeset;

import java.util.Objects;

public class MemberCompare implements Comparable<MemberCompare>{

    private int memberId;
    private String memberName;

    public MemberCompare() {}
    public MemberCompare(int memberId, String memberName){
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
    public boolean equals(Object o) {
        if(o instanceof MemberCompare){
            MemberCompare memberCompare = (MemberCompare)o;
            return (this.memberId == memberCompare.memberId);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberName);
    }

    @Override
    public int compareTo(MemberCompare memberCompare) {
        // return (this.memberId - member.memberId); // 오름차순 정렬
        // return (this.memberId - member.memberId) * (-1); // 내림차순 정렬
        return this.memberName.compareTo(memberCompare.getMemberName()); // 이름으로 정렬
    }
}
