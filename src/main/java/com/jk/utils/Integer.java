package com.jk.utils;

public class Integer {

    public  static void getInteger(){

        for (int i=1;i<999999 ;i++ ){
            String code=i+"";
            int leng=(code.trim()).length();
            if(leng==1){
                code="00000"+i;
            }else if(leng==2){
                code="0000"+i;
            }else if(leng==3){
                code="000"+i;
            }else if(leng==4){
                code="00"+i;
            }else if(leng==5){
                code="0"+i;
            }
            System.out.println("code:"+code);
        }

    }

}


