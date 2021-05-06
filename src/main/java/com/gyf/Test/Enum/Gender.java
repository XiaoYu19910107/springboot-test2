package com.gyf.Test.Enum;

/**
 * @author xiaoyu
 * @date 2021/04/29 17:32:57
 */
enum Gender {
   MALE("男"),FEMALE("女");
   private String sex;
   private  Gender(String sex){
      this.sex = sex;
   }
   @Override
    public String toString(){
       return sex;
   }
}
class T1{
    public static void main(String[] args) {
        Gender g = Gender.MALE;
        System.out.println(g);

    }
}