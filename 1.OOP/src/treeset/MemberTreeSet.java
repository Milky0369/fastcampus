package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<MemberCompare> hashSet;

    public MemberTreeSet(){
        hashSet = new TreeSet<MemberCompare>();
    }

    public void addMember(MemberCompare memberCompare){
        hashSet.add(memberCompare);
    }

    public boolean removeMember(int memberId){

        Iterator<MemberCompare> ir = hashSet.iterator();

        while(ir.hasNext()){
            MemberCompare memberCompare = ir.next();

            if(memberCompare.getMemberId() == memberId){
                hashSet.remove(memberCompare);

                return true;
            }
        }

        System.out.println(memberId + "번호가 존재하지 않습니다.");

        return false;

    }

    public void showAllMember(){

        for(MemberCompare memberCompare : hashSet){
            System.out.println(memberCompare);
        }

        System.out.println();

    }

}
