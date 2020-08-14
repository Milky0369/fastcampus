package collection.hashmap;

import collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){

        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }

        return false;
    }

    public void showAllMember(){

        Iterator<Integer> ir = hashMap.keySet().iterator(); // 중복이 제거된 값이 반환
        // hashMap.values(); // 중복 포함 값이 반환된다.

        while(ir.hasNext()){

            int key = ir.next();

            Member member = hashMap.get(key);

            System.out.println(member);

        }

    }

}
