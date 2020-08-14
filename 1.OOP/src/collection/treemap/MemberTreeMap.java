package collection.treemap;

import collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberTreeMap {

    private HashMap<Integer, Member> treeMap;

    public MemberTreeMap(){
        treeMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){

        if(treeMap.containsKey(memberId)){
            treeMap.remove(memberId);
            return true;
        }

        return false;
    }

    public void showAllMember(){

        Iterator<Integer> ir = treeMap.keySet().iterator(); // 중복이 제거된 값이 반환

        while(ir.hasNext()){

            int key = ir.next();

            Member member = treeMap.get(key);

            System.out.println(member);

        }

    }

}
